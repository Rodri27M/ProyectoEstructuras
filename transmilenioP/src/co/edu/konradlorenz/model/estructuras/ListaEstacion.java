
package co.edu.konradlorenz.model.estructuras;

import co.edu.konradlorenz.model.Estacion;
import java.util.ArrayList;


public class ListaEstacion {
  private ArrayList<Estacion> estacion = new ArrayList<>();

    public ListaEstacion(ArrayList<Estacion> estacion) {
        this.estacion = new ArrayList<>();
    }

    public ListaEstacion() {
    }
    
    

    public ArrayList<Estacion> getEstacion() {
        return estacion;
    }

    public void setEstacion(ArrayList<Estacion> estacion) {
        this.estacion = estacion;
    }
     
    public void agregar(Estacion agregar){
        estacion.add(agregar);
    }
    public Estacion buscarNombre(String nombre){
        for (Estacion estacion : estacion) {
            if(estacion.getNombreEstacion().equalsIgnoreCase(nombre)){
                return estacion;
            }
        }
      return null;
    }
    
   
}
