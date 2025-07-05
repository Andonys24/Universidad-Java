package gm.zona_fit.gui;

import gm.zona_fit.service.ClienteService;
import gm.zona_fit.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;

public class ZonaFitForma {
    private JPanel panelPrincipal;
    IClienteService clienteService;


    public ZonaFitForma(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
}
