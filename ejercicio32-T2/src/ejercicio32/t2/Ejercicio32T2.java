/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32.t2;

/**
 *
 * @author alumno
 */
public class Ejercicio32T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int dinero = 130;
        int billete50 = dinero / 50;
        int resto = dinero % 50;
        int billete10 = resto / 10;
        System.out.println( "130 euros hacen un total de: " + billete50 + " billetes de 50 euros y " + billete10 + " billetes de 10 euros.");
        // TODO code application logic here
    }
    
}
