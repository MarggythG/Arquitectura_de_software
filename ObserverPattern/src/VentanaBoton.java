
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mjoha
 */
public class VentanaBoton extends JFrame implements Observer {
    
    
    JButton color;
    int colorSeleccionado;
    ClaseObservador miObservador;
    
    public VentanaBoton(ClaseObservador observador)
	{
	  miObservador=observador;		
		 
	  color = new JButton("Color");
	  color.setBounds(20, 10, 150, 25);
          
          add(color);
          
          setSize(230,100);
          setTitle("Ventana Boton");
          setLocation(700,400);
          setLayout(null);
          setVisible(true);
	  
	  
	}
  
    

    @Override
    public void update(Observable arg0, Object arg1) {
        
        colorSeleccionado=miObservador.getColorSeleccionado();
		switch (colorSeleccionado)
		{
		case 1: 
		color.setBackground(Color.yellow);
		//amarillo.setSelected(true);
		break;
		case 2:
		color.setBackground(Color.blue);
		break;
		case 3: 
		color.setBackground(Color.red);
		break;
		case 4:
		color.setBackground(Color.green);
		break;
		case 5:
		color.setBackground(Color.black);
		break;
		case 6:
		color.setBackground(Color.white);
		break;
		case 7:
		color.setBackground(Color.orange);
		break;
		default :
		color.setBackground(null);
		}
    
    }

    
    
}
