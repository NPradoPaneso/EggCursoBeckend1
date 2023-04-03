package Guia3_EstructuraDeControl;


/*
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 
de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de 
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá 
imprimir “INCORRECTO”
package Guia3;

/**
 *
 * @author nicop
 */
import java.util.Scanner;
public class Ejercicio3Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        if (frase.length() >= 4 && frase.length() <= 8  ){
            System.out.println("Es Correcto");
        } else {
            System.out.println("Es incorrecto");
        }
                
                
    }
    
}
