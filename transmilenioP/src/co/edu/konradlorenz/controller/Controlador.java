 
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
        objVantana.mostrarMensaje(" ");
         datosPrecargados();
        int op;
        do{
            objVantana.mostrarMensaje(" ");
            objVantana.menu();
            op = entero();
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
                objVantana.mostrarMensaje("Opcion invalida. Por favor, ingresar una de las opciones disponibles.");
        }
        }while (op!=8);           
               
    }
 public void monitoreoEstacion(){
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
         objVantana.mostrarMensaje(" ");
         mostrarEstacionesRutas();

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
     String nombre, saturacion;
     int capacidad, flujo;
     ListaEnlazada paradas;
     boolean servicio;
     objVantana.mostrarMensaje("Agregando estacion");
     objVantana.mostrarMensaje("Ingrese el nombre de la estacion");
     nombre = objVantana.pedirString();
     objVantana.mostrarMensaje("Ingrese las parradas");
     paradas = null; // En proceso
     objVantana.mostrarMensaje("Ingrese la capacidad maxima de la estacion");
     capacidad = objVantana.pedirEntero();
     objVantana.mostrarMensaje("Ingrese flujo de personas");
     flujo = objVantana.pedirEntero();
     objVantana.mostrarMensaje("Ingresar estado de saturacion");
     saturacion = objVantana.pedirString();
     objVantana.mostrarMensaje("Seleccionar una de las siguientes opciones: 1. En servicion o 2. Fuera de servicio");
     int op = objVantana.pedirEntero();
     servicio = pedirAutorizacion(op);
     Estacion agregar = new Estacion(saturacion, capacidad, flujo, paradas, saturacion, servicio);
     objEstacion.agregar(agregar);
     
    
   
 }
 
 public void gestionFlota(){
     objVantana.mostrarMensaje(" ");
     int op;
     do {  
     objVantana.flota();
     op = entero();
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
                asignarRuta();
                break;
            case 6:
                listaBus();
                break;
            case 7:
                objVantana.mostrarMensaje("Saliendo de gestionar flota");
                break;
            default:
                objVantana.mostrarMensaje("Opcion Invalida. Por favor, ingresar una de las opciones disponibles");
     }
     } while (op!=7);
 }
 
 public void agregarBus(){
  //Metodo de pedir datos(Se esta validando si agregar datos precargados)   
  String ruta, placa, entrada;
  int ID, capacidad, asientos;
  objVantana.mostrarMensaje("---Agregando Bus---");
  objVantana.mostrarMensaje("Ingrese el ID del bus:");
  ID = objVantana.pedirEntero();
  objVantana.mostrarMensaje("Ingrese la placa del bus:");
  placa = objVantana.pedirString();
  objVantana.mostrarMensaje("Ingrese el año de entrada del bus;");
  entrada = objVantana.pedirString();
  objVantana.mostrarMensaje("Ingrese la capacidad del bus:");
  capacidad = objVantana.pedirEntero();
  objVantana.mostrarMensaje("Ingrese el numero de asientos del bus:");
  asientos = objVantana.pedirEntero();
 // objVantana.mostrarMensaje("Ingrese la ruta asignada del proyecto");
 // ruta = objVantana.pedirString();
  Bus agregar = new Bus(ID, capacidad, null, placa, entrada, asientos);
  objDiccionario.agregarBus(agregar);
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
     if(objDiccionario.getBuses() == null || objDiccionario.getBuses().isEmpty()){
           objVantana.mostrarMensaje("Lista de buses vacia");
       return;
      }

     objVantana.mostrarMensaje("Ingrese el ID para acceder");
     int id = objVantana.pedirEntero();
     Bus bus = objDiccionario.obtenerBus(id);
     if(bus == null){
         objVantana.mostrarMensaje("El bus con ID " + id + " no esta en la lista");
     }else{
         objVantana.mostrarMensaje("Informacion del bus: \n" + bus.toString());
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
 
 public void asignarRuta(){
     objVantana.mostrarMensaje("---Asignado Ruta---");
     objVantana.mostrarMensaje("Ingrese el ID del Bus");
     int id = objVantana.pedirEntero();
     Bus bus = objDiccionario.obtenerBus(id);
       if( bus !=null){
           listaRutas();
           objVantana.mostrarMensaje("Ingrese El nombre de la ruta que se va asignar");
           String nombre = objVantana.pedirString();
           
          String p =  objEnlazada.buscar(nombre).getConexa().getNombreRuta();
          if(p!=null){
          bus.setRutaAsignada(p);
          objVantana.mostrarMensaje("Ruta asignada");
          }
       }else{
           objVantana.mostrarMensaje("Bus no encontrado");
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
 
 public void gentionRutas(){
     objVantana.mostrarMensaje(" ");
     objVantana.mostrarMensaje("Gestion de Rutas:");
      int op;
     do { 
     objVantana.mostrarMensaje(" ");
     objVantana.gestionRutas();
     op = entero();
     switch (op){
         case 1:
                agregarRuta();
                break;
            case 2:
                eliminarRuta();
                break;
            case 3:
                 asignarRuta(); 
            break;
            case 4:
               modificarRuta();
                break;
            case 5:
                listaRutas();
                break;
            case 6:
                objVantana.mostrarMensaje("Saliendo de gestion de rutas");
                break;
            default:
                objVantana.mostrarMensaje("Opcion invalidad. Por favor, ingresar una de las opciones disponibles");
     }
     } while (op!=6);
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
     objRuta.setNombreRuta(nombre);
     objVantana.mostrarMensaje("Ingrese el nuevo origen de la ruta: ");
     objRuta.setOrigen(objVantana.pedirString());
     objVantana.mostrarMensaje("Ingrese el nuevo destino de la ruta: ");
     objRuta.setDestino(objVantana.pedirString());
     objVantana.mostrarMensaje("Ingrese el tiempo estimado de la ruta: ");
     objRuta.setTiempoEstimado(objVantana.pedirEntero());
   //  Ruta rutaModificada = new Ruta(nombre, origen, destino, tiempo);
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
    objVantana.mostrarMensaje(objEnlazada.MostarLista());
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
     objVantana.mostrarMensaje(" ");
     int op;
     do {
         objVantana.mostrarMensaje(" ");
       objVantana.acceso();
     op = entero();
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
               objVantana.mostrarMensaje("Opcion invalidad. Ingrese una de las opciones disponibles");
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
 
 public void mostrarEstacionesRutas(){
     for (Estacion estacion : objEstacion.getEstacion()) {
         objVantana.mostrarMensaje(" ");
         objVantana.mostrarMensaje("Estacion " + estacion.getNombreEstacion());
         objVantana.mostrarMensaje("Rutas conexas: ");
         String conexa = estacion.mostrarRutasConexas();
         if(conexa != null && !conexa.isEmpty()){
             objVantana.mostrarMensaje(conexa);
         }else{
            objVantana.mostrarMensaje("No hay rutas conexas");
        }
     }
 }

 
 
 public void datosPrecargados(){
     
     //Datos precargados de estacion
     Estacion a1 = new Estacion("Ricaute", 1000, 500,null, "Moderada", true);
    objEstacion.agregar(a1);
     Estacion a2 = new Estacion("Terminal", 600, 700,null, "Normal", true);
    objEstacion.agregar(a2);
    Estacion a3 = new Estacion("Sur", 200, 400, null, "Alta", true);
    objEstacion.agregar(a3);
    Estacion a4 = new Estacion("Centro", 300, 600, null, "Normal", true);
    objEstacion.agregar(a4);
     
     
      //Datos de rutas precargados
     Ruta r1 = new Ruta("P20", "Ricaute", "Sur", 80);
     objEnlazada.insertFinal(r1);
     a1.addListaConexas(r1);
     Ruta r2 = new Ruta("M20", "Sur", "Ricaute", 80);
     objEnlazada.insertFinal(r2);
     a2.addListaConexas(r2);
     Ruta r3 = new Ruta("T30", "Terminal", "Centro", 75);
    objEnlazada.insertFinal(r3);
    a3.addListaConexas(r3);
    Ruta r4 = new Ruta("T40", "Centro", "Terminal", 75);
    objEnlazada.insertFinal(r4);
    a4.addListaConexas(r4);
    Ruta r5 = new Ruta("P10", "Ricaute", "Centro", 90);
    objEnlazada.insertFinal(r5);
    a1.addListaConexas(r5);
    Ruta r6 = new Ruta("P50", "Sur", "Terminal", 70);
    objEnlazada.insertFinal(r6);
    a1.addListaConexas(r6);
     
     //Datos de Buse precargados
     Bus b1 = new Bus(23, 200, null, "12Pl", "2014", 100);
     objDiccionario.agregarBus(b1);
     b1.setRutaAsignada(r2.getNombreRuta());
     Bus b2 = new Bus(12, 250,  null, "25Tk", "2017", 110);
     b2.setRutaAsignada(r4.getNombreRuta());
     objDiccionario.agregarBus(b2);
     
     
     //Datos de usuaios precargados
     Usuario u1 = new Usuario(34, true, "Pasajero");
     objHashTable.agregarUsuario(u1);
     Usuario u2 = new Usuario(45, false, "Pasajero");
     objHashTable.agregarUsuario(u2);
 }

  public int entero(){
      boolean validacion = false;
      int numero = 0;
      while (!validacion) {  
          try{
           numero = objVantana.pedirEntero();
          validacion = true;
          }catch(NumberFormatException e){
              objVantana.mostrarMensaje("Datos de entrada invalidos. Ingresar entradas validas");
          }
      }
      
        return numero;
  }
 
}
