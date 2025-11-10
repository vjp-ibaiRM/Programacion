/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7.t4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio7T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el primer numero: ");//pedimos los números al usuario mientras creamos las variables
        int num1 = scanner.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Introduzca el tercer numero: ");
        int num3 = scanner.nextInt();
        System.out.println("Introduzca el cuarto numero: ");
        int num4 = scanner.nextInt();
        
        ordenar(num1, num2, num3, num4);//lamamos al método
    }
    public static void ordenar(int num1, int num2, int num3, int num4){
        int temp;//creamos la variable temporar, el vaso vacío
        for(int i=0; i<3; i++){
            if (num2<num1) {temp=num1; num1=num2; num2=temp;}
            if (num3<num2) {temp=num2; num2=num3; num3=temp;}
            if (num4<num3) {temp=num3; num3=num4; num4=temp;}
        }
        System.out.println("El orden de los numeros introducidos es el " + num1 + " - " + num2 + " - " + num3 + " - " + num4);
    }
}