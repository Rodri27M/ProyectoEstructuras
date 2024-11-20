
package co.edu.konradlorenz.model;

import java.util.HashMap;


public class Diccionario {
    private HashMap<Integer, Bus> buses = new HashMap();

    public Diccionario() {
    }

    public Diccionario(HashMap<Integer, Bus> buses) {
        this.buses = new HashMap<>();
    }

public void agregarBus(Bus bus){
    buses.put(bus.getIdBus(), bus);
}    
public Bus obtenerBus(int id){
    return buses.get(id);
}

public void eliminarBus(int id){
    buses.remove(id);
}

    public HashMap<Integer, Bus> getBuses() {
        return buses;
    }


}
