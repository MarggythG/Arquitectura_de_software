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
public class Main {
    
    public static void main(String[] args) {
        
        Singleton yamaha = Singleton.getInstance("Yamaha");
        Singleton tvs = Singleton.getInstance("TVS");
        Singleton bajaj = Singleton.getInstance("Bajaj");
        
        System.out.println(yamaha.getMarca());
        System.out.println(tvs.getMarca());
        System.out.println(bajaj.getMarca());
        
        
    }
    
}
