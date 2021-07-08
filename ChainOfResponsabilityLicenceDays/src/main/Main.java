/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import interfaz.InterfaceCliente;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import handler.handlerconcrete.CoordinadorPower;
import handler.handlerconcrete.DirectorPower;
import handler.handlerconcrete.GerentePower;
import handler.handlerconcrete.PresidentePower;
import handler.handlerconcrete.VicepresidentePower;
import java.util.Scanner;
import request.LicenseRequest;

/**
 *
 * @author mjoha
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int tipoPermiso = 0;

        CoordinadorPower coordinador = new CoordinadorPower();
        DirectorPower director = new DirectorPower();
        GerentePower gerente = new GerentePower();
        VicepresidentePower vp = new VicepresidentePower();
        PresidentePower presidente = new PresidentePower();
        
        InterfaceCliente interfaceCliente1 = coordinador;
        InterfaceCliente interfaceCliente2 = vp;
        

        // Press Ctrl+C to end.
        System.out.println("Selecciones el tipo de permiso que desea solicitar");
        System.out.println("1. Permiso normal.");
        System.out.println("2. Permiso especial.");
        tipoPermiso = sc.nextInt();
        switch (tipoPermiso) {

            case 1:
                coordinador.setSuccessor(director);
                director.setSuccessor(gerente);
                gerente.setSuccessor(presidente);
                try {
                    while (true) {
                        System.out.println("Ingrese los días para verificar quién debe aprobar su licencia.");
                        System.out.print(">");
                        int d = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
                        interfaceCliente1.processRequest(new LicenseRequest(d, "General"));
                    }
                } catch (Exception e) {
                    System.exit(1);
                }
                break;
            case 2:
                
                vp.setSuccessor(presidente);
                
                try {
                    while (true) {
                        System.out.println("Ingrese los días para verificar quién debe aprobar su licencia.");
                        System.out.print(">");
                        double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                        interfaceCliente2.processRequest(new LicenseRequest(d, "General"));
                    }
                } catch (Exception e) {
                    System.exit(1);
                }
                break;

        }

    }

}
