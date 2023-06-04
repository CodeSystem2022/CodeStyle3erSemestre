package domian;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{  //Bloque de inicialización estático
        System.out.println("Ejecución bloque estático");
        ++Persona.contadorPersonas;
        // idPersona = 10; //No es estático por eso el error
    }
    
    { //Bloque de inicializacion NO estático (Contexto dinámico)
        System.out.println("Ejecucuión del bloque NO estático");
        this.idPersona = Persona.contadorPersonas++;  //Incrementamos el atributo
    }
    
    // Los bloques de inicialización se ejecutan antes del constructor
    
    public Persona(){
        System.out.println("Ejecución del constructor");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }  
}