/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17.t4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio17T4 {
    /**
     * @param args the command line arguments
     */
    public static char generarLetraAleatoria() {
        int codigo = (int) (Math.random() * 26) + 97; // 97 = 'a'
        return (char) codigo;// metodo que genera una letra aleatoria entre la a y la zeta
    }
    public static void jugar() {
        Scanner entrada = new Scanner(System.in);
        char letraSecreta = generarLetraAleatoria();
        char intento;
        int intentos = 0;
        boolean acertado = false;// metodo que engloba el juego

        System.out.println("Adivina la letra (entre la a y la zeta):");
        do {
            System.out.print("Introduce una letra: ");//recogemos la letra introduicida
            intento = entrada.nextLine().charAt(0);
            intentos++;
            if (intento == letraSecreta) {
                acertado = true;
                System.out.println("¡Muy bien! La letra era '" + letraSecreta + "'.");//si se adivina la letra
                System.out.println("Has necesitado " + intentos + " intentos.");//y se muestran los intentos necesarios
            } else if (intento < letraSecreta) {
                System.out.println("La letra esta despues en el alfabeto.");
            } else {
                System.out.println("La letra esta antes en el alfabeto.");
            }//las dos pistas para ver si estás más o menos cerca

        } while (!acertado);

        entrada.close();
    }
    public static void main(String[] args) {
        jugar();// metodo main
    }
}