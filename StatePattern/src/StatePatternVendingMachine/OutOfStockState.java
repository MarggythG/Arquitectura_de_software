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
public class OutOfStockState implements State{

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        vendingMachine.doReturnMoney();
        System.out.println("out of stock");
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("out of stock");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("out of stock");
    }
    
}
