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
public abstract class KnifeStore {
    
    public Knife orderKnife(String knifeType){
        
        Knife knife;
        
        knife = createKnife(knifeType);
        
        knife.shapern();
        knife.polish();
        knife.packages();
        
        return knife;
    }
    
    abstract Knife createKnife(String knifeType);
    
}
