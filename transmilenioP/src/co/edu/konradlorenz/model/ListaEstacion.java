
package co.edu.konradlorenz.model;

import java.util.ArrayList;


public class ListaEstacion {
    ArrayList<Estacion> estacion;

    public ListaEstacion(ArrayList<Estacion> estacion) {
        this.estacion = estacion;
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
