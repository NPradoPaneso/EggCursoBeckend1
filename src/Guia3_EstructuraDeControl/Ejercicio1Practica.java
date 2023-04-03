/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia3_EstructuraDeControl;

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
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        if (num % 2 == 0){
            System.out.println("El numero es par");
        } else{
            System.out.println("El numero es impar");
        }
    }
    
}
