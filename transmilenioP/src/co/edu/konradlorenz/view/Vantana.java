
package co.edu.konradlorenz.view;

import java.util.Scanner;


public class Vantana {
    Scanner sc = new Scanner(System.in);
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    
    public int pedirEntero(){
        System.out.println("1. Monitoreo"
                + "2. Gestion de Flota"
                + "3. Recorrido de Buses"
                + "4. Calcular rutas"
                + "5. Ver Alertas"
                + "6. salir ");
        return sc.nextInt(); 
    }
}
