 
package co.edu.konradlorenz.controller;
import co.edu.konradlorenz.model.Bus;
import co.edu.konradlorenz.model.estructuras.ListaBus;
import co.edu.konradlorenz.model.Estacion;
import co.edu.konradlorenz.model.GrafoRutas;
import co.edu.konradlorenz.model.estructuras.ListaUsuarios;
import co.edu.konradlorenz.model.ListaRutas;
import co.edu.konradlorenz.model.estructuras.ListaEstacion;
import co.edu.konradlorenz.model.Ruta;
import co.edu.konradlorenz.model.Usuario;
import co.edu.konradlorenz.view.Vantana;

public class Controlador {
    Vantana objVantana = new Vantana();
    ListaEstacion objEstacion = new ListaEstacion();
    Estacion objEstacion1 = new Estacion();
    ListaBus objDiccionario = new ListaBus();
    Usuario objUsuario = new Usuario();
    ListaUsuarios objHashTable = new ListaUsuarios();
    Bus objBus = new Bus();
    Ruta objRuta = new Ruta();
    GrafoRutas grafo = new GrafoRutas();
    ListaRutas objEnlazada = new ListaRutas();
    public void run(){
        objVantana.mostrarMensaje(" ");
         datosPrecargados();
        int op;
        do{
            objVantana.mostrarMensaje("--MENU PRINCIPAL--");
            objVantana.mostrarMensaje(" ");
            objVantana.menu();
            op = entero();
        switch (op) {
            case 1:
                monitoreo();
                break;
            case 2:
                gestionEstacion();
                break;
            case 3:
                gestionFlota();
                break;
            case 4:
                calcularRutas();
                break;
            case 5:
                gentionRutas();
                break;
            case 6:
                validarAcceso();
                break;
            case 7:
                objVantana.mostrarMensaje("saliendo del Programa");
                break;
            default:
                objVantana.mostrarMensaje("Opcion invalida. Por favor, ingresar una de las opciones disponibles.");
        }
        }while (op!=7);           
               
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
         objVantana.mostrarMensaje("Capacidad de la Estacion: " + estacion.getCapacidadMaxima());
         objVantana.mostrarMensaje("Flujo de personas: " + estacion.getFlujoPersonas());
         objVantana.mostrarMensaje("Saturacion: " + estacion.getSaturacion());
         objVantana.mostrarMensaje("Funcionamiento: " + servicio(estacion.isFuncionamiento()));
         objVantana.mostrarMensaje(" ");

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
 
 public boolean pedirBoolean(int op){
     boolean funcionamiento = false;
     
     do{
     if (op==1) {
         funcionamiento = true;
     }else if (op==2){
         funcionamiento = false;
     }  
     }while(op!=1 || op!=2);
    return  funcionamiento;
 }
 
 public void gestionEstacion(){
     int op;
     do {  
        objVantana.gestionEstacion();
        op = entero();
         switch (op) {
             case 1:
                 datosEstacion();
                 break;
             case 2:
                 eliminarEstacion();
                 break;
             case 3:
                 modificarEstacion();
                 break;
             case 4:
                 asignarParada();
                 break;
             case 5:
                 objVantana.mostrarMensaje("Saliendo del programa");
                 break;
             default:
                objVantana.mostrarMensaje("Ingresar una de las opciones disponibles");
         }
         
     } while (op!=5);
 }
 public void datosEstacion(){
     // Metodo de agregar datos de la estacion(Se esta validando si se desea agregar los datos precargados)
     String nombre, saturacion;
     int capacidad, flujo;
     ListaRutas paradas;
     boolean servicio;
     objVantana.mostrarMensaje("--Agregando estacion--");
     objVantana.mostrarMensaje("Ingrese el nombre de la estacion");
     nombre = objVantana.pedirString();
     objVantana.mostrarMensaje("Ingrese la capacidad maxima de la estacion");
     capacidad = entero();
     objVantana.mostrarMensaje("Ingrese flujo de personas");
     flujo = entero();
     objVantana.mostrarMensaje("Ingresar estado de saturacion");
     saturacion = objVantana.pedirString();
     objVantana.mostrarMensaje("Seleccionar una de las siguientes opciones: \n1. En servicion \n2. Fuera de servicio");
     int op = entero();
     servicio = pedirAutorizacion(op);
     Estacion agregar = new Estacion(nombre, capacidad, flujo, null, saturacion, servicio);
     objEstacion.agregar(agregar); 
 }
 
 public void eliminarEstacion(){
     if(objEstacion!= null){
     objVantana.mostrarMensaje("Ingrese el nombre de la estacion a eliminar:");
     String nombre = objVantana.pedirString();
     Estacion estacion = objEstacion.buscarNombre(nombre);
     if(estacion == null){
         objVantana.mostrarMensaje("La estacio " + nombre + " no esta en la lista");
     }else{  
       objEstacion.eliminar(nombre);
     }}else{
         objVantana.mostrarMensaje("Lista de estaciones vacia");
     }
 }
  public void modificarEstacion(){
     if(objEstacion.getEstacion()!=null){
     objVantana.mostrarMensaje("Ingrese el nombre de la estacion a modificar ");
     String nombre = objVantana.pedirString();
     Estacion estacion = objEstacion.buscarNombre(nombre);
     if(estacion != null){
         objVantana.mostrarMensaje("Ingrese la capacidad Maxima ");
         estacion.setCapacidadMaxima(entero());
         objVantana.mostrarMensaje("Ingrese saturacion");
         estacion.setSaturacion(objVantana.pedirString());
          objVantana.mostrarMensaje("Ingresel el funcionamiendo de la estacion. 1. En servicio o 2. Fuera de Servicio");
          boolean servicio = pedirBoolean(entero());
         estacion.setFuncionamiento(servicio);
         objVantana.mostrarMensaje("Ingrese el año del bus: ");
         
     }else{
         objVantana.mostrarMensaje("Estacion" + nombre + " no esta en la lista");
     }}else{
         objVantana.mostrarMensaje("No hay estaciones en la lista");
     }
 }
 
 public void listaEstaciones(){
     objVantana.mostrarMensaje("---Lista Estaciones---");
     for (Estacion estacion : objEstacion.getEstacion()) {
         objVantana.mostrarMensaje("Estacion: " + estacion.getNombreEstacion());
     }
 }
 
 public void asignarParada(){
     objVantana.mostrarMensaje("-ASIGNADO RUTA-");
     objVantana.mostrarMensaje("Ingrese el nombre de la Estacion");
     String nombre = objVantana.pedirString();
     Estacion estacion = objEstacion.buscarNombre(nombre);
     if(estacion!=null){
         listaRutas();
      objVantana.mostrarMensaje("Ingrese el nombre de la ruta");
      String rutaNombre = objVantana.pedirString();
      Ruta ruta = objEnlazada.buscarRuta(rutaNombre);
     if(ruta!=null){
         estacion.addListaConexas(ruta);
         objVantana.mostrarMensaje("Se agrego correctamente");
     }else{
         objVantana.mostrarMensaje("La ruta " + rutaNombre + " no esta en la lista");
     }
              
     }else{
         objVantana.mostrarMensaje("La estacion " + nombre + " no esta en la lista");
     }
     
 }
 

 public void gestionFlota(){
     objVantana.mostrarMensaje(" ");
     int op;
     do {  
         objVantana.mostrarMensaje("--Gestion de Flota--");
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
  ID = entero();
  objVantana.mostrarMensaje("Ingrese la placa del bus:");
  placa = objVantana.pedirString();
  objVantana.mostrarMensaje("Ingrese el año de entrada del bus;");
  entrada = objVantana.pedirString();
  objVantana.mostrarMensaje("Ingrese la capacidad del bus:");
  capacidad = entero();
  objVantana.mostrarMensaje("Ingrese el numero de asientos del bus:");
  asientos = entero();
  Bus agregar = new Bus(ID, capacidad, null, placa, entrada, asientos);
  objDiccionario.agregarBus(agregar);
 }
 
 public void retirarBus(){
     if(objDiccionario.getBuses()!= null){
     objVantana.mostrarMensaje("Ingrese el ID del Bus a retirar:");
     int id = entero();
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
     int id = entero();
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
     int id = entero();
     Bus bus = objDiccionario.obtenerBus(id);
     if(bus != null){
         objVantana.mostrarMensaje("Ingrese la placa: ");
         bus.setPlaca(objVantana.pedirString());
         objVantana.mostrarMensaje("Ingrese la capacidad del bus: ");
         bus.setCapacidad(entero());
          objVantana.mostrarMensaje("Ingrese la ruta del bus: ");
         bus.setRutaAsignada(objVantana.pedirString());
         objVantana.mostrarMensaje("Ingrese el año del bus: ");
         bus.setAñoEntrada(objVantana.pedirString());
          objVantana.mostrarMensaje("Ingrese el numero de asientos del bus");
         bus.setNumAsientos(entero());
     }else{
         objVantana.mostrarMensaje("El bus con ID " + id + " no esta en la lista");
     }}else{
         objVantana.mostrarMensaje("No hay buses en la lista");
     }
 }
 
 public void asignarRuta(){
     objVantana.mostrarMensaje("---Asignado Ruta---");
     objVantana.mostrarMensaje("Ingrese el ID del Bus");
     int id = entero();
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
     
      int op;
     do {
     objVantana.mostrarMensaje("---Gestion de Rutas---");
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
     tiempo = entero();
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
     objVantana.mostrarMensaje("--Modificando Ruta--");
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
     objRuta.setTiempoEstimado(entero());
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
             objVantana.mostrarMensaje("Estacion: " + estacion.getNombreEstacion() + ":" + " Estacion llena");
         }else{
             objVantana.mostrarMensaje("Estacion: " +estacion.getNombreEstacion() + ": " +" Sin anomalias");
         }
     }}else{
            objVantana.mostrarMensaje("No hay estaciones");
             }
 }
 
