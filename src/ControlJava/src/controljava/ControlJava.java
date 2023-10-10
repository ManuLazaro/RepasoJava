/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ControlJava.src.controljava;

import java.util.Scanner;

/**
 *
 * @author vcpns
 */
public class ControlJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crear un programa con un menú
        para pedir al usuario qué quiere hacer de las siguientes 4 opciones y luego
        realizar cada opción.
        1. Pida el nombre al usuario y le diga “Hola Señor: “.
        2. Se pide al usuario un número del 1 al 7 y dice si es lunes, martes, miércoles, jueves,
        viernes, sábado no domingo
        3. Pedir al usuario un número y sacar por pantalla desde ese número hasta 0 de 1 en 1.
        4. Salir
        Al terminar cada opción volver al menú y cuando se pida salir se despedirá de usuario con su nombre.*/
        int opc = 0;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Hola Introduce tu Nombre: ");
        String Nombre = entrada.nextLine();
        do {
            System.out.println("*****MENU OPCIONES*****\nSeleccione una Opcion\n1.- Mostrar Saludo\n2.- Mostrar el el dia que corresponde al numero introducido\n3.- Serie desde Un numero introducido hasta 0\n4.- Piedra, papel, tijera \n5.-Salir\n***********************");
            opc=entrada.nextInt();
            //opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Hola Señor: \"" + Nombre+"\"");                           
                    break;
                case 2:
                    System.out.println("Introduzca un numero de [1-7]");
                    int dia = entrada.nextInt(); //OBTIENE EL VALOR DIA INTRODUCIDO
                    switch (dia) {
                        case 1:
                            System.out.println("ha introducido el valor de LUNES");

                            break;
                        case 2:
                            System.out.println("ha introducido el valor de MARTES");
                            break;
                        case 3:
                            System.out.println("ha introducido el valor de MIERCOLES");
                            break;
                        case 4:
                            System.out.println("ha introducido el valor de JUEVES");
                            break;
                        case 5:
                            System.out.println("ha introducido el valor de VIERNES");
                            break;
                        case 6:
                            System.out.println("ha introducido el valor de SABADO");
                            break;
                        case 7:
                            System.out.println("ha introducido el valor de DOMINGO");
                            break;
                        default:
                            System.out.println("Valor Invalido");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Introduzca un numero: ");
                    int numeroserie = entrada.nextInt();
                    //MUESTRA LA SERIE DE UN NUMERO HASTA 0
                    for(int i=numeroserie;i>=0;i--){
                        System.out.println(i);
                    }
                    break;
                case 4:
                    String eleccion = "";
                    String eleccOrde;
                    int ordenador;
                    Scanner sc = new Scanner(System.in);
                    //petición de datos
                    do{
                    System.out.println("Introduce piedra, papel o tijera");
                    eleccion = sc.next().toLowerCase();
                    } while (!eleccion.equals("piedra") && !eleccion.equals("papel") && !eleccion.equals("tijera"));

                    System.out.println("Has elegido "+eleccion);

                    ordenador = (int)(Math.random()*3);
                    switch (ordenador){
                        case 0: 
                            eleccOrde = "piedra";
                            if (eleccion.equals("piedra")) {
                                System.out.println("El ordenador ha sacado " + eleccOrde + " ¡Hay Empate!");
                            } else if (eleccion.equals("papel")) {
                                System.out.println("El ordenador ha sacado " + eleccOrde + " ¡Has ganado!\"");
                            } else {
                                System.out.println("El ordenador ha sacado " + eleccOrde + " ¡Has perdido!\"");
                            }
                            break;
                        case 1: eleccOrde = "papel";
                              if (eleccion.equals("papel")) {
                                System.out.println("El ordenador ha sacado " + eleccOrde + " ¡Hay Empate!");
                            } else if (eleccion.equals("tijera")) {
                                System.out.println("El ordenador ha sacado " + eleccOrde + " ¡Has ganado!\"");
                            } else {
                                System.out.println("El ordenador ha sacado " + eleccOrde + " ¡Has perdido!\"");
                            }
                            break;
                        case 2: eleccOrde = "tijera";
                             if (eleccion.equals("tijera")) {
                                System.out.println("El ordenador ha sacado " + eleccOrde + " ¡Hay Empate!");
                            } else if (eleccion.equals("piedra")) {
                                System.out.println("El ordenador ha sacado " + eleccOrde + " ¡Has ganado!\"");
                            } else {
                                System.out.println("El ordenador ha sacado " + eleccOrde + " ¡Has perdido!\"");
                            }
                            break;
                        default :
                            break;
                    }
                case 5:
                    break;
            }

        } while (opc != 5);
        System.out.println("HASTA PRONTO: ");
    }
    
}
