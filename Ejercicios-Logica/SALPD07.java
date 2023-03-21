/*
Crear un programa en Java que realice lo siguiente:
o Debe solicitar al usuario un día de la semana (de lunes a viernes).
o Debe solicitar al usuario una hora (horas y minutos).
o Debe calcular cuantos minutos faltan para el fin de semana. Se considera que el fin de semana comienza el viernes a las 15:00 hrs.
o Debe mostrar el resultado por consola.
o Debe ser capaz de identificar si los datos de entrada son válidos (día de la semana válido, hora válida, minutos válidos), en caso contrario debe mandar un mensaje de error y volver a solicitar los datos.
*/




import java.util.Scanner;

public class SALPD07{
    public static void main(String[] args) {
        // Pedir al usuario un día de la semana y una hora
        Scanner sc = new Scanner(System.in);
        String diaSemana;
        int hora, min;
        
        do {
            System.out.print("Ingrese un día de la semana (lunes a viernes): ");
            diaSemana = sc.nextLine();
        } while (!diaSemana.matches("lunes|martes|miércoles|miercoles|jueves|viernes"));
        
        do {
            System.out.print("Ingrese una hora (0-23): ");
            hora = sc.nextInt();
        } while (hora < 0 || hora > 23);
        
        do {
            System.out.print("Ingrese los minutos (0-59): ");
            min = sc.nextInt();
        } while (min < 0 || min > 59);
        
        // Calcular minutos hasta el fin de semana y mostrar el resultado en la consola
        int minutosHastaFinSemana = 0;
        
        switch (diaSemana) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "miercoles":
                minutosHastaFinSemana += (24 - hora - 1) * 60;
                minutosHastaFinSemana += (60 - min);
                minutosHastaFinSemana += 3 * 60; // 3 horas hasta el viernes a las 15:00
                break;
            case "jueves":
                minutosHastaFinSemana += (15 - hora - 1) * 60;
                minutosHastaFinSemana += (60 - min);
                break;
            case "viernes":
                if (hora < 15) {
                    minutosHastaFinSemana += (15 - hora - 1) * 60;
                    minutosHastaFinSemana += (60 - min);
                }
                break;
        }
        
        System.out.println("Minutos hasta el fin de semana: " + minutosHastaFinSemana);
    }
}
