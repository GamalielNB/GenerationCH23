let mi_variable = 5;
let miArray = [2,3,4,5,6,7];
// let miArray = new Array(); //definido como objeto
console.log("miArray"+miArray[0]);
console.log("miArray"+miArray[1]);

let miArray1 = [[1,2,3],
                [4,5,6],
                [7,8,9]];

console.log(miArray1[0][1]);
console.log(miArray1[0][2]);
console.log(miArray1[1]);

// prueba ligica ciclo for

for( let i=0; i <= 3; i++){
   console.log("imprimiento i -> " + miArray[i]); 
}

// Multiplicar matriz inicio

let miArray2 = [[1,2,3],
                [4,5,6],
                [7,8,9]];

let matrizR= [
    [],[],[]
];

for (let i = 0; i <3; i++){
    for (let j = 0; j <3; j++){
        matrizR[i][j] = miArray2[i][j] * miArray2[i][j];
    }
    
    console.log(matrizR);
    console.log("**********")

}


// // Multiplicar matriz fin

/* Recorrer toda la matriz */

for (let i = 0; i <3; i++){
    for(let j=0; j < 3; j++){
        console.log("Imprimiendo la matriz -> " + miArray2[i][j]);
    }
}

/**********While *******/ 

let variable = value;

while (condition) {
    // code to be executed while condition is true
  }
  

let contador = 0;

while (contador < 5 ){
    console.log(contador);
    contador++;
}


