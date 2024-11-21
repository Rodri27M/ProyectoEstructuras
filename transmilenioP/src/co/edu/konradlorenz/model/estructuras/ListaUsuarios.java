
package co.edu.konradlorenz.model.estructuras;

import co.edu.konradlorenz.model.Usuario;
import java.util.Hashtable;


public class ListaUsuarios {
 private Hashtable<Integer, Usuario> usuarios = new Hashtable<>();

    public ListaUsuarios() {
    }

    public ListaUsuarios(Hashtable<Integer, Usuario> usuarios) {
        this.usuarios = new Hashtable<>();
    }
    
    public void agregarUsuario(Usuario usuario){
        usuarios.put(usuario.getId(), usuario);
    }
   
    public Usuario obtenerUsuario(int id){
        return usuarios.get(id);
    }
    
    public void eliminar(int id){
        usuarios.remove(id);
    }

    public Hashtable<Integer, Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Hashtable<Integer, Usuario> usuarios) {
        this.usuarios = usuarios;
    }
 
    
    
}
