/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author Jostin Pizarro
 */
public class Encriptar {
    public static void main(String[] args){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        var claveJuan=encoder.encode("123");
        var claveRebeca=encoder.encode("456");
        var clavePedro=encoder.encode("789");
        
        System.out.println("juan " +claveJuan);
        System.out.println("rebeca" +claveRebeca);
        System.out.println("pedro "+clavePedro);
    }
}
