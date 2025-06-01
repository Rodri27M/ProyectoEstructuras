package co.edu.konradlorenz.model.bus;

import java.util.HashMap;

public class BusHashMap {

    private HashMap<Integer, Bus> buses;

    public BusHashMap() {
        this.buses = new HashMap<>();
    }

    public void addBus(Bus newBus) {
        buses.put(newBus.getId(), newBus);
    }

    public Bus getBus(int id) {
        return buses.get(id);
    }

    public void deleteBus(int id) {
        buses.remove(id);
    }

    public HashMap<Integer, Bus> getBuses() {
        return buses;
    }

}
