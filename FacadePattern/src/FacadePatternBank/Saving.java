/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePatternBank;

import java.math.BigDecimal;

/**
 *
 * @author mjoha
 */
public class Saving implements IAccount {
    
    //atributos
    private int accountNumber;
    private BigDecimal amount;

    //constructor
    Saving(BigDecimal initAmount, int accountNumber) { 
    this.amount = initAmount;
    this.accountNumber = accountNumber;
    }

    //métodos
    @Override
    public void deposit(BigDecimal amount) {
        System.out.println("Depositando a No. cuenta: " + this.accountNumber);
        this.amount = this.amount.add(amount);
        System.out.println("No. cuenta: " + this.accountNumber + " Now: " + this.amount);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        System.out.println("Retirando de No. cuenta " + this.accountNumber);
        if (this.amount.compareTo(amount) != 1){
            System.out.println("El retiro es mayor al monto de la cuenta");
        } else {
            this.amount = this.amount.subtract(amount);
            System.out.println("No. cuenta: " + this.accountNumber + " Now: " + this.amount);
        }
    }

    @Override
    public void tranfer(IAccount account, BigDecimal amount) {
        if (this.amount.compareTo(amount) != 1){
            System.out.println("El valor a transferir es mayor al monto de la cuenta");
        } else {
            withdraw(amount);
            account.deposit(amount);
        }
        System.out.println("No. cuenta: " + this.accountNumber + " Now: " + this.amount);
    }
    
    @Override
    public int getAccountNumber() {
        return this.accountNumber;
    }
    
}
