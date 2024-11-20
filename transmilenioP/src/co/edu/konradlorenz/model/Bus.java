
package co.edu.konradlorenz.model;

import java.time.LocalDateTime;


public class Bus {
    private int idBus;
    private int capacidad;
    private String rutaAsignada;
    private String placa;
    private String añoEntrada;
    private int numAsientos;

    public Bus() {
    }

    public Bus(int idBus, int capacidad, String rutaAsignada, String placa, String añoEntrada, int numAsientos) {
        this.idBus = idBus;
        this.capacidad = capacidad;
        this.rutaAsignada = rutaAsignada;
        this.placa = placa;
        this.añoEntrada = añoEntrada;
        this.numAsientos = numAsientos;
    }

    public int getIdBus() {
        return idBus;
    }

    public void setIdBus(int idBus) {
        this.idBus = idBus;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getRutaAsignada() {
        return rutaAsignada;
    }

    public void setRutaAsignada(String rutaAsignada) {
        this.rutaAsignada = rutaAsignada;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAñoEntrada() {
        return añoEntrada;
    }

    public void setAñoEntrada(String añoEntrada) {
        this.añoEntrada = añoEntrada;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    @Override
    public String toString() {
        return "Bus{" + "idBus=" + idBus + ""
                + "capacidad=" + capacidad + ""
                + "rutaAsignada=" + rutaAsignada + ""
                + "placa=" + placa + ""
                + "a\u00f1oEntrada=" + añoEntrada + ""
                + "numAsientos=" + numAsientos + '}';
    }

   
       
}
