package exampledecoratorpattern;

public class ExampleDecoratorPattern {
    //Cliente
    public static void main(String[] args) {
        VentaAuto automovil= new ChevroletSail();
        automovil=new Mp4Player(automovil);
        automovil=new LlantasLujo(automovil);
        automovil=new AireAcondicionado(automovil);
        automovil=new VidriosElectricos(automovil);        
        
        System.out.println(automovil.getDescription());
        System.out.println("Su precio es: "+ automovil.getPrice());
          
    }
    
}
