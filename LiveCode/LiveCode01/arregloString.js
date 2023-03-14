function stringArray(str, arr) {
    return arr.filter(stringIn => stringIn.length > str.length);
  }
  
 
  let prueba =  stringArray("perro",["ana","zapato", "ola", "arroz","armadillo","faskdjhfklajsd"]);;
  
  console.log(prueba);

  function imprimirArray(array){
    for (let i = 0; i < array.length; i++) {
      console.log(array[i]);
    }
  }

  console.log( imprimirArray(prueba));