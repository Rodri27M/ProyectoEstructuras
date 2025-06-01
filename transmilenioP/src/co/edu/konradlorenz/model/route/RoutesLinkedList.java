package co.edu.konradlorenz.model.route;

import co.edu.konradlorenz.model.station.Station;
import co.edu.konradlorenz.model.station.StationList;

public class RoutesLinkedList {

    private RoutesNode head;

    public RoutesLinkedList() {
        head = null;
    }

    public RoutesLinkedList(RoutesNode head) {
        this.head = head;
    }

    public RoutesNode getHead() {
        return head;
    }

    public void setHead(RoutesNode head) {
        this.head = head;
    }

    public void insertRoute(Route route) {
        RoutesNode newNode = new RoutesNode(route, null);
        if (head == null) {
            head = newNode;
        } else {
            RoutesNode actualNode = head;
            while (actualNode.getNext() != null) {
                actualNode = actualNode.getNext();
            }
            actualNode.setNextNode(newNode);
        }
    }

    public Route findRoute(String routeName) {
        RoutesNode actual = head;
        while (actual != null) {
            if (actual.getRoute().getName().equals(routeName)) {
                return actual.getRoute();
            }
            actual = actual.getNext();
        }
        return null;
    }

    public RoutesNode findNode(String routeName) {
        RoutesNode actual = head;
        while (actual != null) {
            if (actual.getRoute().getName().equals(routeName)) {
                return actual;
            }
            actual = actual.getNext();
        }
        return null;
    }

    public boolean modifyRoute(String routeName, Route newRoute) {
        RoutesNode node = findNode(routeName);
        if (node != null) {
            node.setRoute(newRoute);
            return true;
        }
        return false;
    }

    public void deleteRoute(String routeName) {
        RoutesNode node = findNode(routeName);
        if (node != null) {
            node.setRoute(null);
        }
    }

    public String showList() {
        StringBuilder routes = new StringBuilder();
        RoutesNode actual = head;
        while (actual != null) {
            routes.append(actual.getRoute().toString());
            if (actual.getNext() != null) {
                routes.append("\n\n");
            }
            actual = actual.getNext();
        }
        return routes.toString();
    }

    public void addRouteStations(RoutesLinkedList objEnlazada, StationList objEstacion) {
        RoutesNode actual = head;
        while (actual != null) {
            Route ruta = actual.getRoute();
            Station origen = objEstacion.findName(ruta.getOrigin());
            if (origen != null) {
                origen.addRelatedList(ruta);
            }
            Station destino = objEstacion.findName(ruta.getDestiny());
            if (destino != null) {
                destino.addRelatedList(ruta);
            }
            actual = actual.getNext();
        }
    }
    
}
