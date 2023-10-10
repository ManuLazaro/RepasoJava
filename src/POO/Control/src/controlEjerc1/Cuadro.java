/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO.Control.src.controlEjerc1;

/**
 *
 * @author DAM
 */
public class Cuadro {

  /**
   * @param args the command line arguments
   */
 int altura;
 int anchura;
 int alturaPintada;

  public Cuadro(){
  
}
  public Cuadro(int altura, int anchura){
    this.altura=altura;
    this.anchura=anchura;
  }
  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public int getAnchura() {
    return anchura;
  }

  public void setAnchura(int anchura) {
    this.anchura = anchura;
  }

  public int getAlturaPintada() {
    return alturaPintada;
  }

  public void setAlturaPintada(int alturaPintada) {
    this.alturaPintada = alturaPintada;
  }
 
  public void dibujar(){
     System.out.println("-----------");
    if (alturaPintada == 3) {
      for (int i = 0; i < 2; i++) {
      System.out.println("|   |\n ");
    }
     for (int i = 0; i < 3; i++) {
      System.out.println("|####|\n");
    }
    System.out.println("-----------");
  }
    else{
      for (int i = 0; i < altura; i++) {
      System.out.println("|   |\n ");
    }
    }
  }
  public void pintar(int alturaPintada){
     System.out.println("-----------");
    for (int i = 0; i < alturaPintada; i++) {
      System.out.println("|####|\n ");
    }
    System.out.println("-----------");
  }
  public void bloquear(){
    alturaPintada = 0;
  }
  
}
