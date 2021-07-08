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


public class CoordinadorPower extends PurchasePower {

	protected double getAllowable() {
		// TODO Auto-generated method stub
		return BASE*2;
	}

	protected String getRole() {
		// TODO Auto-generated method stub
		return "Coordinador";
	}

}
