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
public class BudgetKnifeStore extends KnifeStore {
    
    
    public Knife createKnife(String knifeType){
        if (knifeType.equals("Steak")){
            return new BudgetSteakKnife();
        } else if (knifeType.equals("Chefs")){
            return new BudgetChefsKnife();
        }
        else return null;
    }    

    private static class BudgetSteakKnife extends Knife {

        public BudgetSteakKnife() {
            this.nameKnife = "Steak Knife";
            System.out.println("--Budget Steak Knife");
        }
    }

    private static class BudgetChefsKnife extends Knife {

        public BudgetChefsKnife() {
            this.nameKnife = "ChefsKnife";
            System.out.println("--Budget Chef Knife");
        }
    }
    
    @Override
    public String toString(){
        return "*****BUDGET KNIFE STORE";
    }
    
}
