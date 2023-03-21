/*
 Crear un programa en JavaScript que realice lo siguiente:
o Debe solicitar al usuario la temperatura en grados Celsius por prompt o por un input.
o Debe convertir la temperatura ingresada de grados Celsius a grados Fahrenheit y Kelvín
o Debe imprimir ambos resultados por consola o por el DOM.
o Debe ser capaz de identificar si los datos de entrada sean de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar los datos.
 */

let tempCelsius;

// Pedir al usuario la temperatura en Celsius y validar que sea un número
do {
  tempCelsius = prompt("Ingrese la temperatura en grados Celsius:");
  if (isNaN(tempCelsius)) {
    alert("Error: debe ingresar un número.");
  }
} while (isNaN(tempCelsius));

// Convertir la temperatura a Fahrenheit y Kelvin
const tempFahrenheit = (tempCelsius * 9/5) + 32;
const tempKelvin = tempCelsius + 273.15;

// Imprimir los resultados en la consola o en el DOM
console.log("Temperatura en grados Celsius: " + tempCelsius);
console.log("Temperatura en grados Fahrenheit: " + tempFahrenheit);
console.log("Temperatura en grados Kelvin: " + tempKelvin);
