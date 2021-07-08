/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPatternWebPage;

/**
 *
 * @author mjoha
 */
public class BasicWebPage implements WebPage{
    
    private String html = "paginaweb";
    private String styleSheet = "estilos";
    private String scripts = "scripts";
    
    @Override
    public void display(){
        System.out.println("This is the basic Web Page");
    }
    
}

