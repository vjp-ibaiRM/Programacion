/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9.t3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio9T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;
        int temp; // variable auxiliar para intercambiar valores

        System.out.print("Por favor, introduzca el primer número: ");
        a = sc.nextInt(); //el primer numero introducido

        System.out.print("Ahora, introduzca un segundo número: ");
        b = sc.nextInt(); // el segundo numero

        System.out.print("Introduzca el tercer número: ");
        c = sc.nextInt(); // el tercer numero

        System.out.print("Por último, introduzca un cuarto número: ");
        d = sc.nextInt(); //y se introduce el cuarto numero

        // Ordenar usando solo if y la variable temporal
        if (a > b) { temp = a; a = b; b = temp; }
        if (a > c) { temp = a; a = c; c = temp; }
        if (a > d) { temp = a; a = d; d = temp; }
        if (b > c) { temp = b; b = c; c = temp; }
        if (b > d) { temp = b; b = d; d = temp; }
        if (c > d) { temp = c; c = d; d = temp; }

        System.out.println("El orden de los números introducidos es el " + a + " - " + b + " - " + c + " - " + d);
        sc.close();
    }
}