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
public class EncuestaCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la pelicula de 1 a 5 estrellas");
        opinion = leer.nextInt();
        
        
        if (opinion >= 1 && opinion <= 5) {
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados que no hayas disfrutado la pelicula");
                    break;
                case 3:
                    System.out.println("Has calificado como buena la pelicula");
                    break;
                case 4:
                    System.out.println("Has calificado la pelkcula como muy buena ");
                    break;
                case 5:
                    System.out.println("Genial. Nos alegra que hayas disfrutado de un excelente ");
                    break;                   
                   
                           
            }
        } else if (opinion < 0) {
            System.out.println("opinion negativa");
        } else if (opinion == 0) {
            System.out.println("el valor " + opinion + "no es valido");
        } else {
            System.out.println(opinion + " wow, se te fue la mano con la puntuacion");
        }
        System.out.println("hasta la proxima");
    }
    
}
