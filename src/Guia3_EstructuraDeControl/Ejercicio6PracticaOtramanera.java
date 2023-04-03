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
public class Ejercicio6PracticaOtramanera {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 , num2 , opcion;
        boolean val = true;
                
        String confirmacion;
        
       
        System.out.println("Ingrese el primero numero");
        num1 = leer.nextInt();
        System.out.println("ingrese el segundo numero ");
        num2 = leer.nextInt();
        
        do{
            System.out.println("====================");
            System.out.println("|       MENU       |");
            System.out.println("====================");
            System.out.println("| 1. Sumar         |");
            System.out.println("| 2. Restar        |");
            System.out.println("| 3. Multiplicar   |");
            System.out.println("| 4. Dividr        |");
            System.out.println("| 5. Salir         |");
            System.out.println("====================");
            
            System.out.println("Elija una opcion");
            opcion = leer.nextInt();
            
            switch (opcion){
                case 1 -> System.out.println("La suma es: " + (num1 + num2));
                case 2 -> System.out.println("La resta es: " + (num1 - num2));
                case 3 -> System.out.println("La multiplicacion es: " + (num1 * num2));
                case 4 ->
                { 
                    if (num2 == 0){
                        System.out.println("Recuerde, no se puede dividir por 0");
                    } else {
                        System.out.println("La division es: " + ((double)num1 / num2));
                    }
                }
                case 5 ->
                {
                    System.out.println("¿Esta Seguro que desea salir del programa (S/N)? ");
                    confirmacion = leer.next();
                    if (confirmacion.toLowerCase().equals("s") == true){
                        System.out.println("Saliendo del programa");
                        val = false; 
                    }
                }
                default -> System.out.println("De vuelta al menu");
                    
                        
            }
            
        } while(val==true); 
        
    }
    
}
