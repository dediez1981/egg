/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.introjava;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EncuestaCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la palicula de 1 a 5 estrellas");
        opinion = leer.nextInt();
        if (opinion>= 1 && opinion <=5){
            
            switch(opinion){
                case 1, 2 -> System.out.println("Nos sentimos apenados que no hayas disfrutado de la pelicula");
                case 3 -> System.out.println("Has calificado la pelicula como buena");
                case 4 -> System.out.println("Has calificado la pelicula como muy buena");
                case 5 -> System.out.println("Fantastico que hayas disfrutado un excelente entretenimiento");   
            }
        }else if (opinion<0){
            System.out.println("¿Una opinión negativa? ¿Tan mala fue la pelicula?");
        }else if (opinion == 0){
            System.out.println("El valor " + opinion+ " no es valido y no se tomara en cuenta. :(");    
        }else {
            System.out.println(opinion+"! Wow! Se te fue la mano con la clasificación :D");
        
        }
        System.out.println("Hasta la proxima!");
        
// TODO code application logic here
    }
    
}
