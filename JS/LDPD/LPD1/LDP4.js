/*Crear un programa en Javascript que realice lo siguiente:
Debe solicitar al usuario un número por prompt o por input y guardarlo.
Debe imprimir la serie de fibonacci dependiendo del número recibido, es decir, si el programa recibe un 8, debe mostrar 8 números de la serie de Fibonacci.
Debe imprimir el resultado por consola o por el DOM.
Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar el dato.
Prueba tu programa con las siguientes combinaciones para asegurarte que funcione correctamente */

let num;

do {
  num = parseFloat(prompt('Ingresa un número entero positivo:'));
} while (isNaN(num) || num < 0 || !Number.isInteger(num));

let fibonacci = [];

for (let i = 0; i < num; i++) {
  if (i < 2) {
    fibonacci.push(i);
  } else {
    fibonacci.push(fibonacci[i - 1] + fibonacci[i - 2]);
  }
}

console.log(`Los primeros ${num} números de la serie de Fibonacci son: ${fibonacci.join(', ')}.`);
