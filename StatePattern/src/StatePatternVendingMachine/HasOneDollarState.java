/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePatternVendingMachine;

/**
 *
 * @author user
 */
public class HasOneDollarState implements State{

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("have a dollar");
        vendingMachine.doReturnMoney();
        vendingMachine.setState(vendingMachine.getId());
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("return Money");
        vendingMachine.doReturnMoney();
        vendingMachine.setState(vendingMachine.getId());
       
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        if(vendingMachine.getCount()>1){
            vendingMachine.doProduct();
            vendingMachine.setState(vendingMachine.getId());
        }else{
            vendingMachine.doProduct();
            vendingMachine.setState(vendingMachine.getOut());
        }
    }
    
}
