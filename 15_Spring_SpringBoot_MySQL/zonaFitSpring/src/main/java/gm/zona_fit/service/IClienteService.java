package gm.zona_fit.service;

import java.util.List;

import gm.zona_fit.model.Cliente;

public interface IClienteService {
    public List<Cliente> listatClientes();

    public Cliente buscarClienteId(Integer idCliente);

    public void guardarCliente(Cliente cliente);

    public void eliminarCliente(Cliente cliente);

}
