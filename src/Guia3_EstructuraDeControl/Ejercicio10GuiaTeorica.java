/*
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
   el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package Guia3_EstructuraDeControl;

import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class Ejercicio10GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int num;

        for (int i = 1; i <= 4; i++) {
            do {
                System.out.print("Ingrese el número " + i + " entre 1 y 20: ");
                num = input.nextInt();

                if (num < 1 || num > 20) {
                    System.out.println("Número incorrecto. Por favor, ingrese un número del 1 al 20.");
                }
            } while (num < 1 || num > 20);

            System.out.print(num + ": ");
            for (; num > 0; num--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 
                
   