/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplatePatternETL;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author mjoha
 */
public class JsonETL extends GenericETL{
    
    JSONArray array;
    JSONObject jsonobject;
    
    public JsonETL(){
        Load();
    }
    
    @Override
    public void Load(){
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("datosETL.json"));
            jsonobject = (JSONObject) obj;
            //System.out.println(jsonobject);
            Extraction();
            array = (JSONArray) jsonobject.get("Sitios");
            Transform();
            
        } catch (FileNotFoundException e){}
        catch (IOException e){}
        catch (ParseException e){}
    }
    
    @Override
    public void Transform(){
        for (int i = 0; i < array.size(); i++) {
            JSONObject o = (JSONObject) array.get(i); 
            System.out.println("Sitio turítico: " + o.get("sitios").toString().toUpperCase());
            System.out.println("Ubicacion: " + o.get("ubicacion").toString().toUpperCase());
            System.out.println("Coordenadas: " + o.get("coordenadas").toString().toUpperCase());
        }
    }
    
    @Override
    public void Extraction(){
        //System.out.println("Archivo JSON" + jsonobject);
    }
    
    
    
    
    
}
