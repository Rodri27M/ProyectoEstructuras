
package co.edu.konradlorenz.view;

import java.util.Scanner;


public class Vantana {
    Scanner sc = new Scanner(System.in);
    
    
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    public void menu(){
        System.out.println("1. Monitoreo"
                + "\n2. Gestion de Flota"
                + "\n3. Recorrido de Buses"
                + "\n4. Calcular rutas"//Grafos(En evaulacion)
                + "\n5. Gestion de rutas"
                + "\n6. Ver Alertas"
                + "\n7. Validar acceso"
                + "\n8. salir ");
    }
    public int pedirEntero(){ 
        return sc.nextInt(); 
    }
    
      public void monitoreo(){
        System.out.println("1. Registar cantidad de personas"
                + "\n2. Ver alertas "
                + "\n3. Salir");
    }
    
    public void flota(){
        System.out.println("1. Agregar Bus"
                + "\n2. Retirar bus"
                + "\n3. Accerder bus"
                + "\n4. Modificar bus"
                + "\n5. Ver lista de buses"
                + "\n6. Salir");
    }
    
    public String pedirString(){
        return sc.next();
    }
    
    public void gentionRutas(){
        System.out.println("1. Agregar Ruta"
                + "\n2. Eliminar Ruta"
                + "\n3. Modificar Ruta"
                + "\n4. Ver listado de Rutas"
                + "\n5. salir");
    }
    
    public void acceso(){
        System.out.println("1. Ingresar usuario"
                + "\n2. Validar acceso"
                + "\n3. Salir");
    }
    
}
