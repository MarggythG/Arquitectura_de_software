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
public class CarrozaAdaptador implements Carro {
    
    private Carroza carroza;
    
    public CarrozaAdaptador(){
    super();
    this.carroza = new Carroza();
        System.out.println("CarrozaAdapter");
    }
    
    @Override
    public void frenar(){
        this.carroza.halarRiendas();
        System.out.println("Frenar Carroza");
    }
    
    @Override
    public void acelerar(){
        this.carroza.arrearCaballo();
        this.carroza.moverRiendas();
        System.out.println("Acelerar Carroza");
    }
    
}
