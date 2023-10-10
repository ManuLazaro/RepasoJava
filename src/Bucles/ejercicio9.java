/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Scanner;

/**
 * 9. Realiza un programa que nos diga cuantos di­gitos tiene un numero introducido por teclado.
 * @author manul
 */
public class ejercicio9 {
    public static void main(String[] args) {
        
        int numeroDigitos = 1;
        Scanner entrada = new Scanner(System.in);
        int numeroIntroducido = entrada.nextInt();

         while  (numeroIntroducido >10){
           numeroIntroducido/=10; // numero introducido dividido entre 10
           numeroDigitos++; // cada pasada por while sumas 1 digito
         }
         System.out.println( " tiene " + numeroDigitos + " di­gitos.");
    }
}
