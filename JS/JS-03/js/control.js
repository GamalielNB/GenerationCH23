/* if (condition) {
    Bloque código    
 } else */

let edad = parseInt(prompt("Escribe tu edad: "));

if (edad <= 17){
    document.write("Eres menor de edad");
 } else if (edad === 18 ){
    document.write("Eres mayor de edad");
 } else if (edad > 18) {
    document.write("Ya estas mayor");
 } else {
   document.write("Este no es un numero valido");
 }