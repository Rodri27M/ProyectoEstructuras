package co.edu.konradlorenz.model.user;

public class User {

    private int id;
    private boolean access;
    private String type;

    public User() {
    }

    public User(int id, boolean access, String type) {
        this.id = id;
        this.access = access;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Usuario{" + "\nid=" + id
                + "\naccesoAutorizado=" + access
                + "\n tipoUsuario=" + type + '}';
    }

}
