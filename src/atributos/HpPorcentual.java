package atributos;

import java.util.ArrayList;


public class HpPorcentual extends Atributo {
    private static final ArrayList<Double> valoresPosibles;
    static {
        valoresPosibles = new ArrayList<>();
        valoresPosibles.add(4.1);
        valoresPosibles.add(4.7);
        valoresPosibles.add(5.3);
        valoresPosibles.add(5.8);
    }

    public HpPorcentual() {
    }
    
    public HpPorcentual(double valor){
        super(valor,4,valoresPosibles);
    }
    
   public static boolean contieneValorHp(double valor){
       return valoresPosibles.contains(valor);
   }
   
   public  static int devolverPosicionHp(double valor){
       return valoresPosibles.indexOf(valor);
   } 
}
