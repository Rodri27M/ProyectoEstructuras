
package co.edu.konradlorenz.model;


public class Nodo {
    Ruta conexa;
    Nodo next;

    public Nodo(Ruta conexa, Nodo next) {
        this.conexa = conexa;
        this.next = next;
    }

    public Ruta getConexa() {
        return conexa;
    }

    public void setConexa(Ruta conexa) {
        this.conexa = conexa;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
}
