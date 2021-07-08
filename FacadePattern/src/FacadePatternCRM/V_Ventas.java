/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePatternCRM;

/**
 *
 * @author mjoha
 */
public class V_Ventas {
    
    private int valorVenta;
    private String codigoVenta;
    
    public V_Ventas(int valorVenta, String codigoVenta){
        this.valorVenta = valorVenta;
        this.codigoVenta = codigoVenta;
    }
    
    public int getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(int valorVenta) {
        this.valorVenta = valorVenta;
    }

    public String getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
    }
    
}
