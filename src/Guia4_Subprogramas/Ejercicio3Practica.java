/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia4_Subprogramas;

import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class Ejercicio3Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduce la cantidad de euros que deseas convertir");
        double euros = leer.nextDouble();
        leer.nextLine();
        
        System.out.println("Introduce la moneda a la que deseas convertir (libras, dolares o yenes)");
        String moneda = leer.nextLine();
        
        cambioMoneda(euros, moneda);
                
    }
    
    public static void cambioMoneda(double euros, String moneda){
        double cambio = 0;
        String tipoMoneda = "";
        
        if (moneda.equalsIgnoreCase("libras")){
            cambio = 0.86;
            tipoMoneda = "libras";
        } else if (moneda.equalsIgnoreCase("Dolares")){
            cambio = 1.28611;
            tipoMoneda = "Dolares";
        } else if (moneda.equalsIgnoreCase("Yenes")){
            cambio = 129.852;
            tipoMoneda = "Yenes";
        } else {
            System.out.println("Moneda no valida.");
        }
            
        double cantidad = euros * cambio;
        System.out.println(euros + " euros son" + cantidad + " " + tipoMoneda);
        
    }
}
