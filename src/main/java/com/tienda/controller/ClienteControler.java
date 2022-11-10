package com.tienda.controller;

import com.tienda.domain.Cliente;
import com.tienda.service.ClienteService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Jostin Pizarro
 */
@Controller
@Slf4j
public class ClienteControler {

    @Autowired
    private ClienteService clienteService;


    
    @GetMapping("/cliente/busqueda")
    public String buscarApellido(Model model,@Param("apellidos")String apellidos) {
              
        var clientes=clienteService.buscarPorApellidos(apellidos);
        model.addAttribute("clientes", clientes);
        
        return "/cliente/listado";
    }
    
    @GetMapping("/cliente/buscar")
    public String buscar(Cliente cliente){
        return "/cliente/busqueda";
    }
    

    @GetMapping("/cliente/listado")
    public String listado(Model model) {
        var clientes = clienteService.getClientes();
        //var clientes=clienteService.buscarPorNombre("Ana");
        model.addAttribute("clientes", clientes);
        return "/cliente/listado";
    }

    @GetMapping("/cliente/nuevo")
    public String clienteNuevo(Cliente cliente) {
        return "/cliente/modificar";
    }

    @PostMapping("/cliente/guardar")
    public String clienteGuardar(Cliente cliente) {
        clienteService.save(cliente);
        return "redirect:/cliente/listado";
    }

    @GetMapping("/cliente/modificar/{idCliente}")//
    public String clienteModificar(Cliente cliente, Model model) {
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente", cliente);
        return "/cliente/modificar";
    }

    @GetMapping("/cliente/eliminar/{idCliente}")//
    public String clienteEliminar(Cliente cliente) {
        clienteService.delete(cliente);
        return "redirect:/cliente/listado";
    }
}