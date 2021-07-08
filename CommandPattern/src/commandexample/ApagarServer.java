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
public class ApagarServer implements Command{
    private IServer servidor;
    
    public ApagarServer(IServer servidor){
        this.servidor = servidor;
    }

    @Override
    public void execute() {
       servidor.conectate();
       servidor.verificaConexion();
       servidor.guardaLog();
       servidor.cerraConexion();
       servidor.apagate();
    }
    
}
