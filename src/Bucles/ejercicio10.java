/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Scanner;

/**
 *  10. Escribe un programa que calcule la media de un conjunto de nÃºmeros
 *     positivos introducidos por teclado. A priori, el programa no sabe
 *     cuÃ¡ntos nÃºmeros se introducirÃ¡n. El usuario indicarÃ¡ que ha terminado
 *     de introducir los datos cuando meta un nÃºmero negativo.
 * @author manul
 */
public class ejercicio10 {
    
    public static void main(String[] args) {
        
        System.out.println("Este programa calcula la media de los numeros positivos introducidos.");
        System.out.println("Vaya introduciendo numeros (puede parar introduciendo un numero negativo):");
        
        
        double numeros = 0; //cantidad numeros introducidos
        double suma = 0; // sumatorio de los numeros introducidos
        double numerometido = 0; // numeros introducios por teclado
    
        while (numerometido >= 0){
            Scanner entrada = new Scanner(System.in);
            numerometido = entrada.nextDouble();
            numeros ++;
            suma += numerometido;
        }  
        
        System.out.println("La media de los numeros introducidos es: "+ (suma - numerometido)/ (numeros -1) );
    }
}
