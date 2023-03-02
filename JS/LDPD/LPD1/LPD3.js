/*Crear un programa en Javascript que realice lo siguiente:
Debe solicitar al usuario un número por prompt o por input y guardarlo.
Debe calcular el factorial del número recibido.
Debe imprimir el resultado por consola o por el DOM.
Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar el dato. */

let num;

do {
  num = parseFloat(prompt('Ingresa un número entero positivo:'));
} while (isNaN(num) || num < 0 || !Number.isInteger(num));

let factorial = 1;

for (let i = 2; i <= num; i++) {
  factorial *= i;
}

console.log(`El factorial de ${num} es: ${factorial}.`);
