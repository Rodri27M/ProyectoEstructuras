
package co.edu.konradlorenz.model;

import java.util.ArrayList;


public class Estacion {
    
    private String nombreEstacion;
    private int capacidadMaxima;
    private int flujoPersonas;
    private   ListaEnlazada listaConexas;
    private String saturacion;
    private boolean funcionamiento;

    public Estacion() {
    }

    public Estacion(String nombreEstacion, int capacidadMaxima, int flujoPersonas, String saturacion, boolean funcionamiento) {
        this.nombreEstacion = nombreEstacion;
        this.capacidadMaxima = capacidadMaxima;
        this.flujoPersonas = flujoPersonas;
       
        this.saturacion = saturacion;
        this.funcionamiento = funcionamiento;
    }

  

    public String getNombreEstacion() {
        return nombreEstacion;
    }

    public void setNombreEstacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getFlujoPersonas() {
        return flujoPersonas;
    }

    public void setFlujoPersonas(int flujoPersonas) {
        this.flujoPersonas = flujoPersonas;
    }

    public void getListaConexas() {
        listaConexas.MostarLista();
    }

    public void addListaConexas(Ruta ruta) {
        this.listaConexas.insertInicio(ruta);
    }

    public String getSaturacion() {
        return saturacion;
    }

    public void setSaturacion(String saturacion) {
        this.saturacion = saturacion;
    }

    public boolean isFuncionamiento() {
        return funcionamiento;
    }

    public void setFuncionamiento(boolean funcionamiento) {
        this.funcionamiento = funcionamiento;
    }

    @Override
    public String toString() {
        return "Estacion{" + "nombreEstacion= " + nombreEstacion +
                "capacidadMaxima= " + capacidadMaxima + ""
                + "flujoPersonas= " + flujoPersonas + " "
                + "saturacion= " + saturacion + " "
                + "funcionamiento= " + 
                funcionamiento + '}';
    }

    
    
    
    
    
}
