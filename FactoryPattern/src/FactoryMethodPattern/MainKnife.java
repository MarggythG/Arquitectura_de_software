/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethodPattern;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author mjoha
 */
public class MainKnife {
    
    public static void main(String[] args) {
        
       KnifeStore budgetKnifeStore = Cliente.getFactory("BUDGET");
       System.out.println(budgetKnifeStore.toString());
       Knife typeBudget = budgetKnifeStore.createKnife("Steak");
       
       typeBudget.packages();
       typeBudget.polish();
       typeBudget.shapern();
       
       
       KnifeStore specialKnifeStore = Cliente.getFactory("SPECIAL");
       System.out.println(budgetKnifeStore.toString());
       Knife typeSpecial = specialKnifeStore.createKnife("Bread");
       
       typeSpecial.packages();
       typeSpecial.polish();
       typeSpecial.shapern();
       
  
        
    }
    
}
