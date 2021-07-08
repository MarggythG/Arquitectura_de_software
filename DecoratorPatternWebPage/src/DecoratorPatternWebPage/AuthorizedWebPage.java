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
public class AuthorizedWebPage extends WebPageDecorator {
    
    public AuthorizedWebPage(WebPage decoratedPage){
        super(decoratedPage);
    }
    
    public void authorizedUser(){
        System.out.println("Authorizing user");
    }
    
    public void display(){
        super.display();
        this.authorizedUser();
    }
    
}

