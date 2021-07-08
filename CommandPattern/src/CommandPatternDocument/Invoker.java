/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPatternDocument;

/**
 *
 * @author mjoha
 */
public class Invoker {
    
    ICommand command;
  
    public Invoker(ICommand command){
        this.command = command;
    }
    
    public void run(){
        command.agregar("Arquitectura");
        command.modificar(" de Software", 0);
        command.eliminar(0);
        
    }
    
}
