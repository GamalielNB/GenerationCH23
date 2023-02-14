
// //Ejercicio 1

// Optimizar 

// if (GPAacumulativo > 2) {
//     if (Unidadestotales >= 120) { console.log("¡Puede graduarse!'');
//     }
//     }



var GPAacumulativo = 1;
var Unidadestotales = 120;

if (GPAacumulativo > 2 && Unidadestotales >= 120) {
    console.log("¡Puede graduarse!");
  } else {
    console.log("Reprobado!!!!!");
  }
  

  //Ejercicio 2


var cspCalificacion = 80;
var progCalificacion = 1;

if (cspCalificacion >= 75 || progCalificacion >= 75) {
    console.log("Eres elegible para la graduación!");
  } else {
    console.log("Reprobado!!!!!");
  }

//Ejercicio 3

let texto = "Hola mundo";



let palabras = texto.split(" ");
console.log(palabras);

let letras = palabras.map(palabra => palabra.split(""));

console.log(letras);




let resultado = letras.map(palabra => palabra.join("."));
console.log(resultado);

let finalResult = resultado.join(" ");
console.log(finalResult);


