/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandexample;

import java.util.ArrayList;

/**
 *
 * @author JdRod
 */
public class CommandExample {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Command> listaComandos = new ArrayList<Command>();
       Command comando = new PrenderServer(new USAServer());
       listaComandos.add(comando);
       comando = new ApagarServer(new ArgentinaServer());
       listaComandos.add(comando);
       comando = new ResetServer(new BrasilServer());
       listaComandos.add(comando);
       Invoker serverAdmin = new Invoker(comando);
       serverAdmin.run();
       System.out.println("\nNumero comandos almacenados: "+listaComandos.size());
       System.out.println("\nEjecutar comandos almacenados------------------------------");
       Invoker serverAuditor;
       for(Command comandoAlmacenado: listaComandos){
          serverAuditor = new Invoker(comandoAlmacenado);
          serverAuditor.run();
           System.out.println("\n");
       }
    }
    
}
