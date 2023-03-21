/*
Crear un programa en JavaScript que realice lo siguiente:
o Debe solicitar al usuario un número por prompt o por input y guardarlo.
o Debe calcular el factorial del número recibido.
o Debe imprimir el resultado por consola o por el DOM.
o Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar el dato.
*/

let num;

// Pedir al usuario un número y validar que sea un número
do {
  num = prompt("Ingrese un número:");
  if (isNaN(num)) {
    alert("Error: debe ingresar un número.");
  }
} while (isNaN(num));

// Calcular el factorial del número
let factorial = 1;
for (let i = 2; i <= num; i++) {
  factorial *= i;
}

// Imprimir el resultado en la consola o en el DOM
console.log("El factorial de " + num + " es " + factorial);
