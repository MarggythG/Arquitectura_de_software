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
public class TricicloAdaptador implements Carro {
    
    private Triciclo triciclo;
    
    public TricicloAdaptador(){
    super();
    this.triciclo = new Triciclo();
        System.out.println("TricicloAdaptador");
    }
    
    @Override
    public void frenar(){
        this.triciclo.bajarPies();
        this.triciclo.rozarPies();
        System.out.println("Frenar Triciclo");
    }
    
    @Override
    public void acelerar(){
        this.triciclo.pedalear();
        System.out.println("Acelerar Triciclo");
    }
    
}
