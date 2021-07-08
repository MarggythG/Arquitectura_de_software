/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;

/**
 *
 * @author mjoha
 */
import interfaz.InterfaceCliente;
import request.LicenseRequest;

public abstract class PurchasePower implements InterfaceCliente{
    
	protected static final double BASE = 1;
	protected PurchasePower successor;

	abstract protected double getAllowable();

	abstract protected String getRole();

	public void setSuccessor(PurchasePower successor) {
		this.successor = successor;
	}

	public void processRequest(LicenseRequest request) {
            
		if (request.getDays() < this.getAllowable()) {
			System.out.println(this.getRole() + " will approve days "
					+ request.getDays());
		} else if (successor != null) {
			successor.processRequest(request);
		}
	}
}
