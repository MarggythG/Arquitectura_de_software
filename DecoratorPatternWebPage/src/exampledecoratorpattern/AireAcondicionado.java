package exampledecoratorpattern;

import exampledecoratorpattern.AutomovilDecorator;
import exampledecoratorpattern.VentaAuto;

public class AireAcondicionado extends AutomovilDecorator{
    //Constructor se envia el paramatrea al metodo
    public AireAcondicionado(VentaAuto ventaAuto){
        //permite acumular
        super(ventaAuto);
    }
     //Metodos que retornan del componente y del decorador concreto
    @Override
    public String getDescription(){
        return getVentaAuto().getDescription() + "+ Aire Acondicionado";
    }
     //Metodos que retornan del componente y del decorador concreto
    @Override
    public int getPrice(){
        return getVentaAuto().getPrice()+ 800000;
    }
}
