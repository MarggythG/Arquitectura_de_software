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
public class IdleState implements State{
    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("dollar inserted");
        
        vendingMachine.setState(vendingMachine.getOne());
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("no money to return");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("payment required");
    }
    
}

