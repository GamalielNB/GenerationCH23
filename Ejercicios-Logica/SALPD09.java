/*
 Crear un programa en Java que realice lo siguiente:
o Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
o Utiliza un objeto HashMap para almacenar los pares de palabras.
o Debe solicitar al usuario una palabra en español e imprimir por consola la palabra en inglés.
o Si la palabra escrita no se encuentra en el diccionario debe imprimir un mensaje por consola, diciendo que: “La palabra no se encuentra en el diccionario.”.
 */

 import java.util.HashMap;
 import java.util.Scanner;
 
 public class SALPD09 {
     public static void main(String[] args) {
         // Crear el diccionario Español-Inglés
         HashMap<String, String> diccionario = new HashMap<>();
         diccionario.put("hola", "hello");
         diccionario.put("adiós", "goodbye");
         diccionario.put("gracias", "thank you");
         diccionario.put("por favor", "please");
         diccionario.put("buenos días", "good morning");
         diccionario.put("buenas tardes", "good afternoon");
         diccionario.put("buenas noches", "good evening");
         diccionario.put("casa", "house");
         diccionario.put("perro", "dog");
         diccionario.put("gato", "cat");
         diccionario.put("rojo", "red");
         diccionario.put("azul", "blue");
         diccionario.put("verde", "green");
         diccionario.put("amarillo", "yellow");
         diccionario.put("blanco", "white");
         diccionario.put("negro", "black");
         diccionario.put("libro", "book");
         diccionario.put("lápiz", "pencil");
         diccionario.put("computadora", "computer");
         diccionario.put("teléfono", "phone");
         
         // Solicitar al usuario una palabra en español y buscar su traducción en el diccionario
         Scanner sc = new Scanner(System.in);
         System.out.print("Ingrese una palabra en español: ");
         String palabraEsp = sc.nextLine();
         
         if (diccionario.containsKey(palabraEsp)) {
             String palabraIng = diccionario.get(palabraEsp);
             System.out.println("La traducción de " + palabraEsp + " es " + palabraIng);
         } else {
             System.out.println("La palabra no se encuentra en el diccionario.");
         }
     }
 }
 