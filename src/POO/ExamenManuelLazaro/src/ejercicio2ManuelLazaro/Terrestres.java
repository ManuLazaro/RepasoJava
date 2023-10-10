/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.ExamenManuelLazaro.src.ejercicio2ManuelLazaro;

/**
 *
 * @author DAM
 */
public class Terrestres extends Vehiculos{
   
  private int numeroRuedas;
  
  public Terrestres (String matricula, String modelo, int numeroRuedas ){
    super (matricula, modelo);
    this.numeroRuedas = numeroRuedas;
  }
  
  public void Pitar (){
    System.out.println("Meeeeeeeeeeeekkk");
  }

  public int getNumeroRuedas() {
    return numeroRuedas;
  }

  public void setNumeroRuedas(int numeroRuedas) {
    this.numeroRuedas = numeroRuedas;
  }
 
  
}
