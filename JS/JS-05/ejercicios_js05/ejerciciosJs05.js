// Exercise #1
// You have a list of names: var names = ["Maria", "Antony", "Joy", "Juan"]

// Part 1
// Write a function to insert a name to the end of the list. Add your own name to the end of the list.

var names = ["Maria", "Antony", "Joy", "Juan"];

function finalName(names,name2){
   return names.push(name2);
}

finalName(names,"Gamaliel");
console.log(names);

// Part 2
// Write a function that takes in a name and checks if the list has that name. It should return back a boolean - true/false.

var namesE2 = ["Maria", "Antony", "Joy", "Juan","Gamaliel"];



function findName(name) {
  for (var i = 0; i < namesE2.length; i++) {
    if (namesE2[i] === name) {
      return true;
    }
  }
  return false;
}

var result = findName("Gamaliel");
console.log(result); 
 


//Parte 4

var names = ["Maria", "Antony", "Joy", "Juan", "Gamaliel"];

function getNameLengths(nameListLength) {
    return nameListLength.map(function(name) {
        return name.length;
    });
}

console.log(getNameLengths(names));


//Parte 4 otra solución sin map

function nameLength(names) {
    let nameLengths = [];
    for (let i = 0; i < names.length; i++) {
        let name = names[i];
        let nameLength = name.length;
        nameLengths.push(nameLength);
    }
    return nameLengths;
}


// Exercies 2

console.log(false || (true && false)); 
console.log(true || (11 + 12)); 
console.log((31 + 22) || true); 
console.log(true && (1 + 7)); 
console.log(false && (3 + 4));
console.log((1 + 2) && true);
console.log((32 * 4) >= 129); 
console.log(false !== !true); 
console.log(true === 4); 
console.log(false === (847 === '847')); 
console.log(false === (887 == '887')); 
console.log((!true || (!(100 / 5) === 20) || ((328 / 4) === 82)) || false); 


//Exercies 3





var numero = prompt ("Ingresa numero: ");


function numberRange(num) {
    switch (true) {
      case (num >= 0 && num <= 25):
        console.log(num + " is between 0 and 25");
        break;
      case (num >= 26 && num <= 100):
        console.log(num + " is between 26 and 100");
        break;
      case (num > 100):
        console.log(num + " is greater than 100");
        break;
      default:
        console.log(num + " is less than 0");
        break;
    }
  }
  

console.log(numberRange(numero));
