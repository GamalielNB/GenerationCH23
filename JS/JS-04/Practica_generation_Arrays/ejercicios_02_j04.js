// //Exercise #2
// Write a JavaScript program to construct the following pattern, using a nested for loop.

// *  
// * *  
// * * *  
// * * * *  
// * * * * *

for (let i = 1; i <= 5; i++) {
    let space = "";
    for (let j = 1; j <= i; j++) {
      space += "* ";
    }
    console.log(space);
  }
  

  