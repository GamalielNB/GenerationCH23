/*
 Crear un programa en Java que realice lo siguiente:
o Debe solicitar al usuario 10 números por consola y almacenarlos en un array.
o Debe pasar los números que sean primos a las primeras posiciones, desplazando los demás números al final, de tal forma que no se pierda ningún número.
o Debe mostrar por consola el array original, mostrando el índice seguido del valor de la posición.
o Debe mostrar por consola el array que contiene los números primos al principio, mostrando el índice seguido del valor de la posición. El orden de los números no importa, siempre y cuando los números primos vayan al principio del array.
 */

 import java.util.Scanner;

 public class SALPD08 {
     public static void main(String[] args) {
         // Pedir al usuario 10 números y almacenarlos en un array
         Scanner sc = new Scanner(System.in);
         int[] numeros = new int[10];
         
         for (int i = 0; i < numeros.length; i++) {
             System.out.print("Ingrese un número: ");
             numeros[i] = sc.nextInt();
         }
         
         // Pasar los números primos al principio del array
         int[] numerosPrimos = new int[numeros.length];
         int indicePrimos = 0;
         
         for (int i = 0; i < numeros.length; i++) {
             if (esPrimo(numeros[i])) {
                 numerosPrimos[indicePrimos] = numeros[i];
                 indicePrimos++;
             }
         }
         
         for (int i = 0; i < numeros.length; i++) {
             if (!esPrimo(numeros[i])) {
                 numerosPrimos[indicePrimos] = numeros[i];
                 indicePrimos++;
             }
         }
         
         // Mostrar el array original y el array con los números primos al principio
         System.out.println("Array original:");
         for (int i = 0; i < numeros.length; i++) {
             System.out.println(i + ": " + numeros[i]);
         }
         
         System.out.println("Array con números primos al principio:");
         for (int i = 0; i < numerosPrimos.length; i++) {
             System.out.println(i + ": " + numerosPrimos[i]);
         }
     }
     
     // Función para determinar si un número es primo
     public static boolean esPrimo(int num) {
         if (num <= 1) {
             return false;
         }
         
         for (int i = 2; i <= Math.sqrt(num); i++) {
             if (num % i == 0) {
                 return false;
             }
         }
         
         return true;
     }
 }
 