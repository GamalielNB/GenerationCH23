/*Debe pedirle al usuario que intente adivinar el número secreto por prompt o por input, dicho número será del 1 al 100.
Si el usuario no adivina el número secreto, debe mostrar un mensaje por consola o DOM diciendo: “Ups, el número secreto es incorrecto, vuelve a intentarlo. ” y volver a solicitarle que ingrese un número.
Si el usuario adivina el número secreto debe de mostrar un mensaje por consola o DOM diciendo: “Felicidades, adivinaste el número secreto”. Además debe imprimir por consola o DOM la lista de números introducidos antes de adivinar el número secreto.
El número secreto puede ser introducido manualmente o generar un número aleatorio, pero recuerda que debe ser del 1 al 100.
Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar el dato. */



// Generar número secreto aleatorio
const numeroSecreto = Math.floor(Math.random() * 100) + 1;

// Crear variable para guardar los números ingresados por el usuario
const numerosIngresados = [];

// Pedir al usuario que ingrese un número
let numeroIngresado = prompt("Adivina el número secreto (entre 1 y 100)");

// Repetir hasta que el usuario adivine el número secreto
while (numeroIngresado != numeroSecreto) {
  // Verificar si el dato ingresado es un número
  if (isNaN(numeroIngresado)) {
    alert("Error: el dato ingresado no es un número.");
  } else {
    // Agregar número ingresado a la lista de números ingresados por el usuario
    numerosIngresados.push(parseInt(numeroIngresado));
    // Verificar si el número ingresado es mayor o menor al número secreto
    if (numeroIngresado > numeroSecreto) {
      alert(`Ups, el número secreto es menor. Vuelve a intentarlo.`);
    } else {
      alert(`Ups, el número secreto es mayor. Vuelve a intentarlo.`);
    }
  }
  // Pedir al usuario que ingrese un número
  numeroIngresado = prompt("Adivina el número secreto (entre 1 y 100)");
}

// Agregar último número ingresado a la lista de números ingresados por el usuario
numerosIngresados.push(parseInt(numeroIngresado));

// Mostrar mensaje de felicitación y lista de números ingresados por el usuario
alert(`¡Felicidades, adivinaste el número secreto (${numeroSecreto})!\n\nLista de números ingresados: ${numerosIngresados.join(", ")}`);
