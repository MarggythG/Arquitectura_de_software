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
public class SC_Quejas extends PQR{
    
    public SC_Quejas(String mensaje) {
        super("Esto es una queja");
    }
    public void estado(){
        System.out.println("En proceso");
    }
}
