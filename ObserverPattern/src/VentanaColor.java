import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


/**
 * Ventana que permite ver el color que ha sido seleccionado desde la ventana
 * opciones o directamente desde la misma, cumple el papel de
 * clase observador y clase observable
 * @author Juan Amortegui
 *
 */
public class VentanaColor extends JFrame implements Observer, ActionListener{
	
	JPanel miPanelColor;
	JLabel titulo,mensaje;
	int colorSeleccionado;
	ClaseObservador miObservador;
	ButtonGroup grupo;
	JRadioButton amarillo,azul,rojo,verde,negro,blanco,inv;

	
	public VentanaColor(ClaseObservador observador)
	{
	  miObservador=observador;
		
	  titulo= new JLabel();
	  titulo.setText("COLOR SELECCIONADO");
	  titulo.setBounds(130, 10, 150, 25);
	  
	  mensaje= new JLabel();
	  mensaje.setText("NO HA SELECCIONADO UN COLOR");
	  mensaje.setBounds(10, 60, 250, 25);
		
	  miPanelColor=new JPanel();
	  miPanelColor.setBounds(5, 66, 380, 190);
	  
	  amarillo=new JRadioButton();
	  amarillo.setText("Amarillo");
	  amarillo.setBounds(5, 40, 75, 25);
	  amarillo.addActionListener(this);
	  
	  azul=new JRadioButton();
	  azul.setText("Azul");
	  azul.setBounds(80, 40, 50, 25);
	  azul.addActionListener(this);
	  
	  rojo=new JRadioButton();
	  rojo.setText("Rojo");
	  rojo.setBounds(130, 40, 50, 25);
	  rojo.addActionListener(this);
	  
	  verde=new JRadioButton();
	  verde.setText("Verde");
	  verde.setBounds(180, 40, 60, 25);
	  verde.addActionListener(this);
	  
	  negro=new JRadioButton();
	  negro.setText("Negro");
	  negro.setBounds(236, 40, 60, 25);
	  negro.addActionListener(this);
	  
	  blanco=new JRadioButton();
	  blanco.setText("Blanco");
	  blanco.setBounds(295, 40, 70, 25);
	  blanco.addActionListener(this);
	  
	  inv=new JRadioButton();
	  inv.setText("Blanco");
	  inv.setBounds(495, 40, 70, 25);
	  inv.addActionListener(this);

	  
	  grupo = new ButtonGroup();
	  grupo.add(amarillo);
	  grupo.add(azul);
	  grupo.add(rojo);
	  grupo.add(verde);
	  grupo.add(negro);
	  grupo.add(blanco);
	  grupo.add(inv);
	  
	  add(amarillo);
	  add(azul);
	  add(rojo);
	  add(verde);
	  add(negro);
	  add(blanco);
	  add(mensaje);
	  add(titulo);
	  add(miPanelColor);
	  
	  setSize(400,300);
	  setTitle("Ventana Color");
	  setLocation(280, 300);
	  setLayout(null);
	  setVisible(true);
		
	}


/**Metodo de actualizar, comun para todos los metodos que implementen observer*/
	@Override
	public void update(Observable arg0, Object arg1) 
	{
		colorSeleccionado=miObservador.getColorSeleccionado();
		switch (colorSeleccionado)
		{
		case 1: mensaje.setText(""); 
		miPanelColor.setBackground(Color.yellow);
		amarillo.setSelected(true);
		break;
		case 2:mensaje.setText("");
		miPanelColor.setBackground(Color.blue);
		azul.setSelected(true);
		break;
		case 3: mensaje.setText("");
		miPanelColor.setBackground(Color.red);
		rojo.setSelected(true);
		break;
		case 4: mensaje.setText("");
		miPanelColor.setBackground(Color.green);
		verde.setSelected(true);
		break;
		case 5:mensaje.setText("");
		miPanelColor.setBackground(Color.black);
		negro.setSelected(true);
		break;
		case 6:mensaje.setText("");
		miPanelColor.setBackground(Color.white);
		blanco.setSelected(true);
		break;
		case 7:mensaje.setText("");
		miPanelColor.setBackground(Color.orange);
		inv.setSelected(true);
		break;
		default : mensaje.setText("NO HA SELECCIONADO UN COLOR");
		miPanelColor.setBackground(null);
		inv.setSelected(true);
		}
	
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==amarillo) 
			miObservador.setColorSeleccionado(1);
		if (e.getSource()==azul) 
			miObservador.setColorSeleccionado(2);
		if (e.getSource()==rojo) 
			miObservador.setColorSeleccionado(3);
		if (e.getSource()==verde) 
			miObservador.setColorSeleccionado(4);
		if (e.getSource()==negro) 
			miObservador.setColorSeleccionado(5);
		if (e.getSource()==blanco) 
			miObservador.setColorSeleccionado(6);
	}

}
