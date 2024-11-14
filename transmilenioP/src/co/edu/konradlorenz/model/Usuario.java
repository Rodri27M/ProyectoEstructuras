
package co.edu.konradlorenz.model;


public class Usuario {
    private String id;
    private boolean accesoAutorizado;
    private String tipoUsuario;

    public Usuario() {
    }

    public Usuario(String id, boolean accesoAutorizado, String tipoUsuario) {
        this.id = id;
        this.accesoAutorizado = accesoAutorizado;
        this.tipoUsuario = tipoUsuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isAccesoAutorizado() {
        return accesoAutorizado;
    }

    public void setAccesoAutorizado(boolean accesoAutorizado) {
        this.accesoAutorizado = accesoAutorizado;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", accesoAutorizado=" + accesoAutorizado + ", tipoUsuario=" + tipoUsuario + '}';
    }
    
    
            
}
