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
public class Program {
    
    public static void main(String[] args) {
        WebPage myPage = new BasicWebPage();
        myPage = new AuthenticatedWebPage(myPage);
        myPage = new AuthorizedWebPage(myPage);
        myPage.display();
    }
    
}
