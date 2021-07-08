/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPatternDocument;

/**
 *
 * @author mjoha
 */
public class RedoCommand implements ICommand{
    
    private Receiver editor = new Receiver();

    @Override
    public void modificar(String text, int index) {
        editor.concat(index, text);
    }

    @Override
    public void eliminar(int index) {
        editor.delete(index);
    }

    @Override
    public void agregar(String text) {
        editor.setText(text);
    }


    
}
