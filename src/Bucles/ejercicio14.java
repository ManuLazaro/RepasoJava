/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Scanner;

/**
 *  14. Escribe un programa que pida una base y un exponente (entero positivo)
 *     y que calcule la potencia.
 * @author manul
 */
public class ejercicio14 {
    public static void main(String[] args) {
        int base;
        int exponente;
        double potencia = 1;
        Scanner entrada = new Scanner(System.in);
        base = entrada.nextInt();
        exponente = entrada.nextInt();
        
         if (exponente == 0) {
             potencia = 1;
        }
    
         if (exponente > 0) {
             for (int i = 0; i < exponente; i++) {
                 // potencia que es "1" se multiplica por la base cada vez que pasa
                 //por lo tanto se multiplica tantas veces como el exponente indique
             potencia = potencia * base; 
            } 
        }
    
        if (exponente < 0) {
             for (int i = 0; i < -exponente; i++) {
             potencia *= base;
            }
             potencia = 1/potencia;
        }

    System.out.println(base + "^" + exponente + " = " + potencia);
    }
}
