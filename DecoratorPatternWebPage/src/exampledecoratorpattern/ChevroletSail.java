package exampledecoratorpattern;
// La clase ChevroletSail hereda de la Clase Automovil
public class ChevroletSail extends Automovil {
    //Metodos de la clase retorna un String
    @Override
    public String getDescription(){
        return "Chevrolet Sail, Modelo 2019, Color rojo";
    }
    //Metodos de la clase retorna un Int
    @Override
    public int getPrice(){
        return 30000000;
    }
}

