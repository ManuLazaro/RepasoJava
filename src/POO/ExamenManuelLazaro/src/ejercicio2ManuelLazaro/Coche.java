/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.ExamenManuelLazaro.src.ejercicio2ManuelLazaro;

/**
 *
 * @author DAM
 */
public class Coche extends Terrestres{
  
  String aireAcondicionado;
  
  public Coche (String matricula, String modelo, int numeroRuedas, String aireAcondicionado ){
    super (matricula, modelo, numeroRuedas);
    this.aireAcondicionado = aireAcondicionado;
  }
  
  
  @Override
  public void Pitar (){
    System.out.println("Pic Pic");
  }
  
  public String Imprimir(){
    return "El coche con matricula "+getMatricula()+" modelo "+getModelo()+ " tiene "+ getNumeroRuedas()+" ruedas y "+aireAcondicionado +" tiene aire acondicionado." ;
  }
}
