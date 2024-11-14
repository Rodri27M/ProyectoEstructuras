
package co.edu.konradlorenz.model;

import java.util.ArrayList;


public class SistemaTransmilenio {
   private ArrayList<Estacion> listaEstaciones; 
   private ArrayList<Ruta> listasRutas;
   private ArrayList<Bus> listaBuces;
   private ArrayList<Usuario> listaUsuarios;

   public SistemaTransmilenio(){

   }
   
    public SistemaTransmilenio(ArrayList<Estacion> listaEstaciones, ArrayList<Ruta> listasRutas, ArrayList<Bus> listaBuces, ArrayList<Usuario> listaUsuarios) {
        this.listaEstaciones = listaEstaciones;
        this.listasRutas = listasRutas;
        this.listaBuces = listaBuces;
        this.listaUsuarios = listaUsuarios;
    }

    public ArrayList<Estacion> getListaEstaciones() {
        return listaEstaciones;
    }

    public void addListaEstaciones(Estacion estacion) {
        this.listaEstaciones.add(estacion);
    }

    public ArrayList<Ruta> getListasRutas() {
        return listasRutas;
    }

    public void addListasRutas(Ruta ruta) {
        this.listasRutas.add(ruta);
    }

    public ArrayList<Bus> getListaBuces() {
        return listaBuces;
    }

    public void addListaBuces(Bus bus) {
        this.listaBuces.add(bus);
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void addListaUsuarios(Usuario usuario) {
        this.listaUsuarios.add(usuario);
    }

    public void setListaEstaciones(ArrayList<Estacion> listaEstaciones) {
        this.listaEstaciones = listaEstaciones;
    }

    public void setListasRutas(ArrayList<Ruta> listasRutas) {
        this.listasRutas = listasRutas;
    }

    public void setListaBuces(ArrayList<Bus> listaBuces) {
        this.listaBuces = listaBuces;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    
    @Override
    public String toString() {
        return "SistemaTransmilenio{" + "listaEstaciones=" + listaEstaciones + ", listasRutas=" + listasRutas + ", listaBuces=" + listaBuces + ", listaUsuarios=" + listaUsuarios + '}';
    }
   
   
   
}
