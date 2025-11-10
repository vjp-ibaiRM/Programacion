/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1.t3;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class Ejercicio1T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
    System.out.println("Por favor, introduzca un numero de 3 cifras");
    int entrada = scanner.nextInt();
    if(entrada > 0){
        System.out.println("El numero es positivo");        
    }
    else{
    System.out.println("El numero es negativo");
    }
    }
    
}
