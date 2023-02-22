class persona {
    constructor (nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    
    }
}

set nombre (nombre){
    this._nombre = nombre;
}

get nombre(){
    return this._nombre;
}


let persona3 = new persona ("Jhonny", "Deep");
console.log(persona3.nombre);
