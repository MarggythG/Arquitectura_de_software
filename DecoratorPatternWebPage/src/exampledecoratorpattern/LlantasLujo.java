package exampledecoratorpattern;

public class LlantasLujo extends AutomovilDecorator{
    //Constructor se envia el paramatrea al metodo
    public LlantasLujo(VentaAuto ventaAuto){
        super(ventaAuto);
    }
    
    //Metodos que retornan del componente y del decorador concreto
    @Override
    public String getDescription(){
        return getVentaAuto().getDescription() + "+ Llantas de lujo";
    }
     //Metodos que retornan del componente y del decorador concreto
    @Override
    public int getPrice(){
        return getVentaAuto().getPrice()+ 1000000;
    }
}
