package atributos;

import java.util.ArrayList;

public abstract class Atributo {
    private final ArrayList<Double> valoresPosibles;
    private double valor;
    private int prioridad;

    public Atributo() {
        this.valoresPosibles = null;
    }

    public Atributo(double valor, int prioridad, ArrayList<Double> valoresPosibles) {
        this.valor = valor;
        this.prioridad = prioridad;
        this.valoresPosibles = valoresPosibles;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public double getValor() {
        return valor;
    }
    
    public boolean contieneValor(double valor) {
        return valoresPosibles.contains(valor);
    }

    public int devolverPosicion(double valor) {
        return valoresPosibles.indexOf(valor);
    }

    @Override
    public String toString() {
        String cadena = "El atributo " + getClass().getSimpleName() + " tiene el valor: " + valor;
        return cadena;
    }
    
    
}
