
package co.edu.konradlorenz.view;

import java.util.Scanner;


public class Vantana {
    Scanner sc = new Scanner(System.in);
    
    
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    public void menu(){
        System.out.println("1. Monitoreo"
                + "2. Gestion de Flota"
                + "3. Recorrido de Buses"
                + "4. Calcular rutas"
                + "5. Ver Alertas"
                + "6. salir ");
    }
    public int pedirEntero(){
      
        return sc.nextInt(); 
    }
    
    public void monitoreo(){
        System.out.println("1. Registar cantidad de personas"
                + "2. Ver alertas "
                + "3. Salir");
    }
    
    public void flota(){
        System.out.println("1. Agregar Bus"
                + "2. Retirar bus"
                + "3. Salir");
    }
    
    
}
