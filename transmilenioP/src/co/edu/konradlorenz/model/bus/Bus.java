package co.edu.konradlorenz.model.bus;

public class Bus {

    private int id;
    private int capacity;
    private String routeAssigned;
    private String plate;
    private String yearIn;
    private int seatsNumber;

    public Bus() {
    }

    public Bus(int id, int capacity, String routeAssigned, String plate, String yearIn, int seatsNumber) {
        this.id = id;
        this.capacity = capacity;
        this.routeAssigned = routeAssigned;
        this.plate = plate;
        this.yearIn = yearIn;
        this.seatsNumber = seatsNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRouteAssigned() {
        return routeAssigned;
    }

    public void setRouteAssigned(String routeAssigned) {
        this.routeAssigned = routeAssigned;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getYearIn() {
        return yearIn;
    }

    public void setYearIn(String yearIn) {
        this.yearIn = yearIn;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    @Override
    public String toString() {
        return "Bus{" + "idBus=" + id + ""
                + "\ncapacidad=" + capacity + ""
                + "\nrutaAsignada=" + routeAssigned + ""
                + "\nplaca=" + plate + ""
                + "\na\u00f1oEntrada=" + yearIn + ""
                + "\nnumAsientos=" + seatsNumber + '}';
    }

}
