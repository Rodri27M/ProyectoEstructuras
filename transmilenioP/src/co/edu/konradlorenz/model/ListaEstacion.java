
package co.edu.konradlorenz.model;

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
    
}
