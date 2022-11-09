/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.dao;

import com.tienda.domain.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jostin Pizarro
 */
public interface ClienteDao extends JpaRepository<Cliente, Long>{
    
    //consultas ampliadas de JPA
    
    public List<Cliente> findByNombre(String nombre);
    
    public List<Cliente> findByApellidos(String apellidos);
    
    public List<Cliente> findByCorreo(String correo);
    
    public List<Cliente> findByTelefono(String telefono);
    
    
    
    
    
}
