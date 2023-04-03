/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Egg.introVideos;

import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // T  //Se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        //Se crea una variable cadena (String) que se utiliza para leer datos del usuario
        String nombre;
        //Muestra un mensaje por pantalla
        System.out.println("Ingresa tu nombre");
        //Leemos el nombre de la persona en la varibale nombre
        nombre = leer.next();
        //Mostraos por consola un saludo personalizado
        System.out.println("Hola mundo! soy " + nombre + " y estoy programando en java.");
        
        
        
        
    }
    
}
