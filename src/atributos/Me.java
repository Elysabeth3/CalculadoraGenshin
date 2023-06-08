
package atributos;

import java.util.ArrayList;


public class Me extends Atributo{
     private static final ArrayList<Double> valoresPosibles;
    static {
        valoresPosibles = new ArrayList<>();
        valoresPosibles.add(16.0);
        valoresPosibles.add(19.0);
        valoresPosibles.add(21.0);
        valoresPosibles.add(23.0);
    }

    public Me() {
    }
    
    public Me(double valor){
        super(valor,8,valoresPosibles);
    }
    
   public static boolean contieneValorMe(double valor){
       return valoresPosibles.contains(valor);
   }
   
   public  static int devolverPosicionMe(double valor){
       return valoresPosibles.indexOf(valor);
   } 
}
