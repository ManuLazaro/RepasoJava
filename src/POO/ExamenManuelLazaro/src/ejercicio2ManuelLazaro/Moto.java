/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.ExamenManuelLazaro.src.ejercicio2ManuelLazaro;

/**
 *
 * @author DAM
 */
public class Moto extends Terrestres {
  
  String color;
  
  public Moto (String matricula, String modelo, int numeroRuedas, String color ){
    super (matricula, modelo, numeroRuedas);
    this.color = color;
  }
  
  @Override
  public void Pitar (){
    System.out.println("Mic Mic");
  }
  
  public String Imprimir(){
    return "La moto con matricula "+getMatricula()+" modelo "+getModelo()+ " tiene "+ getNumeroRuedas()+" ruedas y es de color "+color ;
  }
  
  
}
