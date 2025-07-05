package gm.zona_fit.gui;

import gm.zona_fit.model.Cliente;
import gm.zona_fit.service.ClienteService;
import gm.zona_fit.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@Component
public class ZonaFitForma extends JFrame {
    private JPanel panelPrincipal;
    private JPanel panelBotones;
    private JPanel panelTabla;
    private JPanel panelDatosCliente;
    private JTable clientesTabla;
    private JTextField nombreTexto;
    private JTextField apellidoTexto;
    private JTextField membresiaTexto;
    private JButton guardarButton;
    private JButton eliminarButton;
    private JButton limpiarButton;
    IClienteService clienteService;
    private DefaultTableModel tablaModeloClientes;
    private Integer idcliente;


    @Autowired
    public ZonaFitForma(ClienteService clienteService) {
        this.clienteService = clienteService;
        iniciarForma();
        guardarButton.addActionListener(e -> guardarCliente());
        clientesTabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                cargarClienteSeleccionado();
            }
        });
        eliminarButton.addActionListener(e -> {
            eliminarCliente();
        });
        limpiarButton.addActionListener(e -> {
            limpiarFormulario();

        });
    }

    private void iniciarForma() {
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700); // Tamano ventana
        setLocationRelativeTo(null); // Centrar ventana
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        this.tablaModeloClientes = new DefaultTableModel(0, 4);
        String[] cabeceros = {"ID", "Nombre", "Apellido", "Membresia"};
        this.tablaModeloClientes.setColumnIdentifiers(cabeceros);
        this.clientesTabla = new JTable(tablaModeloClientes) {
            // Evitar q el usuario pueda modificar la tabla
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        this.clientesTabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Cargar listado de clientes
        listarClientes();
    }

    private void listarClientes() {
        this.tablaModeloClientes.setRowCount(0); // Iniciar conteo en 0
        var clientes = this.clienteService.listatClientes();

        clientes.forEach(cliente -> {
            Object[] renglonCliente = {
                    cliente.getId(), cliente.getNombre(),
                    cliente.getApellido(), cliente.getMembresia()
            };
            this.tablaModeloClientes.addRow(renglonCliente);
        });
    }

    private void guardarCliente() {

        if (nombreTexto.getText().equals("")) {
            mostrarMensaje("Proporciona un nombre");
            nombreTexto.requestFocusInWindow();
            return;
        }
        var nombre = nombreTexto.getText();


        if (apellidoTexto.getText().equals("")) {
            mostrarMensaje("Proporciona un Apellido");
            apellidoTexto.requestFocusInWindow();
            return;
        }
        var apellido = apellidoTexto.getText();


        if (membresiaTexto.getText().equals("")) {
            mostrarMensaje("Proporciona una membresia");
            membresiaTexto.requestFocusInWindow();
            return;
        }

        int membresia;

        try {
            membresia = Integer.parseInt(membresiaTexto.getText());
        } catch (NumberFormatException ex) {
            mostrarMensaje("Error: La membresia no es valida");
            membresiaTexto.requestFocusInWindow();
            return;
        } catch (Exception ex) {
            mostrarMensaje("Error Desconocido");
            membresiaTexto.requestFocusInWindow();
            return;
        }

        // Recuperar Informacion
        var cliente = new Cliente(idcliente, nombre, apellido, membresia);

        this.clienteService.guardarCliente(cliente);

        if (idcliente == null) {
            mostrarMensaje("Se Guardo el nuevo Cliente");
        } else {
            mostrarMensaje("Datos del cliente actualizados!!");
        }

        limpiarFormulario();
        listarClientes();
    }

    private void limpiarFormulario() {
        nombreTexto.setText("");
        apellidoTexto.setText("");
        membresiaTexto.setText("");
        idcliente = null;

        // Deseleccionar el registo
        this.clientesTabla.getSelectionModel().clearSelection();
    }

    private void mostrarMensaje(final String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    private void cargarClienteSeleccionado() {
        var renglo = clientesTabla.getSelectedRow();

        if (renglo == -1) { // -1 significa q no selecciono ningun registro
            return;
        }

        var id = clientesTabla.getModel().getValueAt(renglo, 0).toString();
        this.idcliente = Integer.parseInt(id);
        var nombre = clientesTabla.getModel().getValueAt(renglo, 1).toString();
        this.nombreTexto.setText(nombre);
        var apellido = clientesTabla.getModel().getValueAt(renglo, 2).toString();
        this.apellidoTexto.setText(apellido);
        var membresia = clientesTabla.getModel().getValueAt(renglo, 3).toString();
        this.membresiaTexto.setText(membresia);
    }

    private void eliminarCliente() {
        var renglon = clientesTabla.getSelectedRow();
        if (renglon == -1) {
            mostrarMensaje("Debe seleccionar un cliente para eliminar");
            return;
        }

        var idClienteStr = clientesTabla.getModel().getValueAt(renglon, 0).toString();
        try {
            this.idcliente = Integer.parseInt(idClienteStr);
            var cliente = new Cliente();
            cliente.setId(this.idcliente);

            clienteService.eliminarCliente(cliente);
            mostrarMensaje("Cliente con el id " + this.idcliente + " eliminado");
        } catch (NumberFormatException ex) {
            mostrarMensaje("Error el tipo de dato del id no es valido: " + ex.getMessage());
        } catch (Exception ex) {
            mostrarMensaje("Error, mensaje desconocido: " + ex.getMessage());
        }
        limpiarFormulario();
        listarClientes();
    }
}
