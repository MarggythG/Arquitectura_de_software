/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandexample;

/**
 *
 * @author JdRod
 */
public class ResetServer implements Command{
    private IServer servidor;

    ResetServer(IServer servidor) {
       this.servidor = servidor;
    }
    
     @Override
    public void execute() {
       servidor.conectate();
       servidor.verificaConexion();
       servidor.guardaLog();
       servidor.apagate();
       servidor.prendete();
       servidor.guardaLog();
       servidor.cerraConexion();
    }
}
