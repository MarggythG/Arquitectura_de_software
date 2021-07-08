/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethodPattern;

/**
 *
 * @author mjoha
 */
public class Cliente {
    
    public static KnifeStore getFactory(String choice){
        
        if(choice.equalsIgnoreCase("BUDGET")){
            return new BudgetKnifeStore();
            
        } else if (choice.equalsIgnoreCase("SPECIAL")){
            return new SpecialKnifeStore();
            
        }
        return null;
    }
    
}
