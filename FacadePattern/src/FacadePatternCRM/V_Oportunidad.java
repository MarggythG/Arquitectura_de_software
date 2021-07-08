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
public class V_Oportunidad {
    
    private V_Ventas venta;
    private String oportunidad;
    
    public V_Oportunidad(V_Ventas venta, String oportunidad){
        this.venta = venta;
        this.oportunidad =oportunidad;
    }

    public V_Ventas getVenta() {
        return venta;
    }

    public void setVenta(V_Ventas venta) {
        this.venta = venta;
    }

    public String getOportunidad() {
        return oportunidad;
    }

    public void setOportunidad(String oportunidad) {
        this.oportunidad = oportunidad;
    }
    
    
}
