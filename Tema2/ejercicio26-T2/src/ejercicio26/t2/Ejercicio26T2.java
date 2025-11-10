/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26.t2;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class Ejercicio26T2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca un numero de 4 cifras");
        
        String entrada = scanner.nextLine();
        
        System.out.println("La primera cifra es: " + entrada.charAt(0));
        System.out.println("La segunda cifra es: " + entrada.charAt(1));
        System.out.println("La tercera cifra es: " + entrada.charAt(2));
        System.out.println("La cuarta cifra es: " + entrada.charAt(3));
        
        scanner.close();
    }
    
}
