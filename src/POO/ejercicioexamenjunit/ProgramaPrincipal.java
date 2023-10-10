/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO.ejercicioexamenjunit;


public class ProgramaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematicas calc1 = new Matematicas(11);//ejemplo
        System.out.println(calc1.capicua()); //ejemplo
        System.out.println(calc1.multiplicar(3));
        System.out.println(calc1.factorial());
    }
    
}
