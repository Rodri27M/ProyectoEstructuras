/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.konradlorenz;

import co.edu.konradlorenz.model.Estacion;
import co.edu.konradlorenz.model.Ruta;

/**
 *
 * @author rodri
 */
public class controller {
    
    public void run(){
        
    }
    
    
//Datos de rutas precargados
public void addRutas(){
    Ruta rutaA = new Ruta("Ruta A", "Portal Norte", "Calle 80", 25);
    Ruta rutaB = new Ruta("Ruta B", "Calle 100", "Portal Sur", 30);
    Ruta rutaC = new Ruta("Ruta C", "Calle 45", "Portal Suba", 20);
    Ruta rutaD = new Ruta("Ruta D", "Calle 26", "Ricaurte", 45);
    Ruta rutaE = new Ruta("Ruta E", "Av.Rojas", "Universidades", 25);
    Ruta rutaF = new Ruta("Ruta F", "Terminal", "Prado", 20);
    
    Estacion estacion1 = new Estacion("Estacion 1 ", 300, 250, "moderado", true);
    estacion1.addListaConexas(rutaA);
    estacion1.addListaConexas(rutaB);
    
    Estacion estacion2 = new Estacion("Av.Rojas", 500, 8000, "Normal", true);
    estacion2.addListaConexas(rutaF);
    estacion2.addListaConexas(rutaD);
}




}
