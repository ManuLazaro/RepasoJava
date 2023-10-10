/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pooherencia3.src.pooherencia3;

/**
 *
 * @author DAM
 */
public class Pooherencia3 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Objetos creados con y sin parametros
    Perro perro1 = new Perro();
    Perro perro2 = new Perro("de caza", 4, "frio");
    Gato amarillo  = new Gato  ("de casa ", 4, "calor");
    Gato pequeño = new Gato ();
    Pinguino emperador = new Pinguino();
    Pinguino comun = new Pinguino("comun", 2, "frio");
    Ave aguila = new Ave ("volador", 2, "normal");
//metodos gatos
    pequeño.anda(10);
    amarillo.anda(16);
    System.out.println("Los kilometrs andados por amarilo han sido: "+amarillo.getKmAndados());
    amarillo.Maulla();
    pequeño.come("pescado");
//metodos Aves
    aguila.vuela(10);
    aguila.dejaDeVolar();
    System.out.println("El aguila ha volado"+aguila.getKmVolados());
 //metodos perro
    perro2.anda(10);
    perro1.duerme(7);
    System.out.println("El perro1 ha dormido "+perro1.getHorasDormidas()+"horas");
    System.out.println("El tipo de animal es un perro "+perro2.getTipo()+" el cual tiene "+perro2.getNumPatas()+" patas y le gusta el clima "+perro2.getClima());
  }
  
}
