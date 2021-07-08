/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePatternBank;

import java.math.BigDecimal;
import java.util.Hashtable;

/**
 *
 * @author mjoha
 */
public class BankService {
    
    //atributos
    private Hashtable<Integer, IAccount> bankAccounts;
    
    //constructor
    public BankService(){
        this.bankAccounts = new Hashtable<Integer, IAccount>();
    }
    
    //métodos
    public int createNewAccount(String type, BigDecimal initAmount){
        IAccount newAccount = null;
        
        switch(type){
            case "chequing":
                newAccount = new Chequing(initAmount, (int) (Math.random()*((20-1)+1))+1);
                break;
            case "saving":
                newAccount = new Saving(initAmount, (int) (Math.random()*((20-1)+1))+1);
                break;
            case "investment":
                newAccount = new Investment(initAmount, (int) (Math.random()*((20-1)+1))+1);
                break;
            default:
                System.out.println("Invalid account type");
            break;
        }
        if(newAccount != null ){
            this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }
        return newAccount.getAccountNumber();
    }
    
    
    public void transferMoney(int to, int from, BigDecimal amount){
        System.out.println("Tranferencia desde No. cuenta: " + from + " a No. cuenta: " + to + " por valor de " + amount);
        IAccount toAccount = this.bankAccounts.get(to);
        IAccount fromAccount = this.bankAccounts.get(from);
        fromAccount.tranfer(toAccount, amount);
    }

    
}
