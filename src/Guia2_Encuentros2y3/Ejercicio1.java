 /*Escribir un programa que pida dos números enteros por teclado y calcule la 
  *suma de los dos. El programa deberá después mostrar el resultado de la suma 
 */
package Guia2_Encuentros2y3;

import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        
        System.out.println("El resultado de la suma es " + suma);
        
                

        
    }
    
}