/*

¿Que encontramos en el arbol del DOM?

-Node: Los elemenos más básicos dentro del documento. Puede ser una etiqueta, un texto dentro de una etiqueta o un comentario.

<titile> NODO
    Manipulación DOM // Es un nodo , pero es hijo del title
<titile>

-Document: Tabien es un nodo, del tipo documento, es el nodo raiz a partir del cual se desaroolan o generan todos los demás nodos.

-Element: Son todos aquellos definidos por etiquetas <div>, <img>, <h1>, <p>

Attributes: Nodos que dan información asociada al tipo de elemento como el src o alt dentro de img

-Comentario: Comentarios y otros elementos que estan dentro del HTML, son considerados nodos.


*/ 

/* como leer nodos de mi document Object Model (DOM)

Metodos tradicionales (que se usan en versiones antiguas de JS)

 //voy a navegar en el documento y traer los elementos por su ID
- document.getElementById(botonSuma) 
-document.getElementByTagName (<button>)
-document.getElementByClassName(botones)


*/ 

var elementoID = document.getElementById("botonSuma");
console.log(elementoID);

var elementoEtiqueta = document.getElementsByTagName("button");
console.log(elementoEtiqueta);

console.log("Este es el primer elemento de mi colección de botones" + elementoEtiqueta[0]);

var elementoClassName = document.getElementsByClassName("botones");
console.log(elementoClassName);

/* 
-Metodos recientes
    -document.querySelector(#botones); //solo el primer elemento
    -document.querySelectorAll(.botones) //trae toda la lista



*/

var unElemento = document.querySelector("#input1");
console.log(unElemento);


var variosElementos = document.querySelectorAll(".botones");

//Construir nuestra calculadora

var input1 = document.getElementById("input1");
var input1 = document.getElementById("input2");

var botonSuma = document.getElementById("botonSuma");
var botonResta = document.getElementById("botonResta");
var botonMultiplicacion = document.getElementById("botonMultiplicacion");
var botonDivision = document.getElementById("botonDivision");

var resultado = document.getElementById("resultado");

// //Creacion de Nodos

//  - documento.createElement(tipoNodo)


// Creacion de una etiqueta del tipo imagen
var imagenPerrito = document.createElement("img");

//Crear atributos a la etiqueta
imagenPerrito.src = "https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg";
imagenPerrito.alt = "Foto de perrito tierno"
imagenPerrito.style.width = "150px"
imagenPerrito.style.borderRadius= "100px"

var textoPerrito = document.createElement("p");
textoPerrito = "Este es mi perrito";

//Poner elementos o nodos en el html
document.body.append(imagenPerrito);

//Actualizar nodos
/*  1) Identificar el nodo que quiero cambiar (outer) 
    2) Modificar el nodo (inner) 
    O Identificar el nodo con un metodo para tomarlo ya sea getElement o QuerySelectort y modficarlo con inner.HTML */

    

var resultadoQueCambia = document.getElementById("resultado");

resultadoQueCambia.innerHTML = "Saludos, cambie el texto juas juas";

