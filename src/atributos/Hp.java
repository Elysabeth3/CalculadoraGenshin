package atributos;

import java.util.ArrayList;

public class Hp extends Atributo {
    private static final ArrayList<Double> valoresPosibles;
    static {
        valoresPosibles = new ArrayList<>();
        valoresPosibles.add(209.0);
        valoresPosibles.add(239.0);
        valoresPosibles.add(269.0);
        valoresPosibles.add(299.0);
    }

    public Hp() {
    }
    
    public Hp(double valor){
        super(valor,3,valoresPosibles);
    }
    
   public static boolean contieneValorHp(double valor){
       return valoresPosibles.contains(valor);
   }
   
   public  static int devolverPosicionHp(double valor){
       return valoresPosibles.indexOf(valor);
   }
}
