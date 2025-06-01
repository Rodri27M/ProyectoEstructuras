package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.bus.*;
import co.edu.konradlorenz.model.enums.*;
import co.edu.konradlorenz.model.route.*;
import co.edu.konradlorenz.model.station.*;
import co.edu.konradlorenz.model.user.*;
import co.edu.konradlorenz.view.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;

public class Controlador {

    //VIEW
    View view = new View();
    Home home;
    Principal principal;

    //MODEL
    StationList stationList = new StationList();
    BusHashMap busHashMap = new BusHashMap();
    UsersHashtable userHashtable = new UsersHashtable();
    RoutesLinkedList routesLinkedList = new RoutesLinkedList();
    RouteGraphMap RouteGraphMap = new RouteGraphMap();

    //OTHERS
    boolean save = true;//TODO: implement a future database

    public void run() {

        preloadData();

        open();

        int op;
        do {//TODO: Delete when refactored to GUI
            view.showMessage("--MENU PRINCIPAL--");
            view.menu();
            op = Controlador.this.checkInteger();
            switch (op) {
                case 3 ->
                    fleetManagement();
                case 4 ->
                    calculateRoutes();
                case 5 ->
                    routesManagement();
                case 6 ->
                    validateAccess();
                case 7 ->
                    view.showMessage("saliendo del Programa");
                default ->
                    view.showMessage("Opcion invalida. Por favor, ingresar una de las opciones disponibles.");
            }
        } while (op != 7);
    }//run

    public void open() {

        home = new Home();
        home.setVisible(true);
        home.setLocationRelativeTo(null);

        for (int i = 1; i <= 100; i++) {
            try {
                home.getProgressBar().setValue(i);
                Thread.sleep(75);//default by 13rian -> 75
            } catch (InterruptedException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Los siguientes mensajes son solo estéticos, pero pueden ser implementados de mejor forma al cargar con algo real.
            switch (i) {
                case 1 ->
                    home.getLblMessage().setText("Conectando con la base de datos...");
                case 25 ->
                    home.getLblMessage().setText("Cargando estaciones...");
                case 50 ->
                    home.getLblMessage().setText("Cargando grafos...");
                case 75 ->
                    home.getLblMessage().setText("Analizando rutas óptimas...");
            }

        }

        home.dispose();

        principal = new Principal(this);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);

    }//open

    public void setStationsLists(String[] names) {
        //TODO: Implementar una lista que guarde todas las listas del GUI y las recorra para no andar actualizando una a una en este method xd
        principal.getLstListaEstaciones1().setListData(names);
        principal.getLstListaEstaciones2().setListData(names);
        principal.getLstListaEstaciones3().setListData(names);
        principal.getLstListaEstaciones4().setListData(names);
        principal.getLstListaEstaciones5().setListData(names);
    }//setStationsLists

    public void recordNumberOfPeople() {

        Integer amount = checkInteger(principal.getTxtNumeroPersonas());

        if (amount == null) {
            view.showMessage(principal, "Debe ingresar un número de personas", JOptionPane.ERROR_MESSAGE);
            return; //No continua si está vacío
        } else if (amount < 0) {
            view.showMessage(principal, "El número no debe ser negativo", JOptionPane.ERROR_MESSAGE);
            return; //No continua si es negativo
        }

        String nameEstacion = principal.getLstListaEstaciones1().getSelectedValue();
        Station estacion = stationList.findName(nameEstacion);

        if (estacion != null) {
            estacion.setFlowOfPeople(amount);
            view.showMessage(principal, "Número de personas registrado exitosamente", JOptionPane.PLAIN_MESSAGE);
        } else {
            view.showMessage(principal, "Debe seleccionar una estación", JOptionPane.ERROR_MESSAGE);
        }

    }//recordNumberOfPeople

    public void showAlertsList() {
        view.showMessage("Loading alerts list");

        List<Station> stations = stationList.getStation();
        List<String> alertas = new ArrayList<>();

        for (int i = 0; i < stations.size(); i++) {
            Station estacion = stations.get(i);

            alertas.add("> Estación: " + estacion.getName());

            if (estacion.getFlowOfPeople() > estacion.getMaxCapacity()) {
                alertas.add("     Estación llena");
                alertas.add(" ");
            } else {
                alertas.add("     Sin anomalías");
                alertas.add(" ");
            }

            String[] alerta = alertas.toArray(String[]::new);
            principal.getLstListAlertas().setListData(alerta);
        }
    }//showAlertsList

