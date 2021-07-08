/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPatron;

/**
 *
 * @author mjoha
 */
public class Singleton {
    
    private String marca;
    private static Singleton uniqueInstance = null;
    
    private Singleton(String marca){
    this.marca = marca;
        System.out.println("La marca es: " + this.marca);
    }
    
    public static Singleton getInstance(String marca){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton(marca);
        } else {
            System.out.println("No se puede crear " + marca + " Ya existe una marca en la clase Singleton");
        }
        return uniqueInstance;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Singleton{" + "marca=" + marca + '}';
    }
    
    
}
