/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplatePatternPasta;

/**
 *
 * @author mjoha
 */
public class SpaghettiMeatballs extends PastaDish{
    
    protected void addPasta(){
        System.out.println("Add spaghetti");
    }
    
    protected void addProtein(){
        System.out.println("Add meatballs");
    }
    
    protected void addSauce(){
        System.out.println("Add tomato sauce");
    }
    
    protected void addGarnish(){
        System.out.println("Add Parmesan cheese");
    }
    
}
