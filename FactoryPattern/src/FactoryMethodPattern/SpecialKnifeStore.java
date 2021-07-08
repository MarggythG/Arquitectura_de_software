    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. boning, bread, cleaver
 */
package FactoryMethodPattern;

/**
 *
 * @author mjoha
 */
public class SpecialKnifeStore extends KnifeStore {
    
    public Knife createKnife(String knifeType){
        if (knifeType.equals("Boning")){
            return new BudgetBoningKnife();
        } else if (knifeType.equals("Bread")){
            return new BudgetBreadKnife();
        } else if (knifeType.equals("Cleaver")){
            return new BudgetCleaverKnife();
        }
        else return null;
    }   

    private static class BudgetBoningKnife extends Knife {

        public BudgetBoningKnife() {
            this.nameKnife = "BoningKnife";
            System.out.println("--Budget Boning Knife");
        }
    }

    private static class BudgetBreadKnife extends Knife {

        public BudgetBreadKnife() {
            this.nameKnife = "BreadKnife";
            System.out.println("--Budget Bread Knife");
        }
    }

    private static class BudgetCleaverKnife extends Knife {

        public BudgetCleaverKnife() {
            this.nameKnife = "CleaverKnife";
            System.out.println("--Budget Cleaver Knife");
        }
    }
    
    @Override
    public String toString(){
        return "*****SPECIAL KNIFE STORE";
    }
    
}
