package co.edu.konradlorenz.model.route;

public class Route {

    private String name;
    private String origin;
    private String destiny;
    private int estimatedTime;

    public Route() {
    }

    public Route(String name, String origin, String destiny, int estimatedTime) {
        this.name = name;
        this.origin = origin;
        this.destiny = destiny;
        this.estimatedTime = estimatedTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(int estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    @Override
    public String toString() {
        return "> Nombre de la Ruta: " + name + " |"
                + "\n   Origen: " + origin + " |"
                + "\n   Destino: " + destiny + " |"
                + "\n   Tiempo Estimado: " + estimatedTime + " |"
                + "\n |";
    }

}
