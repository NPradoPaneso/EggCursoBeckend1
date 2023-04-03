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
public class Ejercicio1Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el priemr numero:");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrse el segundo numero:");
        int num2 = leer.nextInt();
        
        System.out.println("Igrese la operacion matematica que desea hacer (suma, resta, multiplicacion o division)");
        String operacionMath = leer.next();
        int resultado = 0;
        
        switch(operacionMath){
            case "suma" -> resultado = suma(num1,num2);
            case "resta" -> resultado = resta(num1,num2);
            case "multiplicacion" -> resultado = multiplicacion(num1,num2);
            case "division" -> resultado = division(num1,num2);
            default ->
            {
                System.out.println("Operacion invalida");
                return;
            }
                   
        }
        System.out.println("El resultado de la " + operacionMath + " es " + resultado );
        
    }
    
    public static int suma (int num1, int num2){
        return num1 + num2;
    }
    
    public static int resta (int num1, int num2){
        return num1 - num2;
    }
    public static int multiplicacion (int num1, int num2){
        return num1 * num2;
    }
    public static int division (int num1, int num2){
        if(num2 == 0){
        System.out.println("Recuerda, no se puede dividir por 0");
        System.out.println("Ingresa nuevamente el segundo numero");
        
        
    }
        return num1/num2;
    }
}
 