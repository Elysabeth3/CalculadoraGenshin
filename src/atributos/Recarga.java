package atributos;

import java.util.ArrayList;

public class Recarga extends Atributo {
    private static final ArrayList<Double> valoresPosibles;
    static {
        valoresPosibles = new ArrayList<>();
        valoresPosibles.add(4.5);
        valoresPosibles.add(5.2);
        valoresPosibles.add(5.8);
        valoresPosibles.add(6.5);
    }

    public Recarga() {
    }
    
    public Recarga(double valor){
        super(valor,7,valoresPosibles);
    }
    
   public static boolean contieneValorRe(double valor){
       return valoresPosibles.contains(valor);
   }
   
   public  static int devolverPosicionRe(double valor){
       return valoresPosibles.indexOf(valor);
   } 
}
