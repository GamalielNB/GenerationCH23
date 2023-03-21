/*
Crear un programa en JavaScript que realice lo siguiente:
o Debe pedirle al usuario que intente adivinar el número secreto por prompt o por input, dicho número será del 1 al 100.
o Si el usuario no adivina el número secreto, debe mostrar un mensaje por consola o DOM diciendo: ,!Ups, el número secreto es incorrecto, vuelve a intentarlo. ” y volver a solicitarle que ingrese un número.
o Si el usuario adivina el número secreto debe de mostrar un mensaje por consola o DOM diciendo: “Felicidades, adivinaste el número secreto”. Además debe imprimir por consola o DOM la lista de números introducidos antes de adivinar el número secreto.
o El número secreto puede ser introducido manualmente o generar un número aleatorio, pero recuerda que debe ser del 1 al 100.
o Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar el dato.
*/

let secretNumber = Math.floor(Math.random() * 100) + 1;
let attempts = [];

// Pedir al usuario que adivine el número secreto
let guess;
do {
  do {
    guess = prompt("Adivina el número secreto (1-100):");
    if (isNaN(guess)) {
      alert("Error: debe ingresar un número.");
    }
  } while (isNaN(guess));
  
  attempts.push(guess);

  if (guess < secretNumber) {
    console.log("¡Ups, el número secreto es mayor, vuelve a intentarlo!");
  } else if (guess > secretNumber) {
    console.log("¡Ups, el número secreto es menor, vuelve a intentarlo!");
  }
} while (guess != secretNumber);

console.log("Felicidades, adivinaste el número secreto.");
console.log("Intentos: " + attempts.join(", "));
