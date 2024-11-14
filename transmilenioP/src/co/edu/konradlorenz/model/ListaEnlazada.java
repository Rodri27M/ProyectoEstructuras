
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
            System.out.println(actual.getConexa());
            actual = actual.getNext();
        } 
    }
     public void borrar (String nombre){
        if (nombre == null) 
            System.out.println("lista vacía");
        else
            if (cabeza.next.getConexa() .equals(nombre)){
            cabeza = cabeza.getNext();
            }
            else {
                Nodo actual = cabeza;
                while (actual.getNext()!=null && !actual.getNext().getConexa().equals(nombre))
                 {
                   actual = actual.getNext(); 
                 }
                if (actual.getNext()== null )
                        System.out.println ("elemento "+nombre+" no esta en la lista");
                    else{
                        actual.setNext(actual.getNext().getNext());
                    }
            }
    }
}