    public void showStationsList() {
        view.showMessage("Loading stations list");

        List<Station> stations = stationList.getStation();
        String[] names = stations.stream()
                .map(Station::getName)
                .toArray(String[]::new);
        setStationsLists(names);
    }//showStationsList

    public void showRoutesPerStation() {
        view.showMessage("Loading routes per station");

        List<Station> stations = stationList.getStation();
        List<String> rutasList = new ArrayList<>();

        for (Station estacion : stations) {
            String conexa = estacion.showRelatedRoutes();
            rutasList.add("> Estación: " + estacion.getName());
            if (conexa != null && !conexa.isEmpty()) {
                rutasList.add("     Rutas Conexas: ");

                String[] rutasConexas = conexa.split("\\|");
                for (String ruta : rutasConexas) {
                    rutasList.add("          " + ruta.trim());
                }

            } else {
                rutasList.add("    >> No hay rutas en esta estación");
            }
            rutasList.add(" "); // "salto de linea"
        }
        String[] rutas = rutasList.toArray(String[]::new);
        principal.getLstListaDeParadasPorEstacion().setListData(rutas);
    }//showRoutesPerStation

    public void showStationsStatus() {
        view.showMessage("Loading stations status");

        List<Station> stations = stationList.getStation();
        List<String> atributos = new ArrayList<>();

        for (Station estacion : stations) {

            atributos.add("> Estación: " + estacion.getName());
            atributos.add("     Capacidad de la Estacion: " + estacion.getMaxCapacity());
            atributos.add("     Flujo de personas: " + estacion.getFlowOfPeople());
            atributos.add("     Saturacion: " + estacion.getSaturation());
            atributos.add("     Funcionamiento: " + estacion.getOperation());
            atributos.add(" "); // "salto de linea"
        }
        String[] monitoreo = atributos.toArray(String[]::new);
        principal.getLstListaDeEstadoDeLasEstaciones().setListData(monitoreo);
    }//showStationsStatus

    public void loadCombosAddStation() {

        principal.getCmbAddSaturation().removeAllItems();
        for (Saturation saturation : Saturation.values()) {
            principal.getCmbAddSaturation().addItem(saturation.toString());
        }

        principal.getCmbAddOperation().removeAllItems();
        for (Operation operation : Operation.values()) {
            principal.getCmbAddOperation().addItem(operation.toString());
        }

    }//loadCombosAddStation

    public void addStation() {

        String name;
        Integer capacity, flow;
        Saturation saturation;
        Operation operation;

        name = principal.getTxtAddNameStation().getText();

        if (repeatedStation(name)) {
            view.showMessage(principal, "El nombre de la estación ya existe", JOptionPane.ERROR_MESSAGE);
            return; //No continua si está vacío
        }

        capacity = checkInteger(principal.getTxtAddMaxCapacity());
        if (capacity == null) {
            view.showMessage(principal, "Debe ingresar un número de capacidad máxima", JOptionPane.ERROR_MESSAGE);
            return; //No continua si está vacío
        } else if (capacity < 0) {
            view.showMessage(principal, "El número de capacidad no debe ser negativo", JOptionPane.ERROR_MESSAGE);
            return; //No continua si es negativo
        }

        flow = checkInteger(principal.getTxtAddFlowOfPeople());
        if (flow == null) {
            view.showMessage(principal, "Debe ingresar el flujo de personas", JOptionPane.ERROR_MESSAGE);
            return; //No continua si está vacío
        } else if (flow < 0) {
            view.showMessage(principal, "El número de saturación no debe ser negativo", JOptionPane.ERROR_MESSAGE);
            return; //No continua si es negativo
        }

        int satu = principal.getCmbAddSaturation().getSelectedIndex();
        saturation = Saturation.values()[satu];

        int oper = principal.getCmbAddOperation().getSelectedIndex();
        operation = Operation.values()[oper];

        stationList.addStation(new Station(name, capacity, flow, saturation, operation));

        view.showMessage(principal, "Estación añadida exitosamente", JOptionPane.PLAIN_MESSAGE);

    }//addStation

