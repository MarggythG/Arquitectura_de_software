package exampledecoratorpattern;
// La clase Mazda3 hereda de la Clase Automovil
public class Mazda3 extends Automovil{
     //Metodos de la clase
    @Override
    public String getDescription(){
        return "Mazda 3, Modelo 2011, Color gris";
    }
    @Override
    public int getPrice(){
        return 20000000;
    }
}
