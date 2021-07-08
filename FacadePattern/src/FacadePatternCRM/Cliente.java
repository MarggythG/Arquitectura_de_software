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
public class Cliente {
    
    public static void main(String[] args) {
        
        CRM clienteUno = new CRM("Cliente 1");
        clienteUno.crearOportunidad("Invertir", 100, "1");
        clienteUno.crearPQR("Q", "Mal servicio");
        clienteUno.crearVenta(1000, "1");
        clienteUno.verHistoriaCredito();
        clienteUno.consultarPQR("En proceso");
        clienteUno.listarCampañas();
        
        
    }
            
    
}