 public void validarAcceso(){
     objVantana.mostrarMensaje(" ");
     int op;
     do {
         objVantana.mostrarMensaje("---VALIDACION---");
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
     objVantana.mostrarMensaje("--Ingresando Usuariuo--");
     objVantana.mostrarMensaje("Ingrese el ID del usuario");
     int id = entero();
     objVantana.mostrarMensaje("Ingrese acceso: 1.Autorizado o 2.Denegado");
     int op = entero();
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
     objVantana.mostrarMensaje("--Validando acceso--");
     objVantana.mostrarMensaje("Ingrese ID del usuario");
     int id = entero();
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
     objVantana.mostrarMensaje("--Listas de Paradas Por Estacion--");
     for (Estacion estacion : objEstacion.getEstacion()) {
         objVantana.mostrarMensaje(" ");
         objVantana.mostrarMensaje("Estacion: " + estacion.getNombreEstacion());
         objVantana.mostrarMensaje("Rutas conexas: ");
         String conexa = estacion.mostrarRutasConexas();
         if(conexa != null && !conexa.isEmpty()){
             objVantana.mostrarMensaje(conexa);
         }else{
            objVantana.mostrarMensaje("No hay rutas conexas");
        }
     }
 }

 public void monitoreo(){
     
     int op;
     do{
         objVantana.mostrarMensaje("---MONITOREO---");
       objVantana.monitoreo();
       op = entero();
         switch (op) {
             case 1:
                 registrarCantidad();
                 break;
             case 2:
                 alertas();
                 break; 
             case 3:
                 listaEstaciones();
                 break;
             case 4:
                 mostrarEstacionesRutas();
                 break;
             case 5:
                 monitoreoEstacion();
                 break;  
             case 6:
                 objVantana.mostrarMensaje("Saliendo del programa");
                 break;
             default:
                 objVantana.mostrarMensaje("Opcion Invalida. Ingresar datos validos");
         }
    
         
     } while(op!=6);
 }
 
 public void datosPrecargados(){
     
     //Datos precargados de estacion
     Estacion a1 = new Estacion("Ricaurte", 1000, 500,null, "Moderada", true);
    objEstacion.agregar(a1);
     Estacion a2 = new Estacion("Terminal", 600, 700,null, "Normal", true);
    objEstacion.agregar(a2);
    Estacion a3 = new Estacion("Tunal", 200, 400, null, "Alta", true);
    objEstacion.agregar(a3);
    Estacion a4 = new Estacion("ElDorado", 300, 600, null, "Normal", true);
    objEstacion.agregar(a4);
    Estacion a5 = new Estacion("Norte", 150, 200, null, "Saturada", true);
    objEstacion.agregar(a5);
    Estacion a6 = new Estacion("Jimenez", 400, 200, null, "Normal", true);
    objEstacion.agregar(a6);
    
     
     
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
     //Datos precargados del grafo
     grafo.agregarArista("Eldorado", "Ricaurte");
     grafo.agregarArista("Ricaurte", "Jimenez");
     grafo.agregarArista("Jimenez", "Tunal");
     grafo.agregarArista("Jimenez", "Norte");
     grafo.agregarArista("Norte", "Terminal");
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

    private void registrarCantidad() {
        objVantana.mostrarMensaje("--ACTUALIZAR CANTIDAD DE PERSONAS");
    objVantana.mostrarMensaje("Ingrese Nombre de la Estacion ");
    Estacion estacion = objEstacion.buscarNombre(objVantana.pedirString());
    if(estacion != null){
        objVantana.mostrarMensaje("Ingrese la cantidad de personas en la estacion");
        estacion.setFlujoPersonas(entero());
    }else{
        objVantana.mostrarMensaje("Estacion no esta en la lista");
    }
  
    }
    
    public void calcularRutas(){
        objVantana.calcularRutas();
        objVantana.mostrarMensaje("Ingrese la estación de inicio:");
        String inicio = objVantana.pedirString();
        objVantana.mostrarMensaje("Ingrese la estación de destino: ");
        String fin = objVantana.pedirString(); objVantana.mostrarMensaje("");
         objVantana.mostrarMensaje(grafo.mostrarRutaMasCorta(inicio, fin));
         objVantana.mostrarMensaje(" ");
    }
 
}
