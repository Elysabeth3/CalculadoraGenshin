package atributos;

import java.util.ArrayList;

/**
 *
 * @author Eli
 */
public class DefPorcentual extends Atributo {
    private static final ArrayList<Double> valoresPosibles;
    static {
        valoresPosibles = new ArrayList<>();
        valoresPosibles.add(5.1);
        valoresPosibles.add(5.8);
        valoresPosibles.add(6.6);
        valoresPosibles.add(7.3);
    }

    public DefPorcentual() {
    }
    
    public DefPorcentual(double valor){
        super(valor,2,valoresPosibles);
    }
    
   public static boolean contieneValorDef(double valor){
       return valoresPosibles.contains(valor);
   }
      public  static int devolverPosicionDef(double valor){
       return valoresPosibles.indexOf(valor);
   }
}
