package co.edu.konradlorenz.view;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View {

    private Scanner sc = new Scanner(System.in);

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showMessage(JFrame parent, String message, int type) {
        JOptionPane.showMessageDialog(parent, message, "Transmilenio S.A.", type);
    }

    public void menu() {
        showMessage("2. Gestion Estacion"
                + "\n3. Gestion de Flota"
                + "\n4. Calcular rutas"//Grafos(En evaulacion)
                + "\n5. Gestion de rutas"
                + "\n6. Validar acceso"
                + "\n7. salir ");
    }

    public void fleet() {
        showMessage("1. Agregar Bus"
                + "\n2. Retirar bus"
                + "\n3. Accerder bus"
                + "\n4. Modificar bus"
                + "\n5. Asignar Ruta"
                + "\n6. Lista de Buses"
                + "\n7. salir");
    }

    public int askInteger() {
        try {
            return sc.nextInt();
        } catch (Exception e) {
            sc.nextLine(); // Limpiar el búfer
            showMessage("Entrada inválida. No es un número entero.");
        }
        return 0;
    }

    public void routesManagement() {
        showMessage("1. Agregar Ruta"
                + "\n2. Eliminar Ruta"
                + "\n3. Asignar Ruta"
                + "\n4. Modificar Ruta"
                + "\n5. Ver listado de Rutas"
                + "\n6. salir");
    }

    public void access() {
        showMessage("1. Ingresar usuario"
                + "\n2. Validar acceso"
                + "\n3. Salir");
    }

    public String askNext() {
        return sc.next();
    }

    public String askNextLine() {
        return sc.nextLine();
    }
    
}