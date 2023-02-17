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
var input2 = document.getElementById("input2");

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

//Construimos las funciones de nuestra calculadora



// resultadoQueCambia.innerHTML = "Saludos, cambie el texto juas juas";

function suma(){
    let valor1 = parseFloat(input1.value); //pido numero1
    let valor2 = parseFloat(input2.value); //pido numero2
    let suma = valor1 + valor2; //calculo la suma
    resultado.innerHTML = suma; //pongo el resultado en su lugar
}

function resta(){
    let valor1 = parseFloat(input1.value); 
    let valor2 = parseFloat(input2.value); 
    let resta = valor1 - valor2; 
    resultado.innerHTML = resta; 
}

function multiplicacion(){
    let valor1 = parseFloat(input1.value); 
    let valor2 = parseFloat(input2.value); 
    let multiplicacion = valor1 * valor2; 
    resultado.innerHTML = multiplicacion; 

}

function division(){
    let valor1 = parseFloat(input1.value); 
    let valor2 = parseFloat(input2.value); 
    let division = valor1 / valor2; 
    resultado.innerHTML = division; 
}


botonSuma.addEventListener("click", suma);
botonResta.addEventListener("click", resta);
botonMultiplicacion.addEventListener("click", multiplicacion);
botonDivision.addEventListener("click", division);

/* Como se crea un evento (addEventListener)

    - node.addEventListener ("evento a escuchar"), lo que quiero que haga cuando se escuche

    -addEventListener (palabra reservada para usar el evento)
    -eventoa a escuchar (click, mouseover, etx)
    -Lo que quiero que haga (la llamada de la funcion)



*/


/*

Manipulacion del DOM


-Metodos para acceder a elementos
    document.getElmentById
    document.getElmentByTagName
    document.getElementsByClaseName

-Metodos para crear elementos
    document.createelement(etiqueta)
    document.createTextNode(texto)

-Metodos para insertar elementos
    parentElement.append
    parentElement.insertBefore
    parentElement.insertAdjacentElement

Metodos para modificar elementos 
    node.oterHTML (leer o referenciar el elemento
        node.innerHTML (modificar el elemento)

*/

// ******EVENTOS******
/* Primer paso: Definir con que voy a interactuar (almaceno en una variable) */

const textoAModificar = document.querySelector("#h1")

// Creo una funcion que cambia de color, seguún el color que le paso como parametro

function cambiarColor(color){
    textoAModificar.style.color = color;
}
