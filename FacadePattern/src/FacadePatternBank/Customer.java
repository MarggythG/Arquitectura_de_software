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
public class Customer {
    
    public static void main(String[] args) {
        
        BankService myBankService = new BankService();
        
        int mySaving = myBankService.createNewAccount("saving", new BigDecimal(500.00));
        System.out.println("No. cuenta: " + mySaving);
        
        int myInvestment = myBankService.createNewAccount("investment", new BigDecimal(1000.00));
        System.out.println("No. cuenta: " + myInvestment);
        
        int myChequing = myBankService.createNewAccount("chequing", new BigDecimal(3000.00));
        System.out.println("No. cuenta: " + myChequing);
        
        myBankService.transferMoney(mySaving, myInvestment, new BigDecimal(300.00));
        myBankService.transferMoney(myInvestment, myChequing, new BigDecimal(300.00));
        
    }
    
}
