/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePatternVendingMachine;

/**
 *
 * @author mjoha
 */
public class Main {
    
    public static void main(String[] args) {
        // TODO code application logic here
        VendingMachine maquina = new VendingMachine(2);
        maquina.dispense();
        maquina.insertDollar();
        maquina.dispense();
        maquina.ejectMoney();
        maquina.insertDollar();
        maquina.insertDollar();
        maquina.dispense();
        maquina.insertDollar();
    }
    
}
