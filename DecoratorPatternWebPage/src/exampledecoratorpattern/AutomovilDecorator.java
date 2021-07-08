package exampledecoratorpattern;
// La clase AutomovilDecorator implementa la Clase VentaAuto
public abstract class AutomovilDecorator implements VentaAuto{
    //Atributo
    private VentaAuto ventaAuto;
    //Constructor
    public AutomovilDecorator (VentaAuto ventaAuto){
        setVentaAuto(ventaAuto);
    }
    //Metodos
    public VentaAuto getVentaAuto(){
        return ventaAuto;
    }
    
    public void setVentaAuto(VentaAuto ventaAuto){
        this.ventaAuto=ventaAuto;
    }
}
