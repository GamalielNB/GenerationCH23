let persona = {
    nombre: "Juan",
    apellido : "Perez",
    nombrecompleto : function (){
        return "el nombre es " + this.nombre  + this.apellido;
    }
}

console.group(persona);
console.group(persona.nombre);
console.log((persona.nombrecompleto));