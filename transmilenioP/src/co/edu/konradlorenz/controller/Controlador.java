
package co.edu.konradlorenz.controller;
import co.edu.konradlorenz.view.Vantana;

public class Controlador {
    public void run(){
        Vantana objVantana = new Vantana();
        int op = objVantana.pedirEntero();
        do{
        switch (op) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
            break;
            case 4:
                
                break;
            case 5:
                
                break;
             
            default:
                throw new AssertionError();
        }
        }while (op!=6);           
            
        
    }
}
