/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Control.src.ControlEjerc2;

/**
 *
 * @author DAM
 */
public class ClaseMain {
public static void main(String[] args) {
Pizza p1 = new Pizza("margarita", "mediana");
Pizza p2 = new Pizza("funghi", "familiar");
p2.sirve();
Pizza p3 = new Pizza("cuatro quesos", "mediana");
System.out.println(p1.toString());
System.out.println(p2.toString());
System.out.println(p3.toString());
p2.sirve();
System.out.println("pedidas: " + Pizza.getTotalPedidas());
System.out.println("servidas: " + Pizza.getTotalServidas());
}
}

