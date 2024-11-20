
package co.edu.konradlorenz.controller;
import co.edu.konradlorenz.model.Bus;
import co.edu.konradlorenz.model.Diccionario;
import co.edu.konradlorenz.model.Estacion;
import co.edu.konradlorenz.model.ListaEstacion;
import co.edu.konradlorenz.view.Vantana;

public class Controlador {
    Vantana objVantana = new Vantana();
    ListaEstacion objEstacion = new ListaEstacion();
    Estacion objEstacion1 = new Estacion();
    Diccionario objDiccionario = new Diccionario();
    Bus objBus = new Bus();
    public void run(){
        
        int op = objVantana.pedirEntero();
        do{
        switch (op) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
            break;
            case 4:
                
                break;
            case 5:
                
                break;
             
            default:
                throw new AssertionError();
        }
        }while (op!=7);           
               
    }
 public void monitoreoEstacion(){
     objVantana.mostrarMensaje("---MONITOREO EN TIPO REAL---");
     for(Estacion estacion : objEstacion.getEstacion() ){
         objVantana.mostrarMensaje("Estacion: " + estacion.getNombreEstacion());
         objVantana.mostrarMensaje("Capacidad de la Estacion " + estacion.getCapacidadMaxima());
         objVantana.mostrarMensaje("Flujo de personas. " + estacion.getFlujoPersonas());
         objVantana.mostrarMensaje("Saturacion: " + estacion.getSaturacion());
         objVantana.mostrarMensaje("Funcionamiento " + servicio(estacion.isFuncionamiento()));
         objVantana.mostrarMensaje("Paradas de Rutas: " );
         estacion.getListaConexas();
         objVantana.mostrarMensaje("  ");
     }
 }
 
 
 public String servicio(boolean validar){
     String servicio;
     if (validar == true) {
         servicio = "En servicio";
     } else {
         servicio = "Fuera de servicio";
     }  
     return servicio;
 }
 
 public void pedirBoolean(){
     boolean funcionamiento = false;
     int op = objVantana.pedirEntero();
     do{
     if (op==1) {
         funcionamiento = true;
     }else if (op==2){
         funcionamiento = false;
     }  
     }while(op!=1 || op!=2);
     objEstacion1.setFuncionamiento(funcionamiento);
 }
 
 public void datosEstacion(){
     // Metodo de agregar datos de la estacion(Se esta validando si se desea agregar los datos precargados)
 }
 
 public void gestionFlota(){
     int op;
     do {  
     objVantana.flota();
     op = objVantana.pedirEntero();
     switch (op){
         case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
            break;
            case 4:
                
                break;
            case 5:
                
                break;
             
            default:
                throw new AssertionError();
     }
     } while (op!=6);
 }
 
 public void agragarBus(){
  //Metodo de pedir datos(Se esta validando si agregar datos precargados)   
 }
 
 public void retirarBus(){
     objVantana.mostrarMensaje("Ingrese el ID del Bus a retirar:");
     int id = objVantana.pedirEntero();
     Bus bus = objDiccionario.obtenerBus(id);
     if(bus == null){
         objVantana.mostrarMensaje("El bus con ID " + id + " no esta en la lista");
     }else{  
     objDiccionario.eliminarBus(id);
     }
 }
 
 public void accerderBus(){
     objVantana.mostrarMensaje("Ingrese el ID para acceder");
     int id = objVantana.pedirEntero();
     Bus bus = objDiccionario.obtenerBus(id);
     if(bus == null){
         objVantana.mostrarMensaje("El bus con ID " + id + " no esta en la lista");
     }else{
         objDiccionario.obtenerBus(id).toString();
     }
 }
 
}
