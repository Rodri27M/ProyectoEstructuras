
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
                + "\n3. Calcular rutas"//Grafos(En evaulacion)
                + "\n4. Gestion de rutas"
                + "\n5. Validar acceso"
                + "\n6. salir ");
    }
   
    
      public void monitoreo(){
        System.out.println("1. Registar cantidad de personas"
                + "\n2. Ver alertas"
                + "\n3. Ver paradas por Estacion"
                + "\n4. Estado de las Estaciones "
                + "\n5. Salir");
    }
    
    public void flota(){
        System.out.println("1. Agregar Bus"
                + "\n2. Retirar bus"
                + "\n3. Accerder bus"
                + "\n4. Modificar bus"
                + "\n5. Asignar Ruta"
                + "\n6. Lista de Buses"
                + "\n7. salir");
    }
    
   public int pedirEntero(){
        try {
            return sc.nextInt();
        } catch (Exception e) {
            sc.nextLine(); // Limpiar el búfer
            System.out.println("Entrada inválida. No es un número entero.");
        }
        return 0;
    }    
    public void gestionRutas(){
        System.out.println("1. Agregar Ruta"
                + "\n2. Eliminar Ruta"
                + "\n3. Asignar Ruta"
                + "\n4. Modificar Ruta"
                + "\n5. Ver listado de Rutas"
                + "\n6. salir");
    }
    
    public void acceso(){
        System.out.println("1. Ingresar usuario"
                + "\n2. Validar acceso"
                + "\n3. Salir");
    }

  public String pedirString(){
      return  sc.next();
  }
    
}
