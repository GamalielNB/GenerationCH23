/*
Crear un programa en JavaScript que realice lo siguiente:
o Debe solicitar al usuario 3 números por prompt y guardarlos en sus respectivas variables.
o Debe analizar los números, identificar cual es el número mayor, el número del centro y el número menor, o Debe imprimir los números por consola o por el DOM ordenados de mayor a menor, y de menor a mayor, o Debe ser capaz de identificar si los números son iguales e imprimir un mensaje por consola o por el DOM diciendo que los números son iguales.
Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
o Entradas:
4,4,2.
o Salida:
4,4,2.
2,4,4.
*/

// Pedir los tres números al usuario
let num1 = prompt("Ingrese el primer número:");
let num2 = prompt("Ingrese el segundo número:");
let num3 = prompt("Ingrese el tercer número:");

// Convertir los números a enteros
num1 = parseInt(num1);
num2 = parseInt(num2);
num3 = parseInt(num3);

// Encontrar el número mayor, medio y menor
let mayor, medio, menor;
if (num1 >= num2 && num1 >= num3) {
  mayor = num1;
  if (num2 >= num3) {
    medio = num2;
    menor = num3;
  } else {
    medio = num3;
    menor = num2;
  }
} else if (num2 >= num1 && num2 >= num3) {
  mayor = num2;
  if (num1 >= num3) {
    medio = num1;
    menor = num3;
  } else {
    medio = num3;
    menor = num1;
  }
} else {
  mayor = num3;
  if (num1 >= num2) {
    medio = num1;
    menor = num2;
  } else {
    medio = num2;
    menor = num1;
  }
}

// Imprimir los números ordenados
console.log("Mayor a menor: " + mayor + ", " + medio + ", " + menor);
console.log("Menor a mayor: " + menor + ", " + medio + ", " + mayor);

// Comprobar si los números son iguales
if (num1 === num2 && num1 === num3) {
  console.log("Los números son iguales.");
}
