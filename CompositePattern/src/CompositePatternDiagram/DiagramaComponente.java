/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositePatternDiagram;

import java.util.ArrayList;

/**
 *
 * @author mjoha
 */
public class DiagramaComponente implements IDiagrama {
    
    private ArrayList<IDiagrama> idiagrama;
    
    private String dibujo;
    
   
    public DiagramaComponente(String dibujo){
        this.idiagrama = new ArrayList<IDiagrama>();
        this.dibujo = dibujo;
    }
    
    public int addDiagrama(IDiagrama component){
        this.idiagrama.add(component);
        return this.idiagrama.size()-1;
    }
    
    public IDiagrama getDiagrama(Integer componentNumber){
        return this.idiagrama.get(componentNumber);
    }
    
    public String getName(){
        return this.dibujo;
    }
    
    @Override
    public void pintar(){
        System.out.println("Pintando..." + this.getName());
        for(IDiagrama diagrama : this.idiagrama){
            System.out.println(diagrama.getName());
        }
    }
    
}
