package atributos;

import java.util.ArrayList;

/**
 *
 * @author Eli
 */
public class Prob extends Atributo {
     private static final ArrayList<Double> valoresPosibles;
    static {
        valoresPosibles = new ArrayList<>();
        valoresPosibles.add(2.7);
        valoresPosibles.add(3.1);
        valoresPosibles.add(3.5);
        valoresPosibles.add(3.9);
    }

    public Prob() {
    }
    
    public Prob(double valor){
        super(valor,9,valoresPosibles);
    }
    
   public static boolean contieneValorProb(double valor){
       return valoresPosibles.contains(valor);
   }
   
   public  static int devolverPosicionProb(double valor){
       return valoresPosibles.indexOf(valor);
   } 
}
