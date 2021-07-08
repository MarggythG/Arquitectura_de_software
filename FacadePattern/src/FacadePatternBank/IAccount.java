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
public interface IAccount {
    
    public void deposit(BigDecimal amount);
    
    public void withdraw(BigDecimal amount);

    public void tranfer(IAccount toAccount, BigDecimal amount);
    
    public int getAccountNumber();
    
}
