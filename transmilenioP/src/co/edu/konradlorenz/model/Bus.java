
package co.edu.konradlorenz.model;

import java.time.LocalDateTime;


public class Bus {
    private String idBus;
    private int capacidad;
    private String rutaAsignada;
    private double nivelOcupacion;
    private boolean enServicio;        
    private boolean retrasado; 
    private LocalDateTime horaUltimaActualizacion;

    public Bus() {
    }

    public Bus(String idBus, int capacidad, String rutaAsignada, double nivelOcupacion, boolean enServicio, boolean retrasado, LocalDateTime horaUltimaActualizacion) {
        this.idBus = idBus;
        this.capacidad = capacidad;
        this.rutaAsignada = rutaAsignada;
        this.nivelOcupacion = nivelOcupacion;
        this.enServicio = enServicio;
        this.retrasado = retrasado;
        this.horaUltimaActualizacion = horaUltimaActualizacion;
    }

  

    public String getIdBus() {
        return idBus;
    }

    public void setIdBus(String idBus) {
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

    public LocalDateTime getHoraUltimaActualizacion() {
        return horaUltimaActualizacion;
    }

    public void setHoraUltimaActualizacion(LocalDateTime horaUltimaActualizacion) {
        this.horaUltimaActualizacion = horaUltimaActualizacion;
    }

    public double getNivelOcupacion() {
        return nivelOcupacion;
    }

    public void setNivelOcupacion(double nivelOcupacion) {
        this.nivelOcupacion = nivelOcupacion;
    }

    public boolean isEnServicio() {
        return enServicio;
    }

    public void setEnServicio(boolean enServicio) {
        this.enServicio = enServicio;
    }

    public boolean isRetrasado() {
        return retrasado;
    }

    public void setRetrasado(boolean retrasado) {
        this.retrasado = retrasado;
    }

    @Override
    public String toString() {
        return "Bus{" + "idBus=" + idBus + ", capacidad=" + capacidad + ", rutaAsignada=" + rutaAsignada + ", nivelOcupacion=" + nivelOcupacion + ", enServicio=" + enServicio + ", retrasado=" + retrasado + ", horaUltimaActualizacion=" + horaUltimaActualizacion + '}';
    }

       
}
