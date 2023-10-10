/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pooherencia3.src.pooherencia3;

/**
 *
 * @author DAM
 */
  //SUBCLASE AVE
   public class Ave extends Animal {
      int kmVolados=0;

    public Ave(String tipo, int numPatas, String clima) {
      super(tipo,numPatas,clima);
    }
    public Ave(){
      super();
    }
    
     public void vuela(int km) {
       System.out.println("Volando  -V- _V_  -V-   _V_");
       this.kmVolados += km;
     }
     public int getKmVolados() {
       return kmVolados;
     }
     public void dejaDeVolar(){
       System.out.println("Zzzzzzzzz");
     }
     
   }

