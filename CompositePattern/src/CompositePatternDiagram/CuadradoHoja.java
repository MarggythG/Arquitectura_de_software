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
public  abstract class CuadradoHoja implements IDiagrama {
    
    public String name;
    
    public CuadradoHoja(String name){
        this.name = name;
    }
    
    @Override
    public void pintar(){
        System.out.println("Pintando un Cuadrado" + this.name);
    }
    
    @Override
    public String getName(){
        return this.name;
    }
    
}
