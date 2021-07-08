/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterDesignPatternCarro;

/**
 *
 * @author mjoha
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("-----BATIMOVIL---------------------------");
        BatiMovilAdaptador batiMovilAdaptador = new BatiMovilAdaptador();
        batiMovilAdaptador.acelerar();
        batiMovilAdaptador.frenar();
        System.out.println("-----CARROZA---------------------------");
        CarrozaAdaptador carrozaAdaptador = new CarrozaAdaptador();
        carrozaAdaptador.acelerar();
        carrozaAdaptador.frenar();
        System.out.println("-----TRICICLO---------------------------");
        TricicloAdaptador tricicloAdaptador = new TricicloAdaptador();
        tricicloAdaptador.acelerar();
        tricicloAdaptador.frenar();
        System.out.println("-----TRONCOMOVIL---------------------------");
        TroncoMovilAdaptador troncoMovilAdaptador = new TroncoMovilAdaptador();
        troncoMovilAdaptador.acelerar();
        troncoMovilAdaptador.frenar();
        
        
    }
    
}
