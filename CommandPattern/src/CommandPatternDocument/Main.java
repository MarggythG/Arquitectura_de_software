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
public class Main {
    
    public static void main(String[] args) {
        
        ICommand redo = new RedoCommand();
        ICommand undo = new UndoCommand();
        
        ArrayList<ICommand> list = new ArrayList<>();
        list.add(redo);
        list.add(undo);
        Invoker invoker;
        
        for(ICommand x : list){
            invoker = new Invoker(x);
            invoker.run();
        }
        
    }
    
}
