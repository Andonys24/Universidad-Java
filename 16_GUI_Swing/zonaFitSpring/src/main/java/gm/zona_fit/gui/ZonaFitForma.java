package gm.zona_fit.gui;

import gm.zona_fit.service.ClienteService;
import gm.zona_fit.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class ZonaFitForma extends JFrame {
    private JPanel panelPrincipal;
    IClienteService clienteService;


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
}
