/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO.Control.src.controlEjerc1;

/**
 *
 * @author DAM
 */
public class Control {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Cuadro c = new Cuadro(5, 4);
    System.out.println("Creamos cuadro de alto 5 y ancho 4 y dibujamos.");
    c.dibujar();
    c.setAlturaPintada(3);
    System.out.println("Pintamos 3 líneas y dibujamos.");
    c.dibujar();
}
  
}
