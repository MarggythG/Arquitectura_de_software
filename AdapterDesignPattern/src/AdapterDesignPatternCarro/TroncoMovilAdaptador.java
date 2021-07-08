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
public class TroncoMovilAdaptador implements Carro {
    
    private TroncoMovil troncoMovil;
    
    public TroncoMovilAdaptador(){
    super();
        this.troncoMovil = new TroncoMovil();
        System.out.println("TroncoMovilAdapter");
    }
    
    public void frenar(){
        this.troncoMovil.bajarPies();
        this.troncoMovil.rozarPies();
        System.out.println("Frenar TroncoMovil");
    }
    
    public void acelerar(){
        this.troncoMovil.correr();
        System.out.println("Acelerar TroncoMovil");
    }
    
}
