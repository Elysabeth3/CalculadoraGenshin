package artefactos;

import atributos.*;
import java.util.ArrayList;

public class Artefacto {

    private final ArrayList<Atributo> atributos;

    public Artefacto() {
        atributos = new ArrayList<>();
    }

    public void setAtributo(Atributo atributo) {
        atributos.add(atributo);
    }

    private String CuartoSubStat() {
        int porcentajeEvolucion = 55, atributoEvolucion;

        Atributo get = atributos.get(2);
        atributoEvolucion = get.getPrioridad() + 1;
        while (!comprobarEvolucion(atributoEvolucion)) {
            atributoEvolucion++;
        }
        if (get.devolverPosicion(get.getValor()) == 3) {
            porcentajeEvolucion += (int) (Math.random() * (20 - 15 + 1)) + 15;
        }
        String atributo = atributoEvolucion(atributoEvolucion);
        String cadena = "Con un porcentaje del: " + porcentajeEvolucion + "% El atributo que saldra es: " + atributo;
        return cadena;
    }

    public String SubirNivel() {
        if (atributos.size() == 3) {
            return CuartoSubStat();
        }
        return "Loco";
    }

    private String atributoEvolucion(int atributo) {
        switch (atributo) {
            case 1 -> {
                return "Defensa";
            }
            case 2 -> {
                return "Defensa Porcentual";
            }
            case 3 -> {
                return "Vida";
            }
            case 4 -> {
                return "Vida Porcentual";
            }
            case 5 -> {
                return "Ataque";
            }
            case 6 -> {
                return "Ataque Porcentual";
            }
            case 7 -> {
                return "Recarga de Energia";
            }
            case 8 -> {
                return "Maestria Elemental";
            }
            case 9 -> {
                return "Probabilidad Critica";
            }
            case 10 -> {
                return "Daño Critico";
            }
        }
        return null;
    }

    private boolean comprobarEvolucion(int atributo) {
        for (int i = 0; i < atributos.size(); i++) {
            Atributo get = atributos.get(i);
            if (get.getPrioridad() == atributo) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String cadena = "-- Este atributo tiene las siguientes estadisticas --";
        for (int i = 0; i < atributos.size(); i++) {
            Atributo get = atributos.get(i);
            cadena += get.toString();
        }
        return cadena;
    }

}
