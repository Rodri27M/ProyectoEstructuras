
package co.edu.konradlorenz.model;

import java.util.ArrayList;


public class Estacion {
    
    private String nombreEstacion;
    private int capacidadMaxima;
    private int flujoPersonas;
    private ListaRutas listaConexas;
    private String saturacion;
    private boolean funcionamiento;

    public Estacion() {
    }

    public Estacion(String nombreEstacion, int capacidadMaxima, int flujoPersonas, ListaRutas listaConexas, String saturacion, boolean funcionamiento) {
        this.nombreEstacion = nombreEstacion;
        this.capacidadMaxima = capacidadMaxima;
        this.flujoPersonas = flujoPersonas;
        this.listaConexas = new ListaRutas();
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

    public String getListaConexas() {
       return listaConexas.MostarLista();
    }

    public void addListaConexas(Ruta ruta) {
        this.listaConexas.insertFinal(ruta);
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
      public ListaRutas getListaRutasConexas() {
        return listaConexas; 
    }
    
    @Override
    public String toString() {
        return "Estacion{" + "\nnombreEstacion= " + nombreEstacion +
                "\ncapacidadMaxima= " + capacidadMaxima + ""
                + "\nflujoPersonas= " + flujoPersonas + " "
                + "\nsaturacion= " + saturacion + " "
                + "\nfuncionamiento= " + funcionamiento + '}';
    }

    
   public String mostrarRutasConexas(){
       String mostrar = " ";
       NodoRutas actual = listaConexas.getCabeza();
       if(actual == null){
           return "No hay rutas conexas";
       }
       while(actual != null){
           Ruta ruta =(Ruta) actual.getConexa();
           mostrar += "- Ruta: " + ruta.getNombreRuta() + "| Origen: " + ruta.getOrigen() + " | Destino " + ruta.getDestino();
           actual = actual.getNext();
        }
       
        return mostrar;
   } 

    
    
    
}
