
package co.edu.konradlorenz.model.estructuras;

import co.edu.konradlorenz.model.Bus;
import java.util.HashMap;


public class ListaBus {
    private HashMap<Integer, Bus> buses = new HashMap();

    public ListaBus() {
    }

    public ListaBus(HashMap<Integer, Bus> buses) {
        this.buses = new HashMap<>();
    }

public void agregarBus(Bus bus){
    buses.put(bus.getIdBus( ), bus);
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
