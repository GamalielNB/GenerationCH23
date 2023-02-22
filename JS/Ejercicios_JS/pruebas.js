//* Generar un número aleatorio entre 1 y 100

// En esta línea, se utiliza la función Math.random() para generar un número aleatorio entre 0 y 1. Luego, se multiplica por 100 para obtener un número aleatorio entre 0 y 100. Se utiliza Math.floor() para redondear hacia abajo el resultado y obtener un número entero entre 0 y 100. 

const numeroSecreto = Math.floor(Math.random() * 100);



//TODO agregar intentos totales y números ingresados
const numerosIngresados = [];

//* Función para validar si el dato de entrada es un número

// En esta línea, se define una función llamada validarNumero que toma un parámetro numero. Dentro de la función, se utiliza la función isNaN() para determinar si el valor de numero no es un número. Si ese es el caso, se muestra un mensaje de error en la consola y se retorna false. De lo contrario, se retorna true.

function validarNumero(numero) {
  if (isNaN(numero)) {
    document.getElementById("mensaje").innerHTML = "Ups, debes ingresar un número. Inténtalo de nuevo.";
    return false;
  }
  return true;
}

//* Función para verificar si el número ingresado es el número secreto

// En esta línea, se define una función llamada verificarNumero que toma un parámetro numero. Dentro de la función, se agrega el número ingresado por el usuario al arreglo numerosIngresados utilizando el método push(). Luego, se compara numero con numeroSecreto. Si son iguales, se muestra un mensaje de felicitación en la consola y se muestra la lista de números ingresados en la consola utilizando el método join() para unir los elementos del arreglo en una cadena separada por comas. De lo contrario, se muestra un mensaje de error en la consola.

function verificarNumero(numero) {
  numerosIngresados.push(numero);
  if (numero === numeroSecreto) {
    document.getElementById("mensaje").innerHTML = "Felicidades, adivinaste el número secreto.";
    document.getElementById("listaNumerosIngresados").innerHTML = "Lista de números ingresados: " + numerosIngresados.join(", ");
  } else {
    document.getElementById("mensaje").innerHTML = "Ups, el número secreto es incorrecto, vuelve a intentarlo.";
  }
}

// Función para obtener el número ingresado por el usuario y verificarlo
function obtenerNumero() {
  const numeroIngresado = document.getElementById("numeroIngresado").value;
  if (validarNumero(numeroIngresado)) {
    verificarNumero(Number(numeroIngresado));
  }
}

// Asociar la función obtenerNumero al botón Verificar
document.getElementById("botonVerificar").addEventListener("click", obtenerNumero);
