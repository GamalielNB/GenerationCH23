var temperatura = parseInt(prompt("Ingrese temperatura en °C y en número: "));

while(isNaN(temperatura) === true){
    temperatura = parseInt(prompt("El dato ingresado no es un número, favor de ingresar temperatura en °C y en número: "));
}

let fahrenheit = temperatura * 1.8 + 32;
let kelvin = temperatura + 273.15;

console.log("La temperatura en grados Fahrenheit es: " + fahrenheit);
console.log("La temperatura en grados Kelvin es: " + kelvin);
