/*
Crear un programa en Java que realice lo siguiente:
o Debe solicitar al usuario por consola una palabra o frase.
o Debe mostrar por consola el texto escrito al revés.
o Entrada:
	eduardo
o Salida:
	odraude
*/

import java.util.Scanner;

public class SALPD06 {
    public static void main(String[] args) {
        // Pedir al usuario una palabra o frase
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase: ");
        String texto = sc.nextLine();
        
        // Invertir el texto y mostrarlo en la consola
        String invertido = new StringBuilder(texto).reverse().toString();
        System.out.println("Texto invertido: " + invertido);
    }
}
