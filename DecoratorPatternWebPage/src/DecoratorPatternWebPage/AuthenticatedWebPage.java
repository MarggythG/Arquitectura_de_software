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
public class AuthenticatedWebPage extends WebPageDecorator {
    
    public AuthenticatedWebPage(WebPage decoratedPage){
        super(decoratedPage);
    }
    
    public void authenticatedUser(){
        System.out.println("Authenticating User");
    }
    
    public void display(){
        super.display();
        this.authenticatedUser();
    }
    
}
