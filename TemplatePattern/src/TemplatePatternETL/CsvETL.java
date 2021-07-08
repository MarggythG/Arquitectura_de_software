/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplatePatternETL;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author mjoha
 */
public class CsvETL extends GenericETL{
    
    ArrayList<ArrayList<String>> datos;
    
    public CsvETL(){
        Load();
    }
    
    @Override
    public void Load(){
        datos = new ArrayList<ArrayList<String>>();
        Path filePath = Paths.get("datosETL.csv");
        try{
            BufferedReader br = Files.newBufferedReader(filePath);
            String linea;
            while((linea = br.readLine()) != null){
                String[] datosL = linea.split(",");
                ArrayList<String> datosTemporal = new ArrayList<String>();
                for (String dato : datosL){
                    datosTemporal.add(dato);
                }
                datos.add(datosTemporal);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        Transform();
    }
    
    @Override
    public void Transform(){
        System.out.println(datos.toString().toUpperCase());
    }
    
    @Override
    public void Extraction(){
    }
    
 
}
