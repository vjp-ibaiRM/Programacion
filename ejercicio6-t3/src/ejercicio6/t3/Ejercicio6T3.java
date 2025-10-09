/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6.t3;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
        
public class Ejercicio6T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduzca su nota");
    int entrada = scanner.nextInt();
    switch(entrada){
        case 0,1,2,3,4:
        System.out.println("Su nota es un suspenso");
        break;
        case 5,6:
        System.out.println("Su nota es un bien");
        break;
        case 7,8:
        System.out.println("Su nota es un notable");
        break;
        case 9,10:
        System.out.println("Su nota es un sobresaliente");
        break;
        default:
        System.out.println("Error.");
    }
    }
    
}