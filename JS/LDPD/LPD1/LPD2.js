/* Crear un programa en Javascript que realice lo siguiente:
Debe solicitar al usuario la temperatura en grados Celsius por prompt o por un input.
Debe convertir la temperatura ingresada de grados Celsius a grados Fahrenheit y Kelvin
Debe imprimir ambos resultados por consola o por el DOM.
Debe ser capaz de identificar si los datos de entrada sean de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar los datos.*/


let celsius;
let isNumber = false;

while (!isNumber) {
  celsius = prompt("Ingresa la temperatura en grados Celsius:");
  if (!isNaN(celsius)) {
    isNumber = true;
    celsius = Number(celsius);
  } else {
    console.log("El valor ingresado no es un número. Por favor, inténtalo de nuevo.");
  }
}

let fahrenheit = (celsius * 1.8) + 32;
let kelvin = celsius + 273.15;

console.log(`${celsius} grados Celsius son equivalentes a ${fahrenheit} grados Fahrenheit y ${kelvin} grados Kelvin.`);
