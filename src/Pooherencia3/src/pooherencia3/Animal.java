/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pooherencia3.src.pooherencia3;

/**
 *
 * @author DAM
 */
public class Animal {
  String tipo;
  int numPatas;
  String clima;
  int kmAndados=0;
 

  //ATRIBUTOS DE ANIMAL
  public Animal (){
    ;
   
}
public Animal (String tipo, int numPatas, String clima){
    this.tipo=tipo;
    this.numPatas=numPatas;
    this.clima=clima;
   
}

//get and set
  public String getTipo() {
    return tipo;
  }

  public int getKmAndados() {
    return kmAndados;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public int getNumPatas() {
    return numPatas;
  }

  public void setNumPatas(int numPatas) {
    this.numPatas = numPatas;
  }

  public String getClima() {
    return clima;
  }

  public void setClima(String clima) {
    this.clima = clima;
  }
  public void comer (){
    System.out.println("Ñam Ñam Ñam ");
  }
  public void come(String comida){
    System.out.println("Que rico comer "+comida);
  }
  public void duerme() {
    System.out.println("Zzzzzzzz");
  }

  public void bebe() {
    System.out.println("Glup Glup Glup");
  }
  public void anda(int km) {
       System.out.println("Andando  ");
       this.kmAndados += km;
     }
   
    
}


