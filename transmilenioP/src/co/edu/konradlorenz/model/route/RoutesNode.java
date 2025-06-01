package co.edu.konradlorenz.model.route;

public class RoutesNode {

    private Route route;
    private RoutesNode nextNode;

    public RoutesNode() {
    }

    public RoutesNode(Route route, RoutesNode nextNode) {
        this.route = route;
        this.nextNode = nextNode;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public RoutesNode getNext() {
        return nextNode;
    }

    public void setNextNode(RoutesNode nextNode) {
        this.nextNode = nextNode;
    }

}
