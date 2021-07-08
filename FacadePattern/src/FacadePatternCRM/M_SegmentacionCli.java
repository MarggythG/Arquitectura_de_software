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
public class M_SegmentacionCli {
    
    private String tipoPoblacion;
    private String nombreSegmentoCliente;
    
    public M_SegmentacionCli(String tipoPoblacion, String nombreSegmentoCliente){
        this.tipoPoblacion = tipoPoblacion;
        this.nombreSegmentoCliente = this.nombreSegmentoCliente;
    }

    public String getTipoPoblacion() {
        return tipoPoblacion;
    }

    public void setTipoPoblacion(String tipoPoblacion) {
        this.tipoPoblacion = tipoPoblacion;
    }

    public String getNombreSegmentoCliente() {
        return nombreSegmentoCliente;
    }

    public void setNombreSegmentoCliente(String nombreSegmentoCliente) {
        this.nombreSegmentoCliente = nombreSegmentoCliente;
    }
    
    
    
}
