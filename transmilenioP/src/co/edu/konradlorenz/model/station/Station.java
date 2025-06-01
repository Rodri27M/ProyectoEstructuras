package co.edu.konradlorenz.model.station;

import co.edu.konradlorenz.model.enums.Operation;
import co.edu.konradlorenz.model.enums.Saturation;
import co.edu.konradlorenz.model.route.Route;
import co.edu.konradlorenz.model.route.RoutesLinkedList;
import co.edu.konradlorenz.model.route.RoutesNode;

public class Station {

    private String name;
    private int maxCapacity;
    private int flowOfPeople;
    private RoutesLinkedList relatedList = new RoutesLinkedList();
    private Saturation saturation;
    private Operation operation;

    public Station() {
    }

    public Station(String name, int maxCapacity, int flowOfPeople, Saturation saturation, Operation operation) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.flowOfPeople = flowOfPeople;
        this.saturation = saturation;
        this.operation = operation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getFlowOfPeople() {
        return flowOfPeople;
    }

    public void setFlowOfPeople(int flowOfPeople) {
        this.flowOfPeople = flowOfPeople;
    }

    public RoutesLinkedList getRelatedList() {
        return relatedList;
    }

    public void setRelatedList(RoutesLinkedList relatedList) {
        this.relatedList = relatedList;
    }

    public Saturation getSaturation() {
        return saturation;
    }

    public void setSaturation(Saturation saturation) {
        this.saturation = saturation;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Estacion{" + "\nnombreEstacion= " + name
                + "\ncapacidadMaxima= " + maxCapacity + ""
                + "\nflujoPersonas= " + flowOfPeople + " "
                + "\nsaturacion= " + saturation + " "
                + "\nfuncionamiento= " + operation + '}';
    }

    public void addRelatedList(Route route) {
        this.relatedList.insertRoute(route);
    }

    public String showRelatedRoutes() {
        String show = " ";
        RoutesNode actualNode = relatedList.getHead();
        if (actualNode == null) {
            return "No hay rutas conexas";
        }
        while (actualNode != null) {
            Route route = (Route) actualNode.getRoute();
            show += " Ruta: " + route.getName() + " [Origen: " + route.getOrigin() + " -> Destino: " + route.getDestiny() + "] |";
            actualNode = actualNode.getNext();
        }
        return show;
    }

}
