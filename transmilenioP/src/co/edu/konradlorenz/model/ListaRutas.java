
package co.edu.konradlorenz.model;

import co.edu.konradlorenz.model.estructuras.ListaEstacion;


public class ListaRutas {
    private NodoRutas cabeza;

    public ListaRutas() {
        cabeza = null;
    }
    
    public void insertInicio (Ruta Dat){
        NodoRutas nuevo = new NodoRutas (Dat, cabeza);
        cabeza = nuevo;
    }
     
     public void insertFinal (Ruta Dat){ 
        NodoRutas nuevo = new NodoRutas(Dat, null);
        if (cabeza == null){
        cabeza = nuevo;
        }
        else {
            NodoRutas actual = cabeza;
            while (actual.getNext()!= null){
                actual = actual.getNext();

            }
            actual.setNext(nuevo);
        }
    }
    
     public String MostarLista(){
          StringBuilder men = new StringBuilder();
        NodoRutas actual = cabeza;
        if(cabeza == null){
            return "Lista vacia";
        }
        while (actual!= null){
             men.append(actual.getConexa().toString());
             if(actual.getNext() != null){
                men.append("\n->");
             }
            actual = actual.getNext();
        } 
        
        
        return men.toString();
    }
     
     public void borrar (String nombre){
        if (cabeza == null) 
            System.out.println("lista vacía");
        else
            if (cabeza.next.getConexa().getNombreRuta().equals(nombre)){
            cabeza = cabeza.getNext();
            }
            else {
                NodoRutas actual = cabeza;
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
     public NodoRutas buscar(String nombre) {
    NodoRutas actual = cabeza;
    if(cabeza == null){
        System.out.println("Lista vacia");
    }else{
    while (actual != null) {
        if (actual.getConexa().getNombreRuta().equals(nombre)) {
            return actual; 
        }
        actual = actual.getNext();


}
   
}
    return null; 
     }
     
 
     public boolean modificar(String nombre, Ruta nuevaRuta) {
    NodoRutas actual = cabeza;
    while (actual != null) {
        if (actual.getConexa().getNombreRuta().equals(nombre)) {
            actual.setConexa(nuevaRuta); 
            return true; 
        }
        actual = actual.getNext();
    }
    return false; 
}
     public void asignarRutasEstaciones(ListaRutas objEnlazada, ListaEstacion objEstacion){
         NodoRutas actual = cabeza;
         while(actual != null){
             Ruta ruta = actual.getConexa();
             Estacion origen = objEstacion.buscarNombre(ruta.getOrigen());
             if(origen != null){
                 origen.addListaConexas(ruta);
             }
             Estacion destino = objEstacion.buscarNombre(ruta.getDestino());
             if (destino != null) {
                 destino.addListaConexas(ruta);
             }
             actual = actual.getNext();
         }
     }
     
     public NodoRutas getCabeza(){
         return cabeza;
     }
}
