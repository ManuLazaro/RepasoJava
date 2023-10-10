/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *  3. Escribe un programa que lea 10 nÃºmeros por teclado y que luego
 *    los muestre en orden inverso, es decir, el primero que se
 *    introduce es el Ãºltimo en mostrarse y viceversa.
 * @author manul
 */
public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Introduce 10 numeros: ");
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();
        }     
        System.out.println("\nLos numeros introducidos al reves son estos: ");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        
    }
}
