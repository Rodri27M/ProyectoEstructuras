
package co.edu.konradlorenz.controller;
import co.edu.konradlorenz.model.Bus;
import co.edu.konradlorenz.model.Diccionario;
import co.edu.konradlorenz.model.Estacion;
import co.edu.konradlorenz.model.ListaEnlazada;
import co.edu.konradlorenz.model.ListaEstacion;
import co.edu.konradlorenz.model.Ruta;
import co.edu.konradlorenz.view.Vantana;

public class Controlador {
    Vantana objVantana = new Vantana();
    ListaEstacion objEstacion = new ListaEstacion();
    Estacion objEstacion1 = new Estacion();
    Diccionario objDiccionario = new Diccionario();
    Bus objBus = new Bus();
    Ruta objRuta = new Ruta();
    ListaEnlazada objEnlazada = new ListaEnlazada();
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
 
 public void modificarBus(){
     objVantana.mostrarMensaje("Ingrese el ID del bus que se va a modificar ");
     int id = objVantana.pedirEntero();
     Bus bus = objDiccionario.obtenerBus(id);
     if(bus != null){
         objVantana.mostrarMensaje("Ingrese la placa: ");
         bus.setPlaca(objVantana.pedirString());
         objVantana.mostrarMensaje("Ingrese la capacidad del bus: ");
         bus.setCapacidad(objVantana.pedirEntero());
          objVantana.mostrarMensaje("Ingrese la ruta del bus: ");
         bus.setRutaAsignada(objVantana.pedirString());
         objVantana.mostrarMensaje("Ingrese el año del bus: ");
         bus.setAñoEntrada(objVantana.pedirString());
          objVantana.mostrarMensaje("Ingrese el numero de asientos del bus");
         bus.setNumAsientos(objVantana.pedirEntero());
     }else{
         objVantana.mostrarMensaje("El bus con ID " + id + " no esta en la lista");
     }
 }
 
 public void listaBus(){
     if(objDiccionario.getBuses().isEmpty()){
         objVantana.mostrarMensaje("No hay lista de Buses");
     }else{
       objVantana.mostrarMensaje("Listado de buses ");
     for(Bus bus : objDiccionario.getBuses().values()){
         objVantana.mostrarMensaje(" Bus: " + bus.toString());     
     }
 }
 }
 
 public void datos(){
     //Datos de la ruta(puede ir datos precargados)
 }
 
 public void gentionRutas(){
      int op;
     do {  
     objVantana.gentionRutas();
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
           
            default:
                throw new AssertionError();
     }
     } while (op!=5);
 }
 public void agregarRuta(){
     objVantana.mostrarMensaje("Ruta Nueva:");
     String nombre, origen,destino;
     int tiempo;
     objVantana.mostrarMensaje("Ingrese el Nombre de ruta");
     nombre = objVantana.pedirString();
     objVantana.mostrarMensaje("Ingrese la Partida de inicio de la Ruta");
     origen = objVantana.pedirString();
     objVantana.mostrarMensaje("Ingrese el destino de la ruta");
     destino = objVantana.pedirString();
     objVantana.mostrarMensaje("Ingrese el tiempo estimado de la ruta");
     tiempo = objVantana.pedirEntero();
     Ruta objRuta = new Ruta(nombre, origen, destino, tiempo);
     objEnlazada.insertFinal(objRuta);
     
 }
 
 public void eliminarRuta(){
     objVantana.mostrarMensaje("Eliminando Ruta");
     objVantana.mostrarMensaje("Ingrese la ruta a Eliminar");
     String nombre = objVantana.pedirString();
     objEnlazada.borrar(nombre);
 }
 
 public void modificarRuta(){
     objVantana.mostrarMensaje("Modificando Ruta");
     String nombre, origen, destino;
     int tiempo;
     objVantana.mostrarMensaje("Nombre de la ruta a modificar");
     nombre = objVantana.pedirString();
     
     if(objEnlazada.buscar(nombre) != null){
         
     objVantana.mostrarMensaje("Ingrese el nuevo origen de la ruta: ");
     origen = objVantana.pedirString();
     objVantana.mostrarMensaje("Ingrese el nuevo destino de la ruta: ");
     destino = objVantana.pedirString();
     objVantana.mostrarMensaje("Ingrese el tiempo estimado de la ruta: ");
     tiempo = objVantana.pedirEntero();
     Ruta rutaModificada = new Ruta(nombre, origen, destino, tiempo);
     boolean modificacion = objEnlazada.modificar(nombre, objRuta);
     if(modificacion){
         objVantana.mostrarMensaje("Ruta Modificada");
     }else{
         objVantana.mostrarMensaje("La ruta no fue modificada");
     }
     }else{
         objVantana.mostrarMensaje("La ruta no esta en la lista ");
     }
 }
 
 public void listaRutas(){
     objVantana.mostrarMensaje("Lista Rutas: ");
     objEnlazada.MostarLista();
 }
 
 public void alertas(){
     
 }
 
}
