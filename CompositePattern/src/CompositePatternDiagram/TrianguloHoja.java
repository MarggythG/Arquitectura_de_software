/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositePatternDiagram;

/**
 *
 * @author mjoha
 */
public abstract class TrianguloHoja implements IDiagrama{
    
    public String name;
    
    public TrianguloHoja(String name){
        this.name = name;
    }
    
    @Override
    public void pintar(){
        System.out.println("Pintando un Triángulo" + this.name);
    }

    @Override
    public String getName(){
        return this.name;
    }
    
}
