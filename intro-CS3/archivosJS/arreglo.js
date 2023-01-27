let miVariable = 34;

let miArreglo = []; //declaración literal
let miArreglo01 = new Array(); // por instancia

let miArreglo02 = [31,32,33,34];
console.log("dato de miArreglo02 en el indice 0--", miArreglo02[0]);
console.log("dato de miArreglo02 en el indice 1--", miArreglo02[1]);
console.log("dato de miArreglo02 en el indice 2--", miArreglo02[2]);
console.log("dato de miArreglo02 en el indice 3--", miArreglo02[3]);
console.log("El tamaño del arreglo miArreglo02 es: ", miArreglo02.length)

let miArreglo03 = ["Hola", "que","tal"];
console.log("dato de miArreglo03 en el indice 0- ", miArreglo03[0]);
console.log("dato de miArreglo03 en el indice 0- ", miArreglo03[1]);
console.log("dato de miArreglo03 en el indice 0- ", miArreglo03[2]);
console.log("El tamaño del arreglo miArreglo03 es: ", miArreglo03.length)

let miArreglo04= [{nombre:"Hugo"},{apellido:"Fernandez"},{edad:23}]
console.log("Elemento del arreglo de tipo obento Miarreglo04", miArreglo04[0].nombre);
console.log("Elemento del arreglo de tipo obento Miarreglo04", miArreglo04[1].apellido);
console.log("Elemento del arreglo de tipo obento Miarreglo04", miArreglo04[2].edad);
console.log("El tamaño del arreglo miArreglo04 es: ", miArreglo04.length)

let nuevoArreglo00 = [3,6,1,4];
console.log("Orden de mi arregloNuevo con sort: ", nuevoArreglo00.sort()); // Los acomoda de menor a mayor
console.log("Orden de mi arregloNuevo con pop: ", nuevoArreglo00.pop()); //Quita del arreglo  el valor más grande y lo muestra
console.log("Orden de mi arregloNuevo con push: ", nuevoArreglo00.push(10)); //Devuelve el valor más grande
console.log("Orden de mi arregloNuevo con reverse: ", nuevoArreglo00.reverse()); //Ordena de mayor a menor

let nuevoArreglo01 = ["Hola", "que","tal"];
console.log("Orden de mi arregloNuevo con sort: ", nuevoArreglo01.sort()); // Los acomoda de menor a mayor
console.log("Orden de mi arregloNuevo con pop: ", nuevoArreglo01.pop()); //Quita del arreglo  el valor más grande y lo muestra
console.log("Orden de mi arregloNuevo con push: ", nuevoArreglo01.push(10)); //Devuelve el valor más grande
console.log("Orden de mi arregloNuevo con reverse: ", nuevoArreglo01.reverse()); //Ordena de mayor a menor

console.log("javascript"[2])
console.log("javascript".length)

let matriz = [[1,2,3],
              [4,5,6],
              [7,8,9]]
console.log("Tamaño matriz: ", matriz.length)
console.log(matriz[1][1]);