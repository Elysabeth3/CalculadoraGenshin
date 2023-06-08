package atributos;

import java.util.ArrayList;

public class Def extends Atributo {

    private static final ArrayList<Double> valoresPosibles;
    static {
        valoresPosibles = new ArrayList<>();
        valoresPosibles.add(16.0);
        valoresPosibles.add(19.0);
        valoresPosibles.add(21.0);
        valoresPosibles.add(23.0);
    }

    public Def() {
    }

    public Def(double valor) {
        super(valor,1,valoresPosibles);
    }

    public static boolean contieneValorDef(double valor) {
        return valoresPosibles.contains(valor);
    }

    public static int devolverPosicionDef(double valor) {
        return valoresPosibles.indexOf(valor);
    }
 
}
