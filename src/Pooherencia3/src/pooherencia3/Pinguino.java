/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pooherencia3.src.pooherencia3;

/**
 *
 * @author DAM
 */
//SUBCLASE Pinguino
   public class Pinguino extends Animal {
      int kmNadados=0;

    public Pinguino(String tipo, int numPatas, String clima) {
      super(tipo,numPatas,clima);
    }
     public Pinguino() {
      super();
    }
     
    public void nada(int km) {
       System.out.println("Nadando ");
       this.kmNadados += km;
     }
     public int getKmNadados() {
       return kmNadados;
     }
     public void vuela(){
       System.out.println("No puedo volar");
     }
     public void habla(){
       System.out.println("-----------");
     }

   }