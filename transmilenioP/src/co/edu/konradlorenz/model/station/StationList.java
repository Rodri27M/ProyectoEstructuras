package co.edu.konradlorenz.model.station;

import java.util.ArrayList;

public class StationList {

    private ArrayList<Station> station;

    public StationList() {
        this.station = new ArrayList<>();
    }

    public ArrayList<Station> getStation() {
        return station;
    }

    public void setStation(ArrayList<Station> newStation) {
        this.station = newStation;
    }
    
    public void addStation(Station newStation) {
        station.add(newStation);
    }

    public void deleteStation(Station stat) {
        station.remove(stat);
    }

    public Station findName(String name) {
        for (Station station : station) {
            if (station.getName().equalsIgnoreCase(name)) {
                return station;
            }
        }
        return null;
    }

}
