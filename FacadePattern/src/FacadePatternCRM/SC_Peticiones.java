/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePatternCRM;

/**
 *
 * @author mjoha
 */
public class SC_Peticiones extends PQR{
    
    
    public SC_Peticiones(String mensaje) {
        super("Esto es una petición");
    }
    
    public void estado(){
        System.out.println("En proceso");
    }
   
    
}