    public boolean repeatedStation(String name) {
        ArrayList<Station> stationArray = stationList.getStation();
        for (Station station : stationArray) {
            if (station.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }//repeatedStation

    public void loadDataModifyStation() {
        String stationName;
        Station station = null;
        try {
            stationName = principal.getLstListaEstaciones3().getSelectedValue();
            station = stationList.findName(stationName);
        } catch (NullPointerException e) {
            view.showMessage(principal, "No seleccionó una estación", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            view.showMessage(principal, "Error desconocido", JOptionPane.ERROR_MESSAGE);
        }

        principal.getCmbModifySaturation().removeAllItems();
        for (Saturation saturation : Saturation.values()) {
            principal.getCmbModifySaturation().addItem(saturation.toString());
        }

        principal.getCmbModifyOperation().removeAllItems();
        for (Operation operation : Operation.values()) {
            principal.getCmbModifyOperation().addItem(operation.toString());
        }

        principal.getTxtModifyNameStation().setText(station.getName());
        principal.getTxtModifyMaxCapacity().setText(String.valueOf(station.getMaxCapacity()));
        principal.getTxtModifyFlowOfPeople().setText(String.valueOf(station.getFlowOfPeople()));
        principal.getCmbModifySaturation().setSelectedIndex(station.getSaturation().ordinal());
        principal.getCmbModifyOperation().setSelectedIndex(station.getOperation().ordinal());

    }//loadDataModifyStation

    public void modifyStation() {
        String stationName;
        Station station = null;

        if (principal.getLstListaEstaciones3().getSelectedIndex() == -1) {
            view.showMessage(principal, "Debe seleccionar una estación", JOptionPane.ERROR_MESSAGE);
            return; //No continua si está vacío
        }

        try {
            stationName = principal.getLstListaEstaciones3().getSelectedValue();
            station = stationList.findName(stationName);
        } catch (Exception e) {
            view.showMessage(principal, "Error desconocido", JOptionPane.ERROR_MESSAGE);
        }

        String name;
        Integer capacity, flow;
        Saturation saturation;
        Operation operation;

        name = principal.getTxtModifyNameStation().getText();

        capacity = checkInteger(principal.getTxtModifyMaxCapacity());
        if (capacity == null) {
            view.showMessage(principal, "Debe ingresar un número de capacidad máxima", JOptionPane.ERROR_MESSAGE);
            return; //No continua si está vacío
        } else if (capacity < 0) {
            view.showMessage(principal, "El número de capacidad no debe ser negativo", JOptionPane.ERROR_MESSAGE);
            return; //No continua si es negativo
        }

        flow = checkInteger(principal.getTxtModifyFlowOfPeople());
        if (flow == null) {
            view.showMessage(principal, "Debe ingresar el flujo de personas", JOptionPane.ERROR_MESSAGE);
            return; //No continua si está vacío
        } else if (flow < 0) {
            view.showMessage(principal, "El número de saturación no debe ser negativo", JOptionPane.ERROR_MESSAGE);
            return; //No continua si es negativo
        }

        int satu = principal.getCmbModifySaturation().getSelectedIndex();
        saturation = Saturation.values()[satu];

        int oper = principal.getCmbModifyOperation().getSelectedIndex();
        operation = Operation.values()[oper];

        station.setName(name);
        station.setMaxCapacity(capacity);
        station.setFlowOfPeople(flow);
        station.setSaturation(saturation);
        station.setOperation(operation);

        showStationsList();
        view.showMessage(principal, "Estación modificada exitosamente", JOptionPane.PLAIN_MESSAGE);
    }//modifyStation

    public void deleteStation() {
        String stationName;
        Station station = null;

        if (principal.getLstListaEstaciones4().getSelectedIndex() == -1) {
            view.showMessage(principal, "Debe seleccionar una estación", JOptionPane.ERROR_MESSAGE);
            return; //No continua si está vacío
        }

        try {
            stationName = principal.getLstListaEstaciones4().getSelectedValue();
            station = stationList.findName(stationName);
        } catch (Exception e) {
            view.showMessage(principal, "Error desconocido", JOptionPane.ERROR_MESSAGE);
        }

        stationList.deleteStation(station);

        showStationsList();
        view.showMessage(principal, "Estación eliminada exitosamente", JOptionPane.PLAIN_MESSAGE);

    }//deleteStation

    public void showRoutesList() {
        view.showMessage("Loading all the stops");

        String routes = routesLinkedList.showList();

        List<String> routesList = new ArrayList<>();

        String[] routesSplit = routes.split("\\|");
        routesList.addAll(Arrays.asList(routesSplit));

        String[] rutas = routesList.toArray(String[]::new);
        principal.getLstListaDeParadas().setListData(rutas);

    }//showRoutesList

    public void loadCombosAddStop() {
        view.showMessage("Loading the stops names");
        String select = "Seleccione";

        principal.getCmbSelectStops().removeAllItems();
        principal.getCmbSelectStops().addItem(select);

        RoutesNode current = routesLinkedList.getHead();
        while (current != null) {
            String name = current.getRoute().getName();
            principal.getCmbSelectStops().addItem(name);
            current = current.getNext();
        }

    }//loadCombosAddStop

    public void assignStop() {

        String stationName;
        String routeName = null;
        Station station = null;
        Route route = null;
        try {
            try {
                stationName = principal.getLstListaEstaciones5().getSelectedValue();
                station = stationList.findName(stationName);

                if (stationName == null) {
                    view.showMessage(principal, "No seleccionó una estación", JOptionPane.ERROR_MESSAGE);
                    return;
                }

            } catch (Exception e) {
                view.showMessage(principal, "Error desconocido en stationName", JOptionPane.ERROR_MESSAGE);
            }

            try {
                routeName = principal.getCmbSelectStops().getSelectedItem().toString();
                route = routesLinkedList.findRoute(routeName);
            } catch (Exception e) {
                view.showMessage(principal, "Error desconocido en routeName", JOptionPane.ERROR_MESSAGE);
            }

            if (routeName.equals("Seleccione")) {
                view.showMessage(principal, "No seleccionó una ruta", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Route repeatedRoute = station.getRelatedList().findRoute(routeName);
            if (repeatedRoute != null) {
                String repeatedRouteName = repeatedRoute.getName();
                if (routeName.equals(repeatedRouteName)) {
                    view.showMessage(principal, "La ruta " + routeName + " ya existe en la estación", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            station.addRelatedList(route);
            view.showMessage(principal, "Ruta " + routeName + " añadida correctamente", JOptionPane.PLAIN_MESSAGE);

        } catch (NullPointerException e) {
            view.showMessage(principal, "Null pointer en saber que dx", JOptionPane.ERROR_MESSAGE);
        }

    }//assignStop

    public boolean askBoolean(int op) {
        boolean funcionamiento = false;
        do {
            if (op == 1) {
                funcionamiento = true;
            } else if (op == 2) {
                funcionamiento = false;
            }
        } while (op != 1 || op != 2);
        return funcionamiento;
    }//askBoolean

    public void stationsList() {
        view.showMessage("---Lista Estaciones---");
        for (Station estacion : stationList.getStation()) {
            view.showMessage("Estacion: " + estacion.getName());
        }
    }//stationsList

    public void fleetManagement() {//TODO: Delete when refactored to GUI
        view.showMessage(" ");
        int op;
        do {
            view.showMessage("--Gestion de Flota--");
            view.fleet();
            op = Controlador.this.checkInteger();
            switch (op) {
                case 1 ->
                    addBus();
                case 2 ->
                    removeBus();
                case 3 ->
                    accessBus();
                case 4 ->
                    modifyBus();
                case 5 ->
                    assignRoute();
                case 6 ->
                    busList();
                case 7 ->
                    view.showMessage("Saliendo de gestionar flota");
                default ->
                    view.showMessage("Opcion Invalida. Por favor, ingresar una de las opciones disponibles");
            }
        } while (op != 7);
    }//fleetManagement

    public void addBus() {
        //Metodo de pedir datos(Se esta validando si agregar datos precargados)   
        String ruta, placa, entrada;
        int ID, capacidad, asientos;
        view.showMessage("---Agregando Bus---");
        view.showMessage("Ingrese el ID del bus:");
        ID = Controlador.this.checkInteger();
        view.showMessage("Ingrese la placa del bus:");
        placa = view.askNext();
        view.showMessage("Ingrese el año de entrada del bus;");
        entrada = view.askNext();
        view.showMessage("Ingrese la capacidad del bus:");
        capacidad = Controlador.this.checkInteger();
        view.showMessage("Ingrese el numero de asientos del bus:");
        asientos = Controlador.this.checkInteger();
        Bus agregar = new Bus(ID, capacidad, null, placa, entrada, asientos);
        busHashMap.addBus(agregar);
    }//addBus

    public void removeBus() {
        if (busHashMap.getBuses() != null) {
            view.showMessage("Ingrese el ID del Bus a retirar:");
            int id = Controlador.this.checkInteger();
            Bus bus = busHashMap.getBus(id);
            if (bus == null) {
                view.showMessage("El bus con ID " + id + " no esta en la lista");
            } else {
                busHashMap.deleteBus(id);
            }
        } else {
            view.showMessage("Lista de buses vacia");
        }
    }//removeBus

    public void accessBus() {
        if (busHashMap.getBuses() == null || busHashMap.getBuses().isEmpty()) {
            view.showMessage("Lista de buses vacia");
            return;
        }

        view.showMessage("Ingrese el ID para acceder");
        int id = Controlador.this.checkInteger();
        Bus bus = busHashMap.getBus(id);
        if (bus == null) {
            view.showMessage("El bus con ID " + id + " no esta en la lista");
        } else {
            view.showMessage("Informacion del bus: \n" + bus.toString());
        }
    }//accessBus

    public void modifyBus() {
        if (busHashMap.getBuses() != null) {
            view.showMessage("Ingrese el ID del bus que se va a modificar ");
            int id = Controlador.this.checkInteger();
            Bus bus = busHashMap.getBus(id);
            if (bus != null) {
                view.showMessage("Ingrese la placa: ");
                bus.setPlate(view.askNext());
                view.showMessage("Ingrese la capacidad del bus: ");
                bus.setCapacity(Controlador.this.checkInteger());
                view.showMessage("Ingrese la ruta del bus: ");
                bus.setRouteAssigned(view.askNext());
                view.showMessage("Ingrese el año del bus: ");
                bus.setYearIn(view.askNext());
                view.showMessage("Ingrese el numero de asientos del bus");
                bus.setSeatsNumber(Controlador.this.checkInteger());
            } else {
                view.showMessage("El bus con ID " + id + " no esta en la lista");
            }
        } else {
            view.showMessage("No hay buses en la lista");
        }
    }//modifyBus

    public void assignRoute() {
        view.showMessage("---Asignado Ruta---");
        view.showMessage("Ingrese el ID del Bus");
        int id = Controlador.this.checkInteger();
        Bus bus = busHashMap.getBus(id);
        if (bus != null) {
            showRoutesList();
            view.showMessage("Ingrese El name de la ruta que se va asignar");
            String name = view.askNext();

            String p = routesLinkedList.findNode(name).getRoute().getName();
            if (p != null) {
                bus.setRouteAssigned(p);
                view.showMessage("Ruta asignada");
            }
        } else {
            view.showMessage("Bus no encontrado");
        }
    }//assignRoute

    public void busList() {
        if (busHashMap.getBuses() == null) {
            view.showMessage("No hay lista de Buses");
        } else {
            view.showMessage("Listado de buses ");
            for (Bus bus : busHashMap.getBuses().values()) {
                view.showMessage(" Bus: " + bus.toString());
            }
        }
    }//busList

    public void routesManagement() {//TODO: Delete when refactored to GUI
        view.showMessage(" ");

        int op;
        do {
            view.showMessage("---Gestion de Rutas---");
            view.showMessage(" ");
            view.routesManagement();
            op = Controlador.this.checkInteger();
            switch (op) {
                case 1 ->
                    addRoute();
                case 2 ->
                    deleteRoute();
                case 3 ->
                    assignRoute();
                case 4 ->
                    modifyRoute();
                case 5 ->
                    showRoutesList();
                case 6 ->
                    view.showMessage("Saliendo de gestion de rutas");
                default ->
                    view.showMessage("Opcion invalidad. Por favor, ingresar una de las opciones disponibles");
            }
        } while (op != 6);
    }//routesManagement

    public void addRoute() {
        view.showMessage("Ruta Nueva:");
        String name, origen, destino;
        int tiempo;
        view.showMessage("Ingrese el name de ruta");
        name = view.askNext();
        view.showMessage("Ingrese la Partida de inicio de la Ruta");
        origen = view.askNext();
        view.showMessage("Ingrese el destino de la ruta");
        destino = view.askNext();
        view.showMessage("Ingrese el tiempo estimado de la ruta");
        tiempo = Controlador.this.checkInteger();
        Route objRuta = new Route(name, origen, destino, tiempo);
        routesLinkedList.insertRoute(objRuta);
    }//addRoute

    public void deleteRoute() {
        view.showMessage("---Eliminando Ruta---");
        view.showMessage("Ingrese el name ruta a Eliminar");
        String name = view.askNext();
        routesLinkedList.deleteRoute(name);
    }//deleteRoute

    public void modifyRoute() {
        view.showMessage("--Modificando Ruta--");
        String name, origen, destino;
        int tiempo;
        Route route = new Route();
        view.showMessage("name de la ruta a modificar");
        name = view.askNext();

        if (routesLinkedList.findNode(name) != null) {
            route.setName(name);
            view.showMessage("Ingrese el nuevo origen de la ruta: ");
            route.setOrigin(view.askNext());
            view.showMessage("Ingrese el nuevo destino de la ruta: ");
            route.setDestiny(view.askNext());
            view.showMessage("Ingrese el tiempo estimado de la ruta: ");
            route.setEstimatedTime(Controlador.this.checkInteger());
            //  Ruta rutaModificada = new Ruta(name, origen, destino, tiempo);
            boolean modificacion = routesLinkedList.modifyRoute(name, route);
            if (modificacion) {
                view.showMessage("Ruta Modificada");
            } else {
                view.showMessage("La ruta no fue modificada");
            }
        } else {
            view.showMessage("La ruta no esta en la lista ");
        }
    }//modifyRoute

    public void validateAccess() {//TODO: Delete when refactored to GUI
        view.showMessage(" ");
        int op;
        do {
            view.showMessage("---VALIDACION---");
            view.showMessage(" ");
            view.access();
            op = Controlador.this.checkInteger();
            switch (op) {
                case 1 ->
                    signIn();
                case 2 ->
                    validate();
                case 3 ->
                    view.showMessage("Saliendo de validar acceso");
                default ->
                    view.showMessage("Opcion invalida. Ingrese una de las opciones disponibles");
            }
        } while (op != 3);
    }//validateAccess

    public void signIn() {
        view.showMessage("--Ingresando Usuariuo--");
        view.showMessage("Ingrese el ID del usuario");
        int id = Controlador.this.checkInteger();
        view.showMessage("Ingrese acceso: 1.Autorizado o 2.Denegado");
        int op = Controlador.this.checkInteger();
        boolean autorizacion = askAuthorization(op);
        view.showMessage("Ingrese el tipo de Usuario");
        String tipo = view.askNext();
        User agregar = new User(id, autorizacion, tipo);
        userHashtable.addUser(agregar);
    }//signIn

    public boolean askAuthorization(int op) {
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
    }//askAuthorization

    public void validate() {
        view.showMessage("--Validando acceso--");
        view.showMessage("Ingrese ID del usuario");
        int id = Controlador.this.checkInteger();
        if (userHashtable.getUsers().isEmpty()) {
            view.showMessage("Lista vacia");
        } else {
            if (userHashtable.getUser(id) == null) {
                view.showMessage("Usiario con ID " + id + " no esta en el sistema");
            } else {
                view.showMessage("Usuario: " + userHashtable.getUser(id).toString());
            }
        }
    }//validate

    public void calculateRoutes() {//TODO: Delete when refactored to GUI
        view.showMessage("Ingrese la estación de inicio:");
        String inicio = view.askNext();
        view.showMessage("Ingrese la estación de destino: ");
        String fin = view.askNext();
        view.showMessage("");
        view.showMessage(RouteGraphMap.showShorterRoute(inicio, fin));
        view.showMessage(" ");
    }//calcularRutas

    public void guardarDatos() {
        //TODO: Futura implementación para DB
    }//guardarDatos

    public void salir() {
        //if(save) guardarDatos();
        //view.showMessage("Data saved");
        System.exit(0);
    }//salir

    public void preloadData() {

        //Datos precargados de estacion
        Station a1 = new Station("Ricaurte", 1000, 500, Saturation.MODERADA, Operation.EN_FUNCIONAMIENTO);
        stationList.addStation(a1);
        Station a2 = new Station("Terminal", 600, 700, Saturation.BAJA, Operation.EN_FUNCIONAMIENTO);
        stationList.addStation(a2);
        Station a3 = new Station("Tunal", 200, 400, Saturation.MODERADA, Operation.EN_FUNCIONAMIENTO);
        stationList.addStation(a3);
        Station a4 = new Station("El Dorado", 300, 600, Saturation.NORMAL, Operation.EN_FUNCIONAMIENTO);
        stationList.addStation(a4);
        Station a5 = new Station("Norte", 150, 200, Saturation.NORMAL, Operation.EN_FUNCIONAMIENTO);
        stationList.addStation(a5);
        Station a6 = new Station("Jiménez", 400, 200, Saturation.ALTA, Operation.EN_FUNCIONAMIENTO);
        stationList.addStation(a6);

        //Datos de rutas precargados
        Route r1 = new Route("P20", "Ricaute", "Sur", 80);
        routesLinkedList.insertRoute(r1);
        a1.addRelatedList(r1);
        Route r2 = new Route("M20", "Sur", "Ricaute", 80);
        routesLinkedList.insertRoute(r2);
        a2.addRelatedList(r2);
        Route r3 = new Route("T30", "Terminal", "Centro", 75);
        routesLinkedList.insertRoute(r3);
        a3.addRelatedList(r3);
        Route r4 = new Route("T40", "Centro", "Terminal", 75);
        routesLinkedList.insertRoute(r4);
        a4.addRelatedList(r4);
        Route r5 = new Route("P10", "Ricaute", "Centro", 90);
        routesLinkedList.insertRoute(r5);
        a1.addRelatedList(r5);
        Route r6 = new Route("P50", "Sur", "Terminal", 70);
        routesLinkedList.insertRoute(r6);
        a1.addRelatedList(r6);

        //Datos de Buse precargados
        Bus b1 = new Bus(23, 200, null, "12Pl", "2014", 100);
        busHashMap.addBus(b1);
        b1.setRouteAssigned(r2.getName());
        Bus b2 = new Bus(12, 250, null, "25Tk", "2017", 110);
        b2.setRouteAssigned(r4.getName());
        busHashMap.addBus(b2);

        //Datos de usuaios precargados
        User u1 = new User(34, true, "Pasajero");
        userHashtable.addUser(u1);
        User u2 = new User(45, false, "Pasajero");
        userHashtable.addUser(u2);
        //Datos precargados del grafo
        RouteGraphMap.addEdge("Eldorado", "Ricaurte");
        RouteGraphMap.addEdge("Ricaurte", "Jiménez");
        RouteGraphMap.addEdge("Jiménez", "Tunal");
        RouteGraphMap.addEdge("Jiménez", "Norte");
        RouteGraphMap.addEdge("Norte", "Terminal");
    }//preloadData

    public int checkInteger() {
        //Método sobrecargado para que no explote todo el codigo xd
        //Cuando se implemente toda la vista borrar.
        int numero = -1;

        try {
            numero = view.askInteger();
            view.showMessage("Usando metodo entero() sobrecargado para la consola");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return numero;
    }//entero

    public Integer checkInteger(JTextField txt) {

        String texto = txt.getText().trim();

        if (texto.isEmpty()) {
            return null;
        }

        try {
            return Integer.valueOf(texto);
        } catch (NumberFormatException e) {
            view.showMessage("Datos de entrada invalidos. Ingresar entradas validas");
            return null;
        }
    }//entero

}//class
