/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler.handlerconcrete;

import handler.PurchasePower;
/**
 *
 * @author mjoha
 */

public class GerentePower extends PurchasePower {

	/* (non-Javadoc)
	 * @see manejador.PurchasePower#getAllowable()
	 */
	protected double getAllowable() {
		// TODO Auto-generated method stub
		return BASE*6;
	}

	/* (non-Javadoc)
	 * @see manejador.PurchasePower#getRole()
	 */
	protected String getRole() {
		// TODO Auto-generated method stub
		return "Gerente";
	}

}
