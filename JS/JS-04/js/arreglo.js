let lista = [12,5,80,34,7];

lista.sort(
    function(valor1,valor2){
        return valor1 > calor2;
    }
);

console.log(lista);




lista.sort(); //acomoda el arrelgo de acuerdo al primer valor
console.log(lista);




console.log();
lista.reverse(); //invierte el orden del arreglo
console.log(lista);



let remover = lista.splice(1,2); //remueve los elementos del arreglo de acuerdo a la posición indicada
console.log(remover);
console.log(lista);

lista.splice(2,0,100,200,300);
console.log(lista);


lista.shift(); //elimina el primer elemento del arreglo
console.log(lista);



lista.pop(); //elimina el ultimo elemento
console.log(lista);



let masE = lista.concat(100,200,300); //agrega mas elementos al final del arreglo inicial
console.log(masE);


lista.push(100); //agrega un elemento al final del arreglo
console.log(lista);


let msj = lista.join("-"); 
console.log(msj);

let listaNueva = lista.slice(1,3); //selecciona los indices inicial y final pero sin incluir el final
console.log(listaNueva);




// console.log(lista.length);

for (let i=0; i < lista.length ; i++){
    console.log(lista[i]);
}