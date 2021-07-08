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
public interface ICommand {
    
    public void modificar(String text, int index);
    public void eliminar(int index);
    public void agregar(String text);
}
