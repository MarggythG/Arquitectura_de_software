/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePatternCRM;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mjoha
 */
public class CRM {
    
    private List<PQR> pqrList;
    private List<V_Ventas> ventas;
    private List<V_Oportunidad> oportunidades;
    private List<M_Campaña> campañaList;
    private String nombreCliente;
    
    public CRM(String nombreCliente){
        pqrList = new ArrayList<>();
        ventas = new ArrayList<>();
        oportunidades = new ArrayList<>();
        campañaList = new ArrayList<>();
        this.nombreCliente = nombreCliente;
    }
    
    public void crearPQR(String tipo, String mensaje){
        switch (tipo) {
            case "P":
                pqrList.add(new SC_Peticiones(mensaje));
                break;
            case "Q":
                pqrList.add(new SC_Quejas(mensaje));
                break;
            case "R":
                pqrList.add(new SC_Reclamos(mensaje));
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }
    
    public void listarCampañas(){
        System.out.println("Venta - " + "Venta Garage");
        
    }
    
    public void consultarPQR(String estado){
        System.out.println("En proceso");
    }
    
    public V_Ventas crearVenta(int valorVenta, String codigoVenta){
        V_Ventas venta = new V_Ventas(valorVenta, codigoVenta);
        ventas.add(venta);
        return venta;
    }
    
    public void crearOportunidad(String oportunidad, int valorVenta, String numeroVenta) {
        oportunidades.add(new V_Oportunidad(crearVenta(valorVenta, numeroVenta), oportunidad));
    }
    
    public void verHistoriaCredito() {
        System.out.println(nombreCliente);
        ventas.forEach(venta -> System.out.println(venta.getCodigoVenta() + " " + venta.getValorVenta()));
    }

    

}
