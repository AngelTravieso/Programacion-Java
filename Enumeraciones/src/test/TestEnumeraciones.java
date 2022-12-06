package test;

import enumeracion.*;

public class TestEnumeraciones {

    public static void main(String[] args) {
//        System.out.println("Dia 1: " + Dias.LUNES);
//        indicarDiaSemana(Dias.LUNES);

            System.out.println("Continene no.4: " + Continentes.AMERICA);
            System.out.println("N° Paises en el 4to continente: " + Continentes.AMERICA.getPaises());
            
            System.out.println("Continene no.1: " + Continentes.AFRICA);
            System.out.println("N° Paises en el 1er continente: " + Continentes.AFRICA.getPaises());
    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            default:
                System.out.println("No se reconoce el dia");
                break;
        }
    }

}
