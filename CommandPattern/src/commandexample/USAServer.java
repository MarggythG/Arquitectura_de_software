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
public class USAServer implements IServer{
     @Override
    public void apagate() {
        System.out.println("Apagando el servidor Trump");
    }

    @Override
    public void prendete() {
        System.out.println("Prendiendo el servidor Trump");
    }

    @Override
    public void conectate() {
        System.out.println("Conectando al servidor de Trump");
    }

    @Override
    public void verificaConexion() {
        System.out.println("Verificando conexion con el servidor Trump");
    }

    @Override
    public void guardaLog() {
        System.out.println("Guarda Log de Trump");
    }

    @Override
    public void cerraConexion() {
          System.out.println("Cerrando conexion con el servidor Trump");
    }
}
