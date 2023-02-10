let diaNumero = prompt("Ingrese un número de día (0 para domingo y 6 para sábado):");
let diaSemana;

      switch (diaNumero) {
        case "0":
          diaSemana = "Domingo";
          break;
        case "1":
          diaSemana = "Lunes";
          break;
        case "2":
          diaSemana = "Martes";
          break;
        case "3":
          diaSemana = "Miércoles";
          break;
        case "4":
          diaSemana = "Jueves";
          break;
        case "5":
          diaSemana = "Viernes";
          break;
        case "6":
          diaSemana = "Sábado";
          break;
        default:
          diaSemana = "Número de día inválido";
          break;
      }


      /* let q = false;
      let p = false;
      if (q && p) console.log("true"); */


      let q = false;
      let p = false;
      if (q || p) console.log("false");

      let x = 5;