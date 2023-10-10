/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Scanner;

/**
 *  13. Escribe un programa que lea una lista de diez numeros y determine
 *     cuantos son positivos, y cuÃ¡ntos son negativos.
 * @author manul
 */
public class ejercicio13 {
    public static void main(String[] args) {
        System.out.println("introduce 10 numeros positivos y negativos:");
        int negativos = 0;
        int positivos = 0;
        Scanner entrada = new Scanner(System.in);
        
        while (negativos + positivos < 10)   { 
            int numero = entrada.nextInt();
            if (numero >= 0) {
                positivos++;
            }else {
                negativos++;
            }
            
        }
        System.out.println("numeros negativos: " + negativos +" y cantidad de numeros positivos: "+ positivos);
    }
}
