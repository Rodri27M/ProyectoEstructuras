
package co.edu.konradlorenz.controller;
import co.edu.konradlorenz.model.Bus;
import co.edu.konradlorenz.model.Diccionario;
import co.edu.konradlorenz.model.Estacion;
import co.edu.konradlorenz.model.HashTable;
import co.edu.konradlorenz.model.ListaEnlazada;
import co.edu.konradlorenz.model.ListaEstacion;
import co.edu.konradlorenz.model.Ruta;
import co.edu.konradlorenz.model.Usuario;
import co.edu.konradlorenz.view.Vantana;

public class Controlador {
    Vantana objVantana = new Vantana();
    ListaEstacion objEstacion = new ListaEstacion();
    Estacion objEstacion1 = new Estacion();
    Diccionario objDiccionario = new Diccionario();
    Usuario objUsuario = new Usuario();
    HashTable objHashTable = new HashTable();
    Bus objBus = new Bus();
    Ruta objRuta = new Ruta();
    ListaEnlazada objEnlazada = new ListaEnlazada();
    public void run(){
         datosPrecargados();
        int op;
        do{
            objVantana.menu();
            op = objVantana.pedirEntero();
        switch (op) {
            case 1:
                monitoreoEstacion();
                break;
            case 2:
                gestionFlota();
                break;
            case 3:
                objVantana.mostrarMensaje("Sin implementacion");
            break;
            case 4:
                objVantana.mostrarMensaje("Sin implementacion");
                break;
            case 5:
                gentionRutas();
                break;
            case 6:
                   alertas();
            break;
            case 7:
                validarAcceso();
                break;
            case 8:
                objVantana.mostrarMensaje("saliendo del Programa");
                break;
            default:
                throw new AssertionError("Opcion invalida. Por favor ingresar una de las opciones disponibles");
        }
        }while (op!=8);           
               
    }
 public void monitoreoEstacion(){
     datosEstacion();
     objVantana.mostrarMensaje("---MONITOREO EN TIPO REAL---");
     if(objEstacion == null || objEstacion.getEstacion() == null){
         objVantana.mostrarMensaje("No esta inicializada en las listas");
         return;
     }
     if(objEstacion.getEstacion().isEmpty()){
         objVantana.mostrarMensaje("Lista de estaciones vacia");
}else{
     for(Estacion estacion : objEstacion.getEstacion() ){
         objVantana.mostrarMensaje("Estacion: " + estacion.getNombreEstacion());
         objVantana.mostrarMensaje("Capacidad de la Estacion " + estacion.getCapacidadMaxima());
         objVantana.mostrarMensaje("Flujo de personas. " + estacion.getFlujoPersonas());
         objVantana.mostrarMensaje("Saturacion: " + estacion.getSaturacion());
         objVantana.mostrarMensaje("Funcionamiento: " + servicio(estacion.isFuncionamiento()));
         objVantana.mostrarMensaje("Paradas de Rutas: " );
         estacion.getListaConexas();
         objVantana.mostrarMensaje("  ");
}
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
                agregarBus();
                break;
            case 2:
                retirarBus();
                break;
            case 3:
                accerderBus();
            break;
            case 4:
                modificarBus();
                break;
            case 5:
                listaBus();
                break;
            case 6:
                objVantana.mostrarMensaje("Saliendo de gestionar flota");
                break;
            default:
                throw new AssertionError("Opcion Invalida. Por favor, ingresar una de las opciones disponibles");
     }
     } while (op!=6);
 }
 
 public void agregarBus(){
  //Metodo de pedir datos(Se esta validando si agregar datos precargados)   
  objVantana.mostrarMensaje("Metodo sin implementacion");
 }
 
 public void retirarBus(){
     if(objDiccionario.getBuses()!= null){
     objVantana.mostrarMensaje("Ingrese el ID del Bus a retirar:");
     int id = objVantana.pedirEntero();
     Bus bus = objDiccionario.obtenerBus(id);
     if(bus == null){
         objVantana.mostrarMensaje("El bus con ID " + id + " no esta en la lista");
     }else{  
     objDiccionario.eliminarBus(id);
     }}else{
         objVantana.mostrarMensaje("Lista de buses vacia");
     }
 }
 
 public void accerderBus(){
     if(objDiccionario.getBuses() != null){
     objVantana.mostrarMensaje("Ingrese el ID para acceder");
     int id = objVantana.pedirEntero();
     Bus bus = objDiccionario.obtenerBus(id);
     if(bus == null){
         objVantana.mostrarMensaje("El bus con ID " + id + " no esta en la lista");
     }else{
         objDiccionario.obtenerBus(id).toString();
     }}else{
         objVantana.mostrarMensaje("La lista de buses esta vacia");
     }
 }
 
 public void modificarBus(){
     if(objDiccionario.getBuses()!=null){
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
     }}else{
         objVantana.mostrarMensaje("No hay buses en la lista");
     }
 }
 
 public void listaBus(){
     if(objDiccionario.getBuses()==null){
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
     objVantana.mostrarMensaje("Gestion de Rutas:");
      int op;
     do {  
     objVantana.gentionRutas();
     op = objVantana.pedirEntero();
     switch (op){
         case 1:
                agregarRuta();
                break;
            case 2:
                eliminarRuta();
                break;
            case 3:
                modificarRuta();
            break;
            case 4:
                listaRutas();
                break;
            case 5:
                objVantana.mostrarMensaje("Saliendo de gestion de rutas");
                break;
            default:
                throw new AssertionError("Opcion invalidad. Por favor, ingresar una de las opciones disponibles");
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
     objVantana.mostrarMensaje("---Eliminando Ruta---");
     objVantana.mostrarMensaje("Ingrese el nombre ruta a Eliminar");
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
     objVantana.mostrarMensaje("ALERTAS: ");
     if(objEstacion.getEstacion()!=null){
     for (Estacion estacion : objEstacion.getEstacion()) {
         if(estacion.getFlujoPersonas() > estacion.getCapacidadMaxima()){
             objVantana.mostrarMensaje("Estacion: " + estacion.getNombreEstacion() + " Estacion llena");
         }else{
             objVantana.mostrarMensaje("Estacion: " +estacion.getNombreEstacion() +" Sin anomalias");
         }
     }}else{
            objVantana.mostrarMensaje("No hay estaciones");
             }
 }
 
 public void validarAcceso(){
     int op;
     do {
       objVantana.acceso();
     op = objVantana.pedirEntero();
         switch (op) {
             case 1:
                 ingresar();
                 break;
             case 2:
                 validar();
                 break;
             case 3:
                 objVantana.mostrarMensaje("Saliendo de validar acceso");
                 break;
             default:
                 throw new AssertionError("Opcion invalidad. Ingrese una de las opciones disponibles");
         }
     } while (op!=3);
 }
 
 public void ingresar(){
     objVantana.mostrarMensaje("Ingresando Usuariuo");
     objVantana.mostrarMensaje("Ingrese el ID del usuario");
     int id = objVantana.pedirEntero();
     objVantana.mostrarMensaje("Ingrese acceso: 1.Autorizado o 2.Denegado");
     int op = objVantana.pedirEntero();
     boolean autorizacion = pedirAutorizacion(op);
     objVantana.mostrarMensaje("Ingrese el tipo de Usuario");
     String tipo = objVantana.pedirString();
     Usuario agregar = new Usuario(id, autorizacion, tipo);
     objHashTable.agregarUsuario(agregar);
       
 }
 
 
 public boolean pedirAutorizacion(int op){
     int val = op;
    boolean acceso = false;
     do{
     if(val==1){
         acceso = true;
     }else if(val==2){
         acceso = false; 
     }
         
 }while(op!=1 && op!=2);
    return acceso;
 }
 
 public void validar(){
     objVantana.mostrarMensaje("Validando acceso");
     objVantana.mostrarMensaje("Ingrese ID del usuario");
     int id = objVantana.pedirEntero();
     if(objHashTable.getUsuarios().isEmpty()){
         objVantana.mostrarMensaje("Lista vacia");
     }else{
         if(objHashTable.obtenerUsuario(id)==null){
             objVantana.mostrarMensaje("Usiario con ID " + id + " no esta en el sistema");
         }else{
             objVantana.mostrarMensaje("Usuario: " + objHashTable.obtenerUsuario(id).toString());
         }
     }
     
 }
 
 public void datosPrecargados(){
     //Datos precargados de estacion
     Estacion a1 = new Estacion("Ricaute", 1000, 500,null, "Moderada", true);
     objEstacion.agregar(a1);
     Estacion a2 = new Estacion("Terminal", 600, 700,null, "Normal", true);
     objEstacion.agregar(a2);
     
     //Datos de Buse precargados
     Bus b1 = new Bus(23, 200, "P20", "12Pl", "2014", 100);
     objDiccionario.agregarBus(b1);
     Bus b2 = new Bus(23, 250,  "L20", "25Tk", "2017", 110);
     objDiccionario.agregarBus(b2);
     
     //Datos de rutas precargados
     Ruta r1 = new Ruta("P20", "Ricaute", "Teminal", 80);
     objEnlazada.insertFinal(r1);
     Ruta r2 = new Ruta("L20", "Terminal", "Ricaute", 80);
     objEnlazada.insertFinal(r2);
     
     //Datos de usuaios precargados
     Usuario u1 = new Usuario(34, true, "Pasajero");
     objHashTable.agregarUsuario(u1);
     Usuario u2 = new Usuario(45, false, "Pasajero");
     objHashTable.agregarUsuario(u2);
 }
 
}
