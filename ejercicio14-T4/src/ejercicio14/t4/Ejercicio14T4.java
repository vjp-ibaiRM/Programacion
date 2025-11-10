/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14.t4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = pedirDato();//pedimos el numero en el metodo
        calculoResultado(numero);//mostramos el resultado y el conteo
    }
    public static int pedirDato(){//metodo para pedir el dato
        Scanner scanner = new Scanner(System.in);
        int num;
        do{
            System.out.println("Introduzca un numero: ");//pedimos que introduzca el numero
            num = scanner.nextInt();
            if (!mayorQueCero(num)){
                System.out.println("Error: el número debe ser mayor que 0.");//avisamos del error
            }
        } while (!mayorQueCero(num));
        return num;//devolvemos el numero
    }
    public static boolean mayorQueCero(int a){//metodo para ver si el numero es mayor de 0
        return a > 0;
    }
    public static void calculoResultado(int numero){//metodo para calcular y mostrar el resultado
        int contador = 0;
        System.out.println(" Multiplos de 3 entre 1 y " + numero + ":");//mostramos el numero de multiplos
        for (int i = 1; i <= numero; i++){
            if (i % 3 == 0){
                System.out.println(i + " ");
                contador++;
            }
        }
        System.out.println("Total de multiplos de 3 mostrados: " + contador);//mostramos el total de multiplos
    }
}
