package gm.zona_fit.gui;

import gm.zona_fit.service.ClienteService;
import gm.zona_fit.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

@Component
public class ZonaFitForma extends JFrame {
    private JPanel panelPrincipal;
    private JPanel panelBotones;
    private JPanel panelTabla;
    private JPanel panelDatosCliente;
    private JTable clientesTabla;
    IClienteService clienteService;
    private DefaultTableModel tablaModeloClientes;


    @Autowired
    public ZonaFitForma(ClienteService clienteService) {
        this.clienteService = clienteService;
        iniciarForma();
    }

    private void iniciarForma() {
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700); // Tamano ventana
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
}
