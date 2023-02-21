// alert("Día del michi");
// document.write("Hola, buen día" + ("<br>"));
// document.write("adios");

// setTimeout(
//     function (){
//         document.write("Hola mundo, con retraso");
//     }, 1000
// )
// document.write("sorpresa");

const myCollback = () => console.log("Hola mundo con retraso");
setTimeout(myCollback), 100000000;

console.log("sorpresa");