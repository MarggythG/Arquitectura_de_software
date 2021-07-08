/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplatePatternETL;

/**
 *
 * @author mjoha
 */
public class Main {
    
    public static void main(String[] args) {
        
        GenericETL json = new JsonETL();
        System.out.println("----------------------------------------------------");
        
        GenericETL csv = new CsvETL();
        System.out.println("----------------------------------------------------");
        
        GenericETL xml = new CloudETL();
        xml.Load();
        
    }
    
}
