
package com.tienda.service;

import com.tienda.domain.Cliente;
import java.util.List;

public interface ClienteService {
    
    //metodos para hacer CRUD de cliente
    
    public List<Cliente> getClientes();
    
    public Cliente getCliente(Cliente cliente);
    
    public void save(Cliente cliente);
    
    public void delete(Cliente cliente);
    
    public List<Cliente> buscarPorNombre(String nombre);
    
    public List<Cliente> buscarPorApellidos(String apellidos);
    
    
}
