package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes o Wrapper
        /*
        clases envolventes de tipos primitivos
        int = la clase envolvente es Integer
        
        */
        
        int enteroPrim = 10; //tipo primitivo
        System.out.println("enteroPrim = " + enteroPrim);
        Integer entero = 10; //Tipo Objet con la clase Integer
        System.out.println("entero = " + entero.doubleValue()); //Autoboxing
        
        int entero2 = entero;  //unboxing
        System.out.println("entero2 = " + entero2);
        
    }
}
