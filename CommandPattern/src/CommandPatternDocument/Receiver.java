/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPatternDocument;

import java.util.ArrayList;

/**
 *
 * @author mjoha
 */
public class Receiver {
    
    private ArrayList<String> editor = new ArrayList<>();
    private ArrayList<String> copy = new ArrayList<>();
    
    public Receiver(){}
    
    public void setText(String text){
        System.out.println("Cadena inicial: " + text);
        this.editor.add(text);
        this.copy.add(text);
    }
    
   
    public void concat(int index, String newText){
        copy.add(editor.get(index));
        editor.set(index, editor.get(index).concat(newText));
        System.out.println("Concatenar cadena: " + " " + editor.get(index));
    }
    
    
    public void undoCocat(int index){
        System.out.println("Deshacer concatenacion: " + copy.get(index));
        editor.set(index, copy.get(index));
    }
    
    public void delete(int index){
        copy.add(editor.get(index));
        System.out.println("Eliminar: " + editor.get(index));
        editor.remove(index);
    }
    
    public void undoDelete(int index){
        System.out.println("Deshacer eliminar: " + copy.get(index));
        editor.add(copy.get(index));
    }
    
    public void record(){
        for(String x : copy){
            System.out.println(x);
        }
        System.out.println("Texto original");
        for(String x : editor){
            System.out.println(x);
        }
    }
    
}
