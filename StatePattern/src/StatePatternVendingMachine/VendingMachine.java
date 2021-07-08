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
public class VendingMachine {
    private State idleState;
    private State hasOneDollarState;
    private State outOfStockState;
    
    private State currentState;
    private int count;
    
    public VendingMachine (int count){
        idleState = new IdleState();
        hasOneDollarState = new HasOneDollarState();
        outOfStockState = new OutOfStockState();
        if(count>0){
            currentState = idleState;
            this.count = count;
        }else{
            currentState = outOfStockState;
            this.count = 0;
        }
    }
    
    public void insertDollar(){
        currentState.insertDollar(this);
    }
    public void ejectMoney(){
        currentState.ejectMoney(this);
    }
    public void dispense(){
        currentState.dispense(this);
    }
    
    public void setState(State estado){
        currentState = estado;
    }
    
    public State getOne(){
        return hasOneDollarState;
    }
    public void doReturnMoney(){
        System.out.println("take your money");
    };
    
    public State getId(){
        return idleState;
    }
    public int getCount(){
        return count;
    }
    public void doProduct(){
        System.out.println("Take your product");
        count = count - 1;
    }
    public State getOut(){
        return outOfStockState;
    }
}
