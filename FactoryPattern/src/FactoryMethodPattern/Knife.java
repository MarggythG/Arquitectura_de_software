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
class Knife {
    
    String nameKnife;

    public String getNameKnife() {
        return nameKnife;
    }

    public void setNameKnife(String nameKnife) {
        this.nameKnife = nameKnife;
    }

    public void shapern() {
        System.out.println("Knife Shapern.");
    }

    public void polish() {
        System.out.println("Knife Polish.");
    }

    public void packages() {
        System.out.println("Knife Packages.");
    }
    
}
