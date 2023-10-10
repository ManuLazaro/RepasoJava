/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pooherencia3.src.pooherencia3;

/**
 *
 * @author DAM
 */
//SUBCLASE GATO

  /**
   *
   */
   public class Gato extends Animal {

    public Gato(String tipo, int numPatas, String clima) {
      super(tipo,numPatas,clima);
    }
    public Gato() {
      super();
    }
    @Override
    public void anda(int km) {
       System.out.println("Andando  ");
       this.kmAndados += km;
     }
     
     public void dejaDeAndar(){
       System.out.println("Zzzzzzzzz");
     }
     public void Maulla(){
       System.out.println("Miau");
     }
      @Override
     public void come(String comida){
       System.out.println("Espero que sea pescado");
     }
   }