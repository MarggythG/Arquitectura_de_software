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
public class WebPageDecorator implements WebPage{
    
    protected WebPage page;
    
    public WebPageDecorator(WebPage page){
        this.page = page;
    }
    
    public void display(){
        this.page.display();
    }
}
