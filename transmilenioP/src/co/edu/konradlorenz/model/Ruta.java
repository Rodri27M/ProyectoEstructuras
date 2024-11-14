
package co.edu.konradlorenz.model;


public class Ruta {
    
    private String nombreRuta;
    private String origen;
    private String destino;
    private int tiempoEstimado;

    public Ruta() {
    }

    public Ruta(String nombreRuta, String origen, String destino, int tiempoEstimado) {
        this.nombreRuta = nombreRuta;
        this.origen = origen;
        this.destino = destino;
        this.tiempoEstimado = tiempoEstimado;
    }

    public String getNombreRuta() {
        return nombreRuta;
    }

    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    @Override
    public String toString() {
        return "Ruta{" + "nombreRuta=" + nombreRuta + ", origen=" + origen + ", destino=" + destino + ", tiempoEstimado=" + tiempoEstimado + '}';
    }
    
    
    
}
