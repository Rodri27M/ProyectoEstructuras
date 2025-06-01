package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.estructuras.*;
import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.*;
import java.util.*;
import javax.swing.*;

public class Controlador {

    Home home;
    Principal principal;

    Ventana objVentana = new Ventana();
    ListaEstacion objListaEstacion = new ListaEstacion();
    Estacion objEstacion = new Estacion();
    ListaBus objDiccionario = new ListaBus();
    Usuario objUsuario = new Usuario();
    ListaUsuarios objHashTable = new ListaUsuarios();
    Bus objBus = new Bus();
    Ruta objRuta = new Ruta();
    GrafoRutas objGrafoRutas = new GrafoRutas();
    ListaRutas objListaEnlazada = new ListaRutas();

    public void run() {

//        Esto es la "pantalla de carga"
//        home = new Home();
//        home.setVisible(true);
//        home.setLocationRelativeTo(null);
        principal = new Principal(this);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);

        objVentana.mostrarMensaje(" ");
        datosPrecargados();
        int op;
        do {
            objVentana.mostrarMensaje("--MENU PRINCIPAL--");
            objVentana.mostrarMensaje(" ");
            objVentana.menu();
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
                    objVentana.mostrarMensaje("saliendo del Programa");
                    break;
                default:
                    objVentana.mostrarMensaje("Opcion invalida. Por favor, ingresar una de las opciones disponibles.");
            }
        } while (op != 7);

    }

    public void monitoreoEstacion() {
        objVentana.mostrarMensaje("---MONITOREO EN TIPO REAL---");
        if (objListaEstacion == null || objListaEstacion.getEstacion() == null) {
            objVentana.mostrarMensaje("No esta inicializada en las listas");
            return;
        }
        if (objListaEstacion.getEstacion().isEmpty()) {
            objVentana.mostrarMensaje("Lista de estaciones vacia");
        } else {
            for (Estacion estacion : objListaEstacion.getEstacion()) {
                objVentana.mostrarMensaje("Estacion: " + estacion.getNombreEstacion());
                objVentana.mostrarMensaje("Capacidad de la Estacion: " + estacion.getCapacidadMaxima());
                objVentana.mostrarMensaje("Flujo de personas: " + estacion.getFlujoPersonas());
                objVentana.mostrarMensaje("Saturacion: " + estacion.getSaturacion());
                objVentana.mostrarMensaje("Funcionamiento: " + servicio(estacion.isFuncionamiento()));
                objVentana.mostrarMensaje(" ");

            }
        }
    }

    public String servicio(boolean validar) {
        String servicio;
        if (validar == true) {
            servicio = "En servicio";
        } else {
            servicio = "Fuera de servicio";
        }
        return servicio;
    }

    public boolean pedirBoolean(int op) {
        boolean funcionamiento = false;

        do {
            if (op == 1) {
                funcionamiento = true;
            } else if (op == 2) {
                funcionamiento = false;
            }
        } while (op != 1 || op != 2);
        return funcionamiento;
    }

    public void gestionEstacion() {
        int op;
        do {
            objVentana.gestionEstacion();
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
                    objVentana.mostrarMensaje("Saliendo del programa");
                    break;
                default:
                    objVentana.mostrarMensaje("Ingresar una de las opciones disponibles");
            }

        } while (op != 5);
    }

    public void datosEstacion() {
        // Metodo de agregar datos de la estacion(Se esta validando si se desea agregar los datos precargados)
        String nombre, saturacion;
        int capacidad, flujo;
        ListaRutas paradas;
        boolean servicio;
        objVentana.mostrarMensaje("--Agregando estacion--");
        objVentana.mostrarMensaje("Ingrese el nombre de la estacion");
        nombre = objVentana.pedirString();
        objVentana.mostrarMensaje("Ingrese la capacidad maxima de la estacion");
        capacidad = entero();
        objVentana.mostrarMensaje("Ingrese flujo de personas");
        flujo = entero();
        objVentana.mostrarMensaje("Ingresar estado de saturacion");
        saturacion = objVentana.pedirString();
        objVentana.mostrarMensaje("Seleccionar una de las siguientes opciones: \n1. En servicion \n2. Fuera de servicio");
        int op = entero();
        servicio = pedirAutorizacion(op);
        Estacion agregar = new Estacion(nombre, capacidad, flujo, null, saturacion, servicio);
        objListaEstacion.agregar(agregar);
    }

    public void eliminarEstacion() {
        if (objListaEstacion != null) {
            objVentana.mostrarMensaje("Ingrese el nombre de la estacion a eliminar:");
            String nombre = objVentana.pedirString();
            Estacion estacion = objListaEstacion.buscarNombre(nombre);
            if (estacion == null) {
                objVentana.mostrarMensaje("La estacio " + nombre + " no esta en la lista");
            } else {
                objListaEstacion.eliminar(nombre);
            }
        } else {
            objVentana.mostrarMensaje("Lista de estaciones vacia");
        }
    }

    public void modificarEstacion() {
        if (objListaEstacion.getEstacion() != null) {
            objVentana.mostrarMensaje("Ingrese el nombre de la estacion a modificar ");
            String nombre = objVentana.pedirString();
            Estacion estacion = objListaEstacion.buscarNombre(nombre);
            if (estacion != null) {
                objVentana.mostrarMensaje("Ingrese la capacidad Maxima ");
                estacion.setCapacidadMaxima(entero());
                objVentana.mostrarMensaje("Ingrese saturacion");
                estacion.setSaturacion(objVentana.pedirString());
                objVentana.mostrarMensaje("Ingresel el funcionamiendo de la estacion. 1. En servicio o 2. Fuera de Servicio");
                boolean servicio = pedirBoolean(entero());
                estacion.setFuncionamiento(servicio);
                objVentana.mostrarMensaje("Ingrese el año del bus: ");

            } else {
                objVentana.mostrarMensaje("Estacion" + nombre + " no esta en la lista");
            }
        } else {
            objVentana.mostrarMensaje("No hay estaciones en la lista");
        }
    }

    public void listaEstaciones() {
        objVentana.mostrarMensaje("---Lista Estaciones---");
        for (Estacion estacion : objListaEstacion.getEstacion()) {
            objVentana.mostrarMensaje("Estacion: " + estacion.getNombreEstacion());
        }
    }

    public void asignarParada() {
        objVentana.mostrarMensaje("-ASIGNADO RUTA-");
        objVentana.mostrarMensaje("Ingrese el nombre de la Estacion");
        String nombre = objVentana.pedirString();
        Estacion estacion = objListaEstacion.buscarNombre(nombre);
        if (estacion != null) {
            listaRutas();
            objVentana.mostrarMensaje("Ingrese el nombre de la ruta");
            String rutaNombre = objVentana.pedirString();
            Ruta ruta = objListaEnlazada.buscarRuta(rutaNombre);
            if (ruta != null) {
                estacion.addListaConexas(ruta);
                objVentana.mostrarMensaje("Se agrego correctamente");
            } else {
                objVentana.mostrarMensaje("La ruta " + rutaNombre + " no esta en la lista");
            }

        } else {
            objVentana.mostrarMensaje("La estacion " + nombre + " no esta en la lista");
        }

    }

    public void gestionFlota() {
        objVentana.mostrarMensaje(" ");
        int op;
        do {
            objVentana.mostrarMensaje("--Gestion de Flota--");
            objVentana.flota();
            op = entero();
            switch (op) {
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
                    objVentana.mostrarMensaje("Saliendo de gestionar flota");
                    break;
                default:
                    objVentana.mostrarMensaje("Opcion Invalida. Por favor, ingresar una de las opciones disponibles");
            }
        } while (op != 7);
    }

    public void agregarBus() {
        //Metodo de pedir datos(Se esta validando si agregar datos precargados)   
        String ruta, placa, entrada;
        int ID, capacidad, asientos;
        objVentana.mostrarMensaje("---Agregando Bus---");
        objVentana.mostrarMensaje("Ingrese el ID del bus:");
        ID = entero();
        objVentana.mostrarMensaje("Ingrese la placa del bus:");
        placa = objVentana.pedirString();
        objVentana.mostrarMensaje("Ingrese el año de entrada del bus;");
        entrada = objVentana.pedirString();
        objVentana.mostrarMensaje("Ingrese la capacidad del bus:");
        capacidad = entero();
        objVentana.mostrarMensaje("Ingrese el numero de asientos del bus:");
        asientos = entero();
        Bus agregar = new Bus(ID, capacidad, null, placa, entrada, asientos);
        objDiccionario.agregarBus(agregar);
    }

    public void retirarBus() {
        if (objDiccionario.getBuses() != null) {
            objVentana.mostrarMensaje("Ingrese el ID del Bus a retirar:");
            int id = entero();
            Bus bus = objDiccionario.obtenerBus(id);
            if (bus == null) {
                objVentana.mostrarMensaje("El bus con ID " + id + " no esta en la lista");
            } else {
                objDiccionario.eliminarBus(id);
            }
        } else {
            objVentana.mostrarMensaje("Lista de buses vacia");
        }
    }

    public void accerderBus() {
        if (objDiccionario.getBuses() == null || objDiccionario.getBuses().isEmpty()) {
            objVentana.mostrarMensaje("Lista de buses vacia");
            return;
        }

        objVentana.mostrarMensaje("Ingrese el ID para acceder");
        int id = entero();
        Bus bus = objDiccionario.obtenerBus(id);
        if (bus == null) {
            objVentana.mostrarMensaje("El bus con ID " + id + " no esta en la lista");
        } else {
            objVentana.mostrarMensaje("Informacion del bus: \n" + bus.toString());
        }
    }

    public void modificarBus() {
        if (objDiccionario.getBuses() != null) {
            objVentana.mostrarMensaje("Ingrese el ID del bus que se va a modificar ");
            int id = entero();
            Bus bus = objDiccionario.obtenerBus(id);
            if (bus != null) {
                objVentana.mostrarMensaje("Ingrese la placa: ");
                bus.setPlaca(objVentana.pedirString());
                objVentana.mostrarMensaje("Ingrese la capacidad del bus: ");
                bus.setCapacidad(entero());
                objVentana.mostrarMensaje("Ingrese la ruta del bus: ");
                bus.setRutaAsignada(objVentana.pedirString());
                objVentana.mostrarMensaje("Ingrese el año del bus: ");
                bus.setAñoEntrada(objVentana.pedirString());
                objVentana.mostrarMensaje("Ingrese el numero de asientos del bus");
                bus.setNumAsientos(entero());
            } else {
                objVentana.mostrarMensaje("El bus con ID " + id + " no esta en la lista");
            }
        } else {
            objVentana.mostrarMensaje("No hay buses en la lista");
        }
    }

    public void asignarRuta() {
        objVentana.mostrarMensaje("---Asignado Ruta---");
        objVentana.mostrarMensaje("Ingrese el ID del Bus");
        int id = entero();
        Bus bus = objDiccionario.obtenerBus(id);
        if (bus != null) {
            listaRutas();
            objVentana.mostrarMensaje("Ingrese El nombre de la ruta que se va asignar");
            String nombre = objVentana.pedirString();

            String p = objListaEnlazada.buscar(nombre).getConexa().getNombreRuta();
            if (p != null) {
                bus.setRutaAsignada(p);
                objVentana.mostrarMensaje("Ruta asignada");
            }
        } else {
            objVentana.mostrarMensaje("Bus no encontrado");
        }
    }

    public void listaBus() {
        if (objDiccionario.getBuses() == null) {
            objVentana.mostrarMensaje("No hay lista de Buses");
        } else {
            objVentana.mostrarMensaje("Listado de buses ");
            for (Bus bus : objDiccionario.getBuses().values()) {
                objVentana.mostrarMensaje(" Bus: " + bus.toString());
            }
        }
    }

    public void gentionRutas() {
        objVentana.mostrarMensaje(" ");

        int op;
        do {
            objVentana.mostrarMensaje("---Gestion de Rutas---");
            objVentana.mostrarMensaje(" ");
            objVentana.gestionRutas();
            op = entero();
            switch (op) {
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
                    objVentana.mostrarMensaje("Saliendo de gestion de rutas");
                    break;
                default:
                    objVentana.mostrarMensaje("Opcion invalidad. Por favor, ingresar una de las opciones disponibles");
            }
        } while (op != 6);
    }

    public void agregarRuta() {
        objVentana.mostrarMensaje("Ruta Nueva:");
        String nombre, origen, destino;
        int tiempo;
        objVentana.mostrarMensaje("Ingrese el Nombre de ruta");
        nombre = objVentana.pedirString();
        objVentana.mostrarMensaje("Ingrese la Partida de inicio de la Ruta");
        origen = objVentana.pedirString();
        objVentana.mostrarMensaje("Ingrese el destino de la ruta");
        destino = objVentana.pedirString();
        objVentana.mostrarMensaje("Ingrese el tiempo estimado de la ruta");
        tiempo = entero();
        Ruta objRuta = new Ruta(nombre, origen, destino, tiempo);
        objListaEnlazada.insertFinal(objRuta);

    }

    public void eliminarRuta() {
        objVentana.mostrarMensaje("---Eliminando Ruta---");
        objVentana.mostrarMensaje("Ingrese el nombre ruta a Eliminar");
        String nombre = objVentana.pedirString();
        objListaEnlazada.borrar(nombre);
    }

    public void modificarRuta() {
        objVentana.mostrarMensaje("--Modificando Ruta--");
        String nombre, origen, destino;
        int tiempo;
        objVentana.mostrarMensaje("Nombre de la ruta a modificar");
        nombre = objVentana.pedirString();

        if (objListaEnlazada.buscar(nombre) != null) {
            objRuta.setNombreRuta(nombre);
            objVentana.mostrarMensaje("Ingrese el nuevo origen de la ruta: ");
            objRuta.setOrigen(objVentana.pedirString());
            objVentana.mostrarMensaje("Ingrese el nuevo destino de la ruta: ");
            objRuta.setDestino(objVentana.pedirString());
            objVentana.mostrarMensaje("Ingrese el tiempo estimado de la ruta: ");
            objRuta.setTiempoEstimado(entero());
            //  Ruta rutaModificada = new Ruta(nombre, origen, destino, tiempo);
            boolean modificacion = objListaEnlazada.modificar(nombre, objRuta);
            if (modificacion) {
                objVentana.mostrarMensaje("Ruta Modificada");
            } else {
                objVentana.mostrarMensaje("La ruta no fue modificada");
            }
        } else {
            objVentana.mostrarMensaje("La ruta no esta en la lista ");
        }
    }

    public void listaRutas() {
        objVentana.mostrarMensaje("Lista Rutas: ");
        objVentana.mostrarMensaje(objListaEnlazada.MostarLista());
    }

    public void alertas() {
        objVentana.mostrarMensaje("ALERTAS: ");
        if (objListaEstacion.getEstacion() != null) {
            for (Estacion estacion : objListaEstacion.getEstacion()) {
                if (estacion.getFlujoPersonas() > estacion.getCapacidadMaxima()) {
                    objVentana.mostrarMensaje("Estacion: " + estacion.getNombreEstacion() + ":" + " Estacion llena");
                } else {
                    objVentana.mostrarMensaje("Estacion: " + estacion.getNombreEstacion() + ": " + " Sin anomalias");
                }
            }
        } else {
            objVentana.mostrarMensaje("No hay estaciones");
        }
    }

    public void validarAcceso() {
        objVentana.mostrarMensaje(" ");
        int op;
        do {
            objVentana.mostrarMensaje("---VALIDACION---");
            objVentana.mostrarMensaje(" ");
            objVentana.acceso();
            op = entero();
            switch (op) {
                case 1:
                    ingresar();
                    break;
                case 2:
                    validar();
                    break;
                case 3:
                    objVentana.mostrarMensaje("Saliendo de validar acceso");
                    break;
                default:
                    objVentana.mostrarMensaje("Opcion invalidad. Ingrese una de las opciones disponibles");
            }
        } while (op != 3);
    }

    public void ingresar() {
        objVentana.mostrarMensaje("--Ingresando Usuariuo--");
        objVentana.mostrarMensaje("Ingrese el ID del usuario");
        int id = entero();
        objVentana.mostrarMensaje("Ingrese acceso: 1.Autorizado o 2.Denegado");
        int op = entero();
        boolean autorizacion = pedirAutorizacion(op);
        objVentana.mostrarMensaje("Ingrese el tipo de Usuario");
        String tipo = objVentana.pedirString();
        Usuario agregar = new Usuario(id, autorizacion, tipo);
        objHashTable.agregarUsuario(agregar);

    }

    public boolean pedirAutorizacion(int op) {
        int val = op;
        boolean acceso = false;
        do {
            if (val == 1) {
                acceso = true;
            } else if (val == 2) {
                acceso = false;
            }

        } while (op != 1 && op != 2);
        return acceso;
    }

    public void validar() {
        objVentana.mostrarMensaje("--Validando acceso--");
        objVentana.mostrarMensaje("Ingrese ID del usuario");
        int id = entero();
        if (objHashTable.getUsuarios().isEmpty()) {
            objVentana.mostrarMensaje("Lista vacia");
        } else {
            if (objHashTable.obtenerUsuario(id) == null) {
                objVentana.mostrarMensaje("Usiario con ID " + id + " no esta en el sistema");
            } else {
                objVentana.mostrarMensaje("Usuario: " + objHashTable.obtenerUsuario(id).toString());
            }
        }

    }

    public void mostrarEstacionesRutas() {
        objVentana.mostrarMensaje("--Listas de Paradas Por Estacion--");
        for (Estacion estacion : objListaEstacion.getEstacion()) {
            objVentana.mostrarMensaje(" ");
            objVentana.mostrarMensaje("Estacion: " + estacion.getNombreEstacion());
            objVentana.mostrarMensaje("Rutas conexas: ");
            String conexa = estacion.mostrarRutasConexas();
            if (conexa != null && !conexa.isEmpty()) {
                objVentana.mostrarMensaje(conexa);
            } else {
                objVentana.mostrarMensaje("No hay rutas conexas");
            }
        }
    }

    public void monitoreo() {

        int op;
        do {
            objVentana.mostrarMensaje("---MONITOREO---");
            objVentana.monitoreo();
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
                    objVentana.mostrarMensaje("Saliendo del programa");
                    break;
                default:
                    objVentana.mostrarMensaje("Opcion Invalida. Ingresar datos validos");
            }

        } while (op != 6);
    }

    public void datosPrecargados() {

        //Datos precargados de estacion
        Estacion a1 = new Estacion("Ricaurte", 1000, 500, null, "Moderada", true);
        objListaEstacion.agregar(a1);
        Estacion a2 = new Estacion("Terminal", 600, 700, null, "Normal", true);
        objListaEstacion.agregar(a2);
        Estacion a3 = new Estacion("Tunal", 200, 400, null, "Alta", true);
        objListaEstacion.agregar(a3);
        Estacion a4 = new Estacion("ElDorado", 300, 600, null, "Normal", true);
        objListaEstacion.agregar(a4);
        Estacion a5 = new Estacion("Norte", 150, 200, null, "Saturada", true);
        objListaEstacion.agregar(a5);
        Estacion a6 = new Estacion("Jimenez", 400, 200, null, "Normal", true);
        objListaEstacion.agregar(a6);

        //Datos de rutas precargados
        Ruta r1 = new Ruta("P20", "Ricaute", "Sur", 80);
        objListaEnlazada.insertFinal(r1);
        a1.addListaConexas(r1);
        Ruta r2 = new Ruta("M20", "Sur", "Ricaute", 80);
        objListaEnlazada.insertFinal(r2);
        a2.addListaConexas(r2);
        Ruta r3 = new Ruta("T30", "Terminal", "Centro", 75);
        objListaEnlazada.insertFinal(r3);
        a3.addListaConexas(r3);
        Ruta r4 = new Ruta("T40", "Centro", "Terminal", 75);
        objListaEnlazada.insertFinal(r4);
        a4.addListaConexas(r4);
        Ruta r5 = new Ruta("P10", "Ricaute", "Centro", 90);
        objListaEnlazada.insertFinal(r5);
        a1.addListaConexas(r5);
        Ruta r6 = new Ruta("P50", "Sur", "Terminal", 70);
        objListaEnlazada.insertFinal(r6);
        a1.addListaConexas(r6);

        //Datos de Buse precargados
        Bus b1 = new Bus(23, 200, null, "12Pl", "2014", 100);
        objDiccionario.agregarBus(b1);
        b1.setRutaAsignada(r2.getNombreRuta());
        Bus b2 = new Bus(12, 250, null, "25Tk", "2017", 110);
        b2.setRutaAsignada(r4.getNombreRuta());
        objDiccionario.agregarBus(b2);

        //Datos de usuaios precargados
        Usuario u1 = new Usuario(34, true, "Pasajero");
        objHashTable.agregarUsuario(u1);
        Usuario u2 = new Usuario(45, false, "Pasajero");
        objHashTable.agregarUsuario(u2);
        //Datos precargados del grafo
        objGrafoRutas.agregarArista("Eldorado", "Ricaurte");
        objGrafoRutas.agregarArista("Ricaurte", "Jimenez");
        objGrafoRutas.agregarArista("Jimenez", "Tunal");
        objGrafoRutas.agregarArista("Jimenez", "Norte");
        objGrafoRutas.agregarArista("Norte", "Terminal");
    }

    public int entero() {
        //Método sobrecargado para que no explote todo el codigo xd
        int numero = -1;
        
        try {
            numero = objVentana.pedirEntero();
            objVentana.mostrarMensaje("Usando metodo entero() sobrecargado");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        
        return numero;
    }

    public Integer entero(JTextField txt) {

        String texto = txt.getText().trim();

        if (texto.isEmpty()) {
            return null;
        }

        try {
            return Integer.valueOf(texto);
        } catch (NumberFormatException e) {
            objVentana.mostrarMensaje("Datos de entrada invalidos. Ingresar entradas validas");
            return null;
        }
    }

    public void registrarCantidad() {

        Integer cantidad = entero(principal.getTxtNumeroPersonas());

        if (cantidad == null) {
            JOptionPane.showMessageDialog(principal, "Debe ingresar un número de personas", "Transmilenio S.A.", JOptionPane.ERROR_MESSAGE);
            return; //No continua si está vacío
        } else if (cantidad < 0) {
            JOptionPane.showMessageDialog(principal, "El número no debe ser negativo", "Transmilenio S.A.", JOptionPane.ERROR_MESSAGE);
            return; //No continua si es negativo
        }

        String nombreEstacion = principal.getLstListEstaciones().getSelectedValue();
        Estacion estacion = objListaEstacion.buscarNombre(nombreEstacion);

        if (estacion != null) {
            estacion.setFlujoPersonas(cantidad);
            JOptionPane.showMessageDialog(principal, "Número de personas registrado exitosamente", "Transmilenio S.A.", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(principal, "Debe seleccionar una estación", "Transmilenio S.A.", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void calcularRutas() {
        objVentana.calcularRutas();
        objVentana.mostrarMensaje("Ingrese la estación de inicio:");
        String inicio = objVentana.pedirString();
        objVentana.mostrarMensaje("Ingrese la estación de destino: ");
        String fin = objVentana.pedirString();
        objVentana.mostrarMensaje("");
        objVentana.mostrarMensaje(objGrafoRutas.mostrarRutaMasCorta(inicio, fin));
        objVentana.mostrarMensaje(" ");
    }

    //VIEW
    public void mostrarEstacionesEnLista() {
        List<Estacion> estaciones = objListaEstacion.getEstacion();
        String[] nombres = estaciones.stream()
                .map(Estacion::getNombreEstacion)
                .toArray(String[]::new);
        principal.setListaEstaciones(nombres);
    }

}
