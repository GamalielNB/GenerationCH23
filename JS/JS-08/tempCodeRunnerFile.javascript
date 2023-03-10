class Persona {
    constructor (nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    
    }

    set nombre (nombre){
        this._nombre = nombre;
    }
    
    get nombre(){
        return this._nombre;
    }
    
    set apellido(apelido){
        this._apellido = apellido;
    }
    
    get apelido (){
        return this._apellido;
    }

    nombreCompleto(){
        return this._nombre + " " + this._apellido;
    }
}

//Forma clasica

class Empleado extends Persona {
    constructor (nombre, apellido, departamento){
        super (nombre, apellido)
        this._departamento = departamento;
        }

        set departamento (departamento){
            this._departamento = departamento;
        }

        get departamento(){
            return this._departamento;
        }
        nombreCompleto()

}

let persona1 = new Persona ("Arturo", "Chavez");
console.log(persona1);
console.log(persona1.nombreCompleto());
let empleado1 = new Empleado ("María", "Perez", "Sistemas");
console.log(empleado1);
console.log(empleado1._nombre);
console.log(empleado1.nombreCompleto());

