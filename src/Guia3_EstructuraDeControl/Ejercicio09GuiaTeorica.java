/*
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero 
   se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
   El programa deberá calcular y mostrar el resultado de la suma de los números 
   leídos, pero si el número es negativo no debe sumarse
 */
package Guia3_EstructuraDeControl;

import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class Ejercicio09GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        int suma = 0;
        int i = 0;
        int num;
        
        do {
            System.out.println("Ingrese un número:");
            num = leer.nextInt();
            
            if (num == 0) {
                System.out.println("Se capturó el número cero.");
                break;
            } else if (num > 0) {
                suma += num;
            }
            
            i++;
        } while (i < 20);
        
        System.out.println("La suma de los números leídos es: " + suma);
    }
}
           
            
                
        
    
    

