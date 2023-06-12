
package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionException;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = division(10, 0);
        } catch(Exception e){
            System.out.println("Ocurrió un error");
            e.printStackTrace(System.out); //se conoce como pila de excepciones
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Se reviso la division entre cero");
        }
        System.out.println("La variable de resultado tiene como valor: "+resultado);
    }
}
