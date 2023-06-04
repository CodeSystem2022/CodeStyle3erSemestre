
package paquete2;

public class Clase4 {
    
    private String atributoPrivate = "atributo privado";
    
    private Clase4(){
        System.out.println("constructor privado");
    }
    
    //Creamos un constructor publico para crear objetos
    public Clase4(String argumento){
        this(); //Llamamos al constructor privado vacio
        System.out.println("constructor publico");
    }
    
    //Metodo private
    private void metodoPrivado(){
        System.out.println("metodo privado");
    }

    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
    
}
