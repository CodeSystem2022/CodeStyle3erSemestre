
package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;


public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Día 4: "+ Dias.JUEVES);
        indicarDiaSemana(Dias.JUEVES); // LAS ENUMERACIONES SE TRATAN COMO CADENAS
        // Ahora no se deben usar comillas, se accede a través de el operador de punto
        System.out.println("Continente n° 4: "+ Continentes.AMERICA);
        System.out.println("N° de paises en el 4to continente: "+Continentes.AMERICA.getPaises());
         System.out.println("Continente n° 4: "+ Continentes.AMERICA);
        System.out.println("N° de habitantes en el 4to continente: "+Continentes.AMERICA.getHabitantes());
    }
    
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES: 
                System.out.println("Primer día de la semana");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer día de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto día de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto día de la semana");
                break;
            case SABADO:
                System.out.println("Sexto día de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo día de la semana");
                break;
            
        }
    }
}