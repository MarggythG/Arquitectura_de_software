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
public class BatiMovilAdaptador implements Carro {
    
    private BatiMovil batiMovil;
    
    public BatiMovilAdaptador(){
    super();
    this.batiMovil = new BatiMovil();
        System.out.println("BatiMovilAdapter");
    }
    
    @Override
    public void frenar(){
        this.batiMovil.batiFrenado();
        System.out.println("Frenar BatiMovil");
    }
    
    @Override
    public void acelerar(){
        this.batiMovil.batiAcelerado();
        System.out.println("Acelerar BatiMovil");
    }
    
}
    