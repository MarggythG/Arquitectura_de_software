import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * Clase interfaz que permite visualizar la seleccion que realiza el usuario,
 * indicando cual fue el color seleccionado, esta clase solo cumple la funcion de observador
 * @author Juan Amortegui
 *
 */
public class VentanaSeleccion extends JFrame implements Observer{
	
	JLabel titulo,color;
	int colorSeleccionado;
	ClaseObservador miObservador;

	
	public VentanaSeleccion(ClaseObservador observador)
	{
	  miObservador=observador;		
		
	  titulo= new JLabel();
	  titulo.setText("COLOR SELECCIONADO");
	  titulo.setBounds(20, 10, 150, 25);
		 
	  color= new JLabel();
	  color.setText("No Ha seleccionado un Color");
	  color.setBounds(20, 40, 180, 25);
	  
	  add(titulo);
	  add(color);
	  
	  setSize(230,100);
	  setTitle("Ventana Color");
	  setLocation(700, 300);
	  setLayout(null);
	  setVisible(true);
	}



	@Override
	public void update(Observable arg0, Object arg1) 
	{
		colorSeleccionado=miObservador.getColorSeleccionado();
		switch (colorSeleccionado)
		{
		case 1:color.setText(miObservador.getColor());
		break;
		case 2:color.setText(miObservador.getColor());
		break;
		case 3:color.setText(miObservador.getColor());
		break;
		case 4:color.setText(miObservador.getColor());
		break;
		case 5:color.setText(miObservador.getColor());
		break;
		case 6:color.setText(miObservador.getColor());
		break;
		case 7:color.setText(miObservador.getColor());
		break;
		default : color.setText("No Ha seleccionado un Color");

		}
	}
}
