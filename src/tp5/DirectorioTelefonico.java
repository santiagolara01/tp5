/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *asdad
 * @author Santiago Lara
 */
public class DirectorioTelefonico {
    private TreeMap<Long, Cliente> listaDeContactos;

    public DirectorioTelefonico() {
        this.listaDeContactos = new TreeMap();
        FormularioContacto formulario = new FormularioContacto(this);
        formulario.setVisible(true);
    }

    public TreeMap<Long, Cliente> getListaDeContactos() {
        return listaDeContactos;
    }
    
    public void agregarContacto(Long numero, Cliente cliente){
        this.listaDeContactos.put(numero, cliente);
    }
       
    public Cliente buscarContacto(Long numero){
    return this.listaDeContactos.get(numero);
    
    }
    public Set<Long> buscarTelefono(String apellido){
         Iterator<Map.Entry<Long, Cliente>> entryIterator = listaDeContactos.entrySet().iterator();
        TreeMap<Long, Cliente> filtro = new TreeMap();
        
        while (entryIterator.hasNext()) {
            Map.Entry<Long, Cliente> entry = entryIterator.next();
            
            if (apellido.equalsIgnoreCase(entry.getValue().getApellido())) {
                filtro.put(entry.getKey(),entry.getValue());
                
            }
        }
        return filtro.keySet();
    }
    public ArrayList <Cliente> buscarContactos(){
        
    }
    public void borrarContacto(){
    
}
}
