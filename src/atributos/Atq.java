package atributos;

import java.util.ArrayList;

public class Atq extends Atributo {
     private static final ArrayList<Double> valoresPosibles;
    static {
        valoresPosibles = new ArrayList<>();
        valoresPosibles.add(14.0);
        valoresPosibles.add(16.0);
        valoresPosibles.add(18.0);
        valoresPosibles.add(19.0);
    }

    public Atq() {
    }
    
    public Atq(double valor){
        super(valor,5,valoresPosibles);
    }
    
   public static boolean contieneValorAtq(double valor){
       return valoresPosibles.contains(valor);
   }
   
   public  static int devolverPosicionAtq(double valor){
       return valoresPosibles.indexOf(valor);
   } 
}
