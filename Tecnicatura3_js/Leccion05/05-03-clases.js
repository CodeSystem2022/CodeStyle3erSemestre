class Persona {
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }
    get nombre(){
        return this._nombre;
    }
    get apellido(){
        return this._apellido;
    }

    get nombrecompleto(){ 
        return this._nombre+ ' '+this._apellido;
    };
    
}

let persona1 = new Persona('Juan', 'Perez');
console.log(persona1.nombre);
console.log(persona1.apellido);
console.log(persona1.nombrecompleto);

let persona2 = new Persona('Luis', 'Gonzalez');
console.log(persona2.nombrecompleto);
