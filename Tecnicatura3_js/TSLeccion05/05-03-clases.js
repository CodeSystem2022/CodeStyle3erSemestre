//let persona3 = new Persona("Carla", "Ponce");
// no se puede crear un objeto antes de que esté la clase creada
class Persona{  //Clase padre

    static contadorObjetosPersona = 0; //Atributo estático
    email = "Valor default email"; //Atributo no estático

    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        Persona.contadorObjetosPersona++;
        console.log("Se incrementa el contador: "+Persona.contadorObjetosPersona);
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get apellido(){
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }

    nombreCompleto(){
        return this._nombre+" "+this._apellido;
    }

    //Sobreescribiendo el método de la clase padre (Object)
    toString(){  //Regresa un String
        //Se aplica el polimorfismo que significa = multiples formas en tiempo de ejecución
        //El método que se ejecuta depende si es una referencia de tipo padre o hija
        return this.nombreCompleto();
    }
    
    static saludar(){
        console.log("Saludos desde este método static");
    }

    static saludar2(persona){
        console.log(persona.nombre+" "+persona.apellido);
    }
}

class Empleado extends Persona{ //Clase hija
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }

    get departamento(){
        this._departamento;
    }

    set departamento(departamento){
        this.departamento = departamento;
    }

    //Sobreescritura
    nombreCompleto(){
        return super.nombreCompleto()+", "+this._departamento;
    }
}

let persona1 = new Persona("Martin", "Perez");
console.log(persona1.nombre);
console.log(persona1.apellido);
persona1.nombre = "Juan Carlos";
console.log(persona1.nombre)
persona1.apellido = "López";
console.log(persona1.apellido)
//console.log(persona1);
let persona2 = new Persona("Carlos", "Lara");
console.log(persona2.nombre);
console.log(persona2.apellido);
persona2.nombre = "María Laura";
console.log(persona2.nombre);
persona2.apellido = "González";
console.log(persona2.apellido);
//console.log(persona2);


let empleado1 = new Empleado("María", "Giménez", "Sistemas");
console.log(empleado1);
console.log(persona1.toString());

//persona1.saludar();  //no se utiliza desde el objeto, si desde la clase
Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1);

//console.log(persona1.contadorObjetosPersona);
console.log(Persona.contadorObjetosPersona);
console.log(Empleado.contadorObjetosPersona); 
//Las clases hijas heredadn tmb los atributos estáticos

console.log(persona1.email);
console.log(empleado1.email);
// console.log(Persona.email); //No se puede acceder desde la clase