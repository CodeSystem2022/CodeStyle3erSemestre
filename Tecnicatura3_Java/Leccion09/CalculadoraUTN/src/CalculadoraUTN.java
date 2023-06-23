import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true){ // Ciclo infinito
            System.out.println("******* Aplicación Calculadora *******");
            //Mostramos el menú
           mostrarMenu();
            var operacion = Integer.parseInt(entrada.nextLine());

            try{
                if(operacion >= 1 && operacion <= 4) {
                   
                    ejecutarOperacion(operacion, entrada);
                } //Fin del If
                else if(operacion == 5){
                    System.out.println("Hasta pronto...");
                    break; //rompe el ciclo
                }
                else{
                    System.out.println("Operación erronea: "+operacion);
                }
                //Imprimimos un salto de linea antes de repetir el menú
                System.out.println();
            } catch(Exception e){ //Fin try, comienzo del catch
                System.out.println("Ocurri� un error " + e.getMessage());
            }
        } // Fin while
    } // Fin main
    
    private static  void mostrarMenu(){
         System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                5. Salir
                """);
            System.out.print("Operación a realizar? ");
    }//fin m�todo mostrar menu
    
    private static void ejecutarOperacion(int operacion, Scanner entrada){
         System.out.print("Digite el valor para el operando1: ");
                    var operando1 = Double.parseDouble(entrada.nextLine());
                    System.out.print("Digite el valor para el operando2: ");
                    var operando2 = Double.parseDouble(entrada.nextLine());
            double resultado;
                        switch(operacion){
                            case 1 -> { //suma
                                resultado = operando1 + operando2;
                                System.out.println("Resultado de la suma: "+resultado);
                            }
                            case 2 -> { //resta
                                resultado = operando1 - operando2;
                                System.out.println("Resultado de la resta: "+resultado);
                            }
                            case 3 -> { //multiplicación
                                resultado = operando1 * operando2;
                                System.out.println("Resultado de la multiplicación: "+resultado);
                            }
                            case 4 -> { //división
                                resultado = operando1 / operando2;
                                System.out.println("Resultado de la división: "+resultado);
                            }
                            default -> System.out.println("Opcion erronea: "+operacion);
                        } //Fin switch
    }//fin m�todo ejecutar operacion
} // Fin class
