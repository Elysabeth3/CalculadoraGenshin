package artefactos;

import atributos.*;
import java.util.ArrayList;

public class Artefacto {

    private final ArrayList<Atributo> atributos;
    private int nivel;
    
    public Artefacto() {
        atributos = new ArrayList<>();
        nivel = 0;
    }

    public void setAtributo(Atributo atributo) {
        atributos.add(atributo);
    }

    public int getNivel() {
        return nivel;
    }
    
    public void modificarAtributo(int posicion, double valor){
        Atributo aMod = atributos.get(posicion);
        aMod.setValorAnt(aMod.getValor());
        aMod.setValor(valor - aMod.getValor());
    }

    private String CuartoSubStat() {
        nivel = 4;
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
    
    private String subirNivel4(){
        nivel = 4;
        int porcentaje1 = 10, porcentaje2 = 40, porcentaje3 = 25, porcentaje4 = 25;
        Atributo a1 = atributos.get(0);
        Atributo a2 = atributos.get(1);
        Atributo a3 = atributos.get(2);
        Atributo a4 = atributos.get(3);
        int posicion = a1.devolverPosicion(a1.getValor());
        if (posicion >= 2) {
            porcentaje1 = (posicion == 3)? 10+(int) (Math.random()+(30-25+1)) +25 : 10+15;
        }
        posicion = a2.devolverPosicion(a2.getValor());
        if (posicion >= 2) {
            porcentaje2 = (posicion == 3)? 40+(int) (Math.random()+(30-25+1)) +25 : 40+15;
        }
        posicion = a3.devolverPosicion(a3.getValor());
        if (posicion >= 2) {
            porcentaje3 = (posicion == 3)? 25+(int) (Math.random()+(30-25+1)) +25 : 25+15;
        }
        posicion = a4.devolverPosicion(a4.getValor());
        if (posicion >= 2) {
            porcentaje4 = (posicion == 3)? 25+(int) (Math.random()+(30-25+1)) +25 : 25+15;
        }
        String cadena = "";
        cadena += "El atributo: " + atributoEvolucion(a1.getPrioridad()) + " tiene una posibilidad del " + porcentaje1 + "%\n";
        cadena += "El atributo: " + atributoEvolucion(a2.getPrioridad()) + " tiene una posibilidad del " + porcentaje2 + "%\n";
        cadena += "El atributo: " + atributoEvolucion(a3.getPrioridad()) + " tiene una posibilidad del " + porcentaje3 + "%\n";
        cadena += "El atributo: " + atributoEvolucion(a4.getPrioridad()) + " tiene una posibilidad del " + porcentaje4 + "%";
        return cadena;
    }
    
    private String subidaNivel(int porcentaje1,int porcentaje2,int porcentaje3,int porcentaje4) {
        nivel = nivel+4;
        int posicionAtributoImportante = evulucionoAntes();
        Atributo a1 = atributos.get(0);
        Atributo a2 = atributos.get(1);
        Atributo a3 = atributos.get(2);
        Atributo a4 = atributos.get(3);
        if (posicionAtributoImportante == 0) {
        int posicion = a1.devolverPosicion(a1.getValor());
        if (posicion >= 2) {
            porcentaje1 = (posicion == 3)? porcentaje1+(int) (Math.random()+(30-25+1)) +25 : porcentaje1+15;
        }
        a1.setValorAnt(0);
        }
        if (posicionAtributoImportante == 1) {
        int posicion = a2.devolverPosicion(a2.getValor());
            if (posicion >= 2) {
            porcentaje2 = (posicion == 3)? porcentaje2+(int) (Math.random()+(30-25+1)) +25 : porcentaje2+15;
           }
           a2.setValorAnt(0);
        }
        if (posicionAtributoImportante == 2) {
        int posicion = a3.devolverPosicion(a3.getValor());
            if (posicion >= 2) {
            porcentaje3 = (posicion == 3)? porcentaje3+(int) (Math.random()+(30-25+1)) +25 : porcentaje3+15;
            }
            a3.setValorAnt(0);
        }
        if (posicionAtributoImportante == 3) {
        int posicion = a4.devolverPosicion(a4.getValor());
            if (posicion >= 2) {
            porcentaje4 = (posicion == 3)? porcentaje4+(int) (Math.random()+(30-25+1)) +25 : porcentaje4+15;
            }
            a4.setValorAnt(0);
        }
        
        String cadena = "";
        cadena += "El atributo: " + atributoEvolucion(a1.getPrioridad()) + " tiene una posibilidad del " + porcentaje1 + "%\n";
        cadena += "El atributo: " + atributoEvolucion(a2.getPrioridad()) + " tiene una posibilidad del " + porcentaje2 + "%\n";
        cadena += "El atributo: " + atributoEvolucion(a3.getPrioridad()) + " tiene una posibilidad del " + porcentaje3 + "%\n";
        cadena += "El atributo: " + atributoEvolucion(a4.getPrioridad()) + " tiene una posibilidad del " + porcentaje4 + "%";
        return cadena; 
    }

    public String SubirNivel() {
        if (atributos.size() == 3) {
            return CuartoSubStat();
        }
        if (nivel == 0) {
            return subirNivel4();
        }
        if (nivel == 4){
           return subidaNivel(15, 35, 35, 15);
        }
        if (nivel == 8){
            return subidaNivel(40, 20, 20, 20);
        }
        if (nivel == 12){
            return subidaNivel(20, 20, 20, 40);
        }
        if(nivel == 16){
            return subidaNivel(70, 10, 10, 10);
        }
        return "El artefacto ya esta al maximo";
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
    
    private int evulucionoAntes(){
        for (int i = 0; i < atributos.size(); i++) {
            Atributo get = atributos.get(i);
            if (get.getValorAnt() != 0) {
                return i;
            }
        }
        return -1;
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
