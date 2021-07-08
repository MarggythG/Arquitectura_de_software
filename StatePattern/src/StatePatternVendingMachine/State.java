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
public interface State {
    
    public void insertDollar(VendingMachine vendingMachine);
    public void ejectMoney(VendingMachine vendingMachine);
    public void dispense(VendingMachine vendingMachine);

    
}
