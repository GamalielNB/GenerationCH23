/* Crear un programa en Javascript que realice lo siguiente:
Debe solicitar al usuario 3 números por prompt y guardarlos en sus respectivas variables.
Debe analizar los números, identificar cual es el número mayor, el número del centro y el número menor.
Debe imprimir los números por consola o por el DOM ordenados de mayor a menor, y de menor a mayor.
Debe ser capaz de identificar si los números son iguales e imprimir un mensaje por consola o por el DOM diciendo que los números son iguales. */

// Solicitamos los números al usuario y los almacenamos en variables
let num1 = Number(prompt("Ingresa el primer número:"));
let num2 = Number(prompt("Ingresa el segundo número:"));
let num3 = Number(prompt("Ingresa el tercer número:"));

// Analizamos los números para identificar el mayor, el del centro y el menor
let mayor, medio, menor;

if (num1 > num2) {
  if (num1 > num3) {
    mayor = num1;
    if (num2 > num3) {
      medio = num2;
      menor = num3;
    } else {
      medio = num3;
      menor = num2;
    }
  } else {
    mayor = num3;
    medio = num1;
    menor = num2;
  }
} else {
  if (num2 > num3) {
    mayor = num2;
    if (num1 > num3) {
      medio = num1;
      menor = num3;
    } else {
      medio = num3;
      menor = num1;
    }
  } else {
    mayor = num3;
    medio = num2;
    menor = num1;
  }
}

// Imprimimos los números ordenados de mayor a menor y de menor a mayor
console.log(`Los números ordenados de mayor a menor son: ${mayor}, ${medio}, ${menor}`);
console.log(`Los números ordenados de menor a mayor son: ${menor}, ${medio}, ${mayor}`);

// Verificamos si los números son iguales e imprimimos un mensaje en caso afirmativo
if (num1 === num2 && num1 === num3) {
  console.log("Los números son iguales");
} else {
  console.log("Los números no son iguales");
}
