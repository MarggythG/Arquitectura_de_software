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
public class Main {
    
    public static void main(String[] args) {
        
        PastaDish spaghetti = new SpaghettiMeatballs();
        spaghetti.makeRecipe();
        
        System.out.println("-------------------------");
        
       PastaDish spaghetti1 = new PenneAlfredo();
        spaghetti1.makeRecipe(); 
        
        System.out.println("-------------------------");
        
       PastaDish spaghetti2 = new Raviolis();
        spaghetti2.makeRecipe(); 
    }
    
}
