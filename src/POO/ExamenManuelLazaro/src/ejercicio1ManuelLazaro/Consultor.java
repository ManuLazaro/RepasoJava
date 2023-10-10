/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.ExamenManuelLazaro.src.ejercicio1ManuelLazaro;

/**
 *
 * @author DAM
 */
public class Consultor {
  //atributos
  String nombre;
  
//constructor
  public Consultor(){
    
  }
  
  // el valor de la casa mas 10% de este valor
  public void totalCantidad(int valorCasa){
    int totalCantidad = valorCasa + ((valorCasa * 10)/100);
    System.out.println("La cantidad total necesaria para la casa seran: "+ totalCantidad);
  }
  //80% del valor de la casa
  public void maxHipotecable(int valorCasa){
    int maxHipotecable = ((valorCasa *80) /100);
    System.out.println("Limite hipotecable de los bancos: "+ maxHipotecable);
  }
  
  //cantidadAhorro superior a totalcantidad - maxhipotecable
  public boolean esPosible (int valorCasa, int cantidadAhorro){
    int totalCantidad = valorCasa + ((valorCasa * 10)/100);
     int maxHipotecable = ((valorCasa *80) /100);
     
    if (cantidadAhorro > (totalCantidad - maxHipotecable)) {
      System.out.println("Puede pedir el prestamo");
      return true;
    }
    else{
      System.out.println("Prestamo denegado");
      return false;
    }
  }
  public void maxPosible(int edad, int sueldoMensual){
    int aniosTrabajados = 60 - edad;
    int totalSueldo = sueldoMensual * 12 * aniosTrabajados;
    int maxPosible = (totalSueldo *33) /100;
    System.out.println("Cantidad maxima que puede pedir: "+ maxPosible);
  }
  
  // maxPosible tiene que ser mayor que el prestamoNecesario
  public boolean esIdoneo (int sueldoMensual, int edad, double prestamoNecesario){
    int aniosTrabajados = 60 -edad ;
    int totalSueldo = sueldoMensual * 12 * aniosTrabajados;
    int maxPosible = (totalSueldo *33) /100;
    if (maxPosible > prestamoNecesario){
      System.out.println("Si puede hacer frente al prestamo ");
      return true;
    }
    else{
      System.out.println("No puede hacer frente al prestamo ");
      return false;
    }
  } 
  
  
}
