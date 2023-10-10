/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *  4. Define tres arrays de 20 numeros enteros cada una, con nombres
 *    numeros, cuadrado y cubo. Carga el array numero con valores
 *    aleatorios entre 0 y 100. En el array cuadradoâ se deben almacenar
 *    los cuadrados de los valores que hay en el array numero. En el
 *    array cubo se deben almacenar los cubos de los valores que hay
 *    en numeroâ. A continuaciÃ³n, muestra el contenido de los tres arrays
 *    dispuesto en tres columnas.
 * @author manul
 */
public class ejercicio4 {
    public static void main(String[] args) {
    int n1[] = new int[20];
    int cuadrado[] = new int[20];
    int cubo[] = new int[20];
        for (int i = 0; i < n1.length; i++) {
            n1[i] = (int)(Math.random()*100+1);
            cuadrado[i] = n1[i]* n1[i];
            cubo[i] = n1[i]* n1[i]* n1[i];
        }
        System.out.println("\nA continuacion se muestran en tres columnas, un numero aleatorio entre 0 y 100, su cuadrado y su cubo:\n");
        for (int i = 0; i < 20; i++) {
            System.out.printf("%4d‚ %5d ‚%8d\n", n1[i], cuadrado[i], cubo[i]);
        }
    
        
  }
}
