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
public class ArgentinaServer implements IServer{

    @Override
    public void apagate() {
        System.out.println("Apagando el servidor de Argentina");
    }

    @Override
    public void prendete() {
        System.out.println("Prendiendo el servidor Argentina");
    }

    @Override
    public void conectate() {
        System.out.println("Conectando al servidor de Argentina");
    }

    @Override
    public void verificaConexion() {
        System.out.println("Verificando conexion con el servidor Argentina");
    }

    @Override
    public void guardaLog() {
        System.out.println("Guarda Log de Argentina");
    }

    @Override
    public void cerraConexion() {
          System.out.println("Cerrando conexion con el servidor Argentina");
    }


    
}
