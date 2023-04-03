/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra 
de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un 
mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.

 */
package Guia3_EstructuraDeControl;

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
        System.out.println("Escriba una frase o una palabra");
        String frase = leer.nextLine();
        
        if (frase.substring(0,1).toLowerCase().equals("a")){
            System.out.println("Es correcto");
        } else {
            System.out.println("Es incorrecto");
        }
    }
    
}
