package co.edu.konradlorenz.model.user;

import java.util.Hashtable;

public class UsersHashtable {

    private Hashtable<Integer, User> users;

    public UsersHashtable() {
        this.users = new Hashtable<>();
    }

    public void addUser(User usuario) {
        users.put(usuario.getId(), usuario);
    }

    public User getUser(int id) {
        return users.get(id);
    }

    public void deleteUser(int id) {
        users.remove(id);
    }

    public Hashtable<Integer, User> getUsers() {
        return users;
    }

    public void setUsuarios(Hashtable<Integer, User> users) {
        this.users = users;
    }

}
