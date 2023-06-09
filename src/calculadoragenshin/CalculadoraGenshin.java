package calculadoragenshin;
import atributos.*;
import artefactos.*;

public class CalculadoraGenshin {

    private static Artefacto a1;
    
    public static boolean comprobarTipo(String tipo){
        return (!"DEF".equalsIgnoreCase(tipo) && !"DEF%".equalsIgnoreCase(tipo)
                && !"HP".equalsIgnoreCase(tipo) && !"HP%".equalsIgnoreCase(tipo)
                && !"ATQ".equalsIgnoreCase(tipo) && !"ATQ%".equalsIgnoreCase(tipo)
                && !"RECARGA".equalsIgnoreCase(tipo) && !"ME".equalsIgnoreCase(tipo)
                && !"PROB".equalsIgnoreCase(tipo) && !"DMG".equalsIgnoreCase(tipo)
                );
    }
    
    public static Atributo asignarValor(String tipo, double valor){
        tipo = tipo.toUpperCase();
        switch (tipo) {
            case "DEF" -> {
                if (Def.contieneValorDef(valor)) {
                    return new Def(valor);
                }
                return null;
            }
            case "DEF%" -> {
                if (DefPorcentual.contieneValorDef(valor)) {
                    return new DefPorcentual(valor);
                }
                return null;
            }
            case "HP" -> {
                if (Hp.contieneValorHp(valor)) {
                    return new Hp(valor);
                }
                return  null;
            }
            case "HP%" -> {
                if (HpPorcentual.contieneValorHp(valor)) {
                    return new HpPorcentual(valor);
                }
                 return null;
            }
            case "ATQ" -> {
                if (Atq.contieneValorAtq(valor)) {
                    return new Atq(valor);
                }
                return null;
            }
            case "ATQ%" -> {
                if (AtqPorcentual.contieneValorAtq(valor)) {
                    return new AtqPorcentual(valor);
                }
                return null;
            }
            case "RECARGA" -> {
                if (Recarga.contieneValorRe(valor)) {
                    return new Recarga(valor);
                }
                return null;
            }
            case "ME" -> {
                if (Me.contieneValorMe(valor)) {
                    return new Me(valor);
                }
                return null;
            }
            case "PROB" ->{
                if (Prob.contieneValorProb(valor)) {
                    return new Prob(valor);
                }
                return null;
            }
            case "DMG" ->{
                if (Dmg.contieneValorDmg(valor)) {
                    return new Dmg(valor);
                }
                return null;
            }
        }
        return null;
    }
    
    public static Atributo crearAtributo(){
        String tipo;
        double valor;
        Atributo devolver;
        System.out.println("Los tipos del atributo son: DEF, DEF%, HP, HP%, ATQ, ATQ%, RECARGA, ME, PROB, DMG");
        do{
            tipo = EntradaDatos.pedirCadena("Introduzca el tipo del atributo:");
        } while (comprobarTipo(tipo));
        System.out.println("""
                            Def 16/19/21/23
                            Def % 5.1%/5.8%/6.6%/7.3%
                            HP 209/239/269/299
                            HP % 4.1%/4.7%/5.3%/5.8%
                            Atq 14/16/18/19
                            ATQ % 4.1%/4.7%/5.3%/5.8%
                            RECARGA 4.5%/5.2%/5.8%/6.5%
                            ME 16/19/21/23
                            Prob 2.7%/3.1%/3.5%/3.9
                            DMG 5.4%/6.2%/7%/7.8%""");
        
        do{
            valor = EntradaDatos.pedirDoble("Introduzca el dato del atributo:");
            devolver = asignarValor(tipo, valor);
        }while(devolver == null);
        
        return devolver;
    }
    
    public static boolean menu(int decision){
        switch (decision) {
            case 1 -> {
                a1 = new Artefacto();
                for (int i = 0; i < 3; i++) {
                    a1.setAtributo(crearAtributo());
                }
                System.out.println("¿Tiene 4 atributo?");
                String pregunta = EntradaDatos.pedirCadena("(Si/No)");
                if ("Si".equals(pregunta)) {
                    a1.setAtributo(crearAtributo());
                }
            }
            case 2 -> {
                int nivelArtefacto = a1.getNivel();
                if (nivelArtefacto != 0) {
                    System.out.println("¿Qué atributo evuluciono previamente?");
                    int posicion = EntradaDatos.pedirEntero("1,2,3,4");
                    double valor = EntradaDatos.pedirDoble("Introduce el nuevo valor del atributo");
                    a1.modificarAtributo(posicion-1, valor);
                }
                System.out.println(a1.SubirNivel());
            }
            case 4 -> {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int decision;
        do {            
            System.out.println("--MENU--");
            System.out.println("1.Crear artefacto");
            System.out.println("2.Subir de nivel el artefacto");
            System.out.println("4.Fin");
            decision = EntradaDatos.pedirEntero("Introduce la opcion deseada:");
        } while(menu(decision));
    }
    
}
