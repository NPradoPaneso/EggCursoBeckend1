/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package Guia3_EstructuraDeControl;

import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class Ejercicio5Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // leo
        Scanner leer = new Scanner(System.in); // lectura
        int limite, suma=0, numero;
        
        do {    // validacion - solo positivos
            System.out.println("Ingrese un limite");
             limite = leer.nextInt();
        } while (limite < 0);
        
        while(suma < limite){
            System.out.println("Ingrese un numero");
             numero = leer.nextInt();
             suma = numero + suma;
        }
        System.out.println("Suma final :" + suma);
    }
    
}
      