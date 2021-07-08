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
public class BrasilServer implements IServer {
     @Override
    public void apagate() {
        System.out.println("Apagando el servidor de Brasil");
    }

    @Override
    public void prendete() {
        System.out.println("Prendiendo el servidor Brasil");
    }

    @Override
    public void conectate() {
        System.out.println("Conectando al servidor de Brasil");
    }

    @Override
    public void verificaConexion() {
        System.out.println("Verificando conexion con el servidor Brasil");
    }

    @Override
    public void guardaLog() {
        System.out.println("Guarda Log de Brasil");
    }

    @Override
    public void cerraConexion() {
          System.out.println("Cerrando conexion con el servidor Brasil");
    }
}
