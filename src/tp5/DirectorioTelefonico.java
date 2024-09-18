
package tp5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * asdad
 *
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

    public void setListaDeContactos(TreeMap<Long, Cliente> listaDeContactos) {
        this.listaDeContactos = listaDeContactos;
    }

    public void agregarContacto(Long numero, Cliente cliente) {
        this.listaDeContactos.put(numero, cliente);
    }

    public Cliente buscarContacto(Long numero) {
        return this.listaDeContactos.get(numero);

    }

    public Set<Long> buscarTelefono(String apellido) {
        Iterator<Map.Entry<Long, Cliente>> it = listaDeContactos.entrySet().iterator();
        TreeMap<Long, Cliente> filtro = new TreeMap();

        while (it.hasNext()) {
            Map.Entry<Long, Cliente> par = it.next();

            if (apellido.equalsIgnoreCase(par.getValue().getApellido())) {
                filtro.put(par.getKey(), par.getValue());
            }
        }
        return filtro.keySet();
    }

    public ArrayList<Cliente> buscarContactos(String ciudad) {
        ArrayList<Cliente> contactos = new ArrayList();
        Iterator<Map.Entry<Long, Cliente>> it = listaDeContactos.entrySet().iterator();
        
        while (it.hasNext()){
            Map.Entry<Long, Cliente> par = it.next();
            if (ciudad.equalsIgnoreCase(par.getValue().getCiudad())) {
                contactos.add(par.getValue());
            }
        }
        return contactos;
    }

    public void borrarContacto(Long telefono) {
        this.listaDeContactos.remove(telefono);
    }
}
