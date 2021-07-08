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
public class PrenderServer implements Command{
    private IServer servidor;
    
    public PrenderServer(IServer servidor){
        this.servidor = servidor;
    }
    
     @Override
    public void execute() {
       servidor.prendete();
       servidor.verificaConexion();
       servidor.conectate();
       servidor.guardaLog();
    }
    
}
