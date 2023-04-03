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
public class Ejercicio4Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        if (numPrimo(num)){
            System.out.println("El numero: " + num + " es numero primo");
        } else {
            System.out.println("El numero: " + num + " no es numero primo");
        }
    }
    
    public static boolean numPrimo(int num){
        if (num < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++ ){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
