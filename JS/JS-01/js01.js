// Escribir un programa que pregunte al usuario por el numero de horas trabajadas y el coste por hora.
//Depues debe mostrar por la pantalla la paga total que le corresponde al usuario

function suma(n1,n2){
    let suma = (n1+n2);
    return suma;
}

function div(n1,n2){
    let div = (n1/n2);
    return div;
}

function multi(n1,n2){
    let multi = (n1*n2);
    return multi;
}

function imprimir(resultado){
    document.write("Aqui esta tu resultado: "+ resultado);
}

function cuadrado(n1){
    let resultado = n1*n1;
    return resultado;
}

function saltarLinea () {

    document.write("<br>");
    document.write("<br>");
    document.write("<hr>");
    document.write("<br>");
    document.write("<br>");
    }
function horas(){
       let horasTrabajadas = prompt("Cuantas horas trabajas bro?");
        let sueldoHora = prompt("a ya y cuanto te pagan la hora?");
        let sueldoDia = horasTrabajadas * sueldoHora;
        document.write("Tons ganas: ", sueldoDia, " al dia?");
}