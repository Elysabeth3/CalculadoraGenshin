package atributos;

import java.util.ArrayList;

public class AtqPorcentual extends Atributo {
     private static final ArrayList<Double> valoresPosibles;
    static {
        valoresPosibles = new ArrayList<>();
        valoresPosibles.add(4.1);
        valoresPosibles.add(4.7);
        valoresPosibles.add(5.3);
        valoresPosibles.add(5.8);
    }

    public AtqPorcentual() {
    }
    
    public AtqPorcentual(double valor){
        super(valor,6,valoresPosibles);
    }
        
   public static boolean contieneValorAtq(double valor){
       return valoresPosibles.contains(valor);
   }
   
   public  static int devolverPosicionAtq(double valor){
       return valoresPosibles.indexOf(valor);
   } 
}