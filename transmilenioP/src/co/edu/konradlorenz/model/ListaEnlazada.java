
package co.edu.konradlorenz.model;


public class ListaEnlazada {
    private Nodo cabeza;

    public ListaEnlazada() {
        cabeza = null;
    }
    
    public void insertInicio (Ruta Dat){
        Nodo nuevo = new Nodo (Dat, cabeza);
        cabeza = nuevo;
    }
     
     public void insertFinal (Ruta Dat){ 
        Nodo nuevo = new Nodo(Dat, null);
        if (cabeza == null){
        cabeza = nuevo;
        }
        else {
            Nodo actual = cabeza;
            while (actual.getNext()!= null){
                actual = actual.getNext();

            }
            actual.setNext(nuevo);
        }
    }
    
     public void MostarLista(){ 
        Nodo actual = cabeza;
        while (actual!= null){
            System.out.println(actual.getConexa().toString());
            actual = actual.getNext();
        } 
    }
     public void borrar (String nombre){
        if (nombre == null) 
            System.out.println("lista vacía");
        else
            if (cabeza.next.getConexa().getNombreRuta().equals(nombre)){
            cabeza = cabeza.getNext();
            }
            else {
                Nodo actual = cabeza;
                while (actual.getNext()!=null && !actual.getNext().getConexa().getNombreRuta().equals(nombre))
                 {
                   actual = actual.getNext(); 
                 }
                if (actual.getNext()== null )
                        System.out.println ("Elemento " +nombre+ " no esta en la lista");
                    else{
                        actual.setNext(actual.getNext().getNext());
                    }
            }
    }
     public Nodo buscar(String nombre) {
    Nodo actual = cabeza;
    while (actual != null) {
        if (actual.getConexa().getNombreRuta().equals(nombre)) {
            return actual; 
        }
        actual = actual.getNext();
    }
    return null; 
}
     public boolean modificar(String nombre, Ruta nuevaRuta) {
    Nodo actual = cabeza;
    while (actual != null) {
        if (actual.getConexa().getNombreRuta().equals(nombre)) {
            actual.setConexa(nuevaRuta); 
            return true; 
        }
        actual = actual.getNext();
    }
    return false; 
}
}
