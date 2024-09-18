/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Santiago Lara
 */
public class Tp5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DirectorioTelefonico directorio = new DirectorioTelefonico();
        TreeMap<Long, Cliente> contactos = new TreeMap();
        Cliente cliente1 = new Cliente(84576877, "Jon", "Cuello", "Villa Mercedes", "9 de Julio 3423");
        Cliente cliente2 = new Cliente(83576877, "Santiago", "Lara", "La Punta", "Rivadavia 4321");
        Cliente cliente3 = new Cliente(82457654, "Franco", "Herrera", "Santa Rosa", "San Martín 2345");
        Cliente cliente4 = new Cliente(84586754, "Rodrigo", "Guerrero", "Villa Mercedes", "Ardiles 1856");
        Cliente cliente5 = new Cliente(84865656, "Gabriel", "Jara", "Villa Mercedes", "Belgrano 1534");

        contactos.put(2657111111L, cliente1);
        contactos.put(2657222222L, cliente2);
        contactos.put(2657333333L, cliente3);
        contactos.put(2657444444L, cliente4);
        contactos.put(2657555555L, cliente5);
        
        System.out.println("::: LISTADO ACTUAL :::");
        directorio.setListaDeContactos(contactos);
        System.out.println(directorio.getListaDeContactos());
        
        System.out.println("");
        //PRUEBA DE AGREGAR CONTACTO - SE AGREGA UN CLIENTE EXISTENTE CON OTRO NÚMERO
        System.out.println("::: AGREGANDO CONTACTO - MÉTODO A");
        directorio.agregarContacto(2664289786L, cliente3);
        System.out.println(directorio.getListaDeContactos());
        System.out.println("");
        
        //PRUEBA DE BUSCAR CONTACTO
        System.out.println("::: BUSCAR CONTACTO POR TELÉFONO - MÉTODO B");
        System.out.println(directorio.buscarContacto(2657111111L));
        System.out.println("");
        
        //PRUEBA DE BUSCAR TELÉFONO
        System.out.println("::: BUSCAR TELÉFONO POR APELLIDO - MÉTODO C");
        System.out.println(directorio.buscarTelefono("Herrera"));
        System.out.println("");
        
        //PRUEBA DE BUSCAR CONTACTOS A PARTIR DE CIUDAD
        System.out.println("::: BUSCAR CONTACTOS :::");
        System.out.println(directorio.buscarContactos("Villa Mercedes"));
        System.out.println("");
        
        //PRUEBA DE BORRAR CONTACTO POR NÚMERO DE TELÉFONO
        System.out.println("::: BORRAR CONTACTO :::");
        directorio.borrarContacto(2657555555L); //Se borra a Gabriel Jara
        System.out.println(contactos);
        System.out.println("");
    }

}
