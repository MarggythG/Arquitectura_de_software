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
public abstract class PastaDish {
    
    public final void makeRecipe(){
        boilWater();
        addPasta();
        drainAndPlate();
        addSauce();
        addProtein();
        addGarnish();
    }
    
    protected abstract void addPasta();
    protected abstract void addSauce();
    protected abstract void addProtein();
    protected abstract void addGarnish();
    
    private void boilWater(){
        System.out.println("Boiling Water");
    }
    
    private void drainAndPlate(){
        System.out.println("Drain and Plate");
    }
}
