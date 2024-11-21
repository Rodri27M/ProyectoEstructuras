
package co.edu.konradlorenz.model;


public class NodoRutas {
    Ruta conexa;
    NodoRutas next;

    public NodoRutas(Ruta conexa, NodoRutas next) {
        this.conexa = conexa;
        this.next = next;
    }

    public Ruta getConexa() {
        return conexa;
    }

    public void setConexa(Ruta conexa) {
        this.conexa = conexa;
    }

    public NodoRutas getNext() {
        return next;
    }

    public void setNext(NodoRutas next) {
        this.next = next;
    }
    
}
