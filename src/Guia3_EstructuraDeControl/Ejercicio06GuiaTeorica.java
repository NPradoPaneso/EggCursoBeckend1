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
public class Ejercicio06GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1 > 25 && num2 > 25){
            System.out.println("Los dos numero son mayores a 25");
        } else if (num1 > 25 || num2 > 25 ){
            System.out.println("Uno de los dos numeros es mayor a 25");
        } else {
            System.out.println("Ningun numero es mayor a 25");
        }
    }
    
}
