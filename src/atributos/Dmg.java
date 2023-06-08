/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atributos;

import java.util.ArrayList;

/**
 *
 * @author Eli
 */
public class Dmg extends Atributo {
     private static final ArrayList<Double> valoresPosibles;
    static {
        valoresPosibles = new ArrayList<>();
        valoresPosibles.add(5.4);
        valoresPosibles.add(6.2);
        valoresPosibles.add(7.0);
        valoresPosibles.add(7.8);
    }

    public Dmg() {
    }
    
    public Dmg(double valor){
        super(valor,10,valoresPosibles);
    }
    
   public static boolean contieneValorDmg(double valor){
       return valoresPosibles.contains(valor);
   }
   
   public  static int devolverPosicionDmg(double valor){
       return valoresPosibles.indexOf(valor);
   } 
}
