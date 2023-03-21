/*
Crear un programa en JavaScript que realice lo siguiente:
o Debe solicitar al usuario un número por prompt o por input y guardarlo.
o Debe imprimir la serie de fibonacci dependiendo del número recibido, es decir, si el programa recibe un 8, debe mostrar 8 números de la serie de Fibonacci.
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

// Calcular la serie de Fibonacci y mostrarla en la consola o en el DOM
let fib = [0, 1];
for (let i = 2; i < num; i++) {
  fib[i] = fib[i - 1] + fib[i - 2];
}
console.log("Serie de Fibonacci para " + num + " números: " + fib.join(", "));
