
/**
 * Clase principal del aplicativo, se establecen las instancias
 * entre las clases y el patron observer
* @author Juan Amortegui
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ClaseObservador observador=new ClaseObservador();
		VentanaOpciones miVentanaOpciones=new VentanaOpciones(observador);
		VentanaColor miVentanaColor=new VentanaColor(observador);
		VentanaSeleccion miVentanaSeleccion=new VentanaSeleccion(observador);
                VentanaBoton miVentanaBoton = new VentanaBoton(observador);
	
		/*Aqui se Agregan los observadores*/
		observador.addObserver(miVentanaColor);
		observador.addObserver(miVentanaSeleccion);
		observador.addObserver(miVentanaOpciones);
                observador.addObserver(miVentanaBoton);
	}
}
