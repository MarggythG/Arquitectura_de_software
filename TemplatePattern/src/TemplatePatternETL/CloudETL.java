/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplatePatternETL;

import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

/**
 *
 * @author mjoha
 */
public class CloudETL extends GenericETL{
    
    NodeList listaSitios;
    
    @Override
    public void Load(){
        try{
            
            File archivo = new File("datosETL.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
            Document document = documentBuilder.parse(archivo);
            document.getDocumentElement().normalize();
            listaSitios = document.getElementsByTagName("sitio");
            Transform();
        } catch (Exception e){}        
    }
    
    @Override
    public void Transform(){
        for (int temp = 0; temp<listaSitios.getLength(); temp++){
            Node nodo = listaSitios.item(temp);
            //System.out.println(nodo);
            System.out.println("Elemento: " + nodo.getNodeName());
            if (nodo.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) nodo;
                System.out.println("id: " + element.getAttribute("id").toUpperCase());
                System.out.println("sitio: " + element.getElementsByTagName("sitios_de_interes").item(0).getTextContent().toUpperCase());
                System.out.println("ubicacion: " + element.getElementsByTagName("ubicacion").item(0).getTextContent().toUpperCase());
                System.out.println("coordendas: " + element.getElementsByTagName("coordenadas").item(0).getTextContent().toUpperCase());
            }
        }
    }
    
    @Override
    public void Extraction(){}
    
   
}
