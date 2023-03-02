package Funciones;

public class Funciones {
	
	//las funciones van dentro de la clase principal y sus llamados se hacen generalmente dentro del método principal o main
	
	public static int sumar (int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}//cierre funcion resta 
	
	public static int resta (int num1, int num2) {
		int resultado = num1 - num2;
		return resultado;
	}//cierre funcion resta
	
	public static int multiplicacion (int num1, int num2) {
		int resultado = num1 * num2;
		return resultado;
	}//cierre funcion multiplicacion
	
	public static int division  (int num1, int num2) {
		int resultado = num1 / num2;
		return resultado;
	}//cierre funcion division
	
	// Función para imprimir asteriscos
	public static void imprimirAsteriscos() {
		System.out.println("**************");
	} //cierre imprimirAsteriscos

	//Función que combina distintos tipos de valores
	public static float sumaDecimal (float valor1, int valor2) {
		float resultadoDecimal =  valor1 + valor2;
		return resultadoDecimal;
	}
	
	
	//funcion que usa Strins como argumentos
	public static String awitaDeLimon (String ingrediente1, String ingrediente2, String ingrediente3) {
		String recetaCompletada = ingrediente1 + ingrediente2 + ingrediente3;
		return  recetaCompletada;
	}
	
	
	
	
	
	//Este método tiene como función, ejecutar cosas
	public static void main(String[] args) {
	
		System.out.println("el resultado de la suma es: " + sumar(5,8));
		
		imprimirAsteriscos();
		
		//ejecutar sumadecimal
		
		System.out.println("El resultado de la suma decimal es: " + sumaDecimal(5.7f,5));
		
		imprimirAsteriscos();
		
		System.out.println("Estos son los pasos para preparar agüa de limon: " + awitaDeLimon("agua", "limon", "azucar"));

		imprimirAsteriscos();
		
		//Funciones de la biblioteca de matemáticas (Math)
		
		double valorEjemplo = 7.65497834d;
		System.out.println("La raiz cuadrada de mi valor es: " + Math.sqrt(valorEjemplo));
		
		System.out.println("El seno de mi valor es: " + Math.sin(valorEjemplo));
		 System.out.println("La potencia de mi valor es: " + Math.pow(valorEjemplo, 2));
		 
		 imprimirAsteriscos();
		 
		 //ejercicio torre
		 
		 double distanciaHorizontal = 100.0; // en metros
		 double anguloElevacion = Math.toRadians(30.0); // convertimos el ángulo a radianes
		 double alturaTorre = distanciaHorizontal * Math.tan(anguloElevacion);
		 double hipotenusa = distanciaHorizontal/Math.cos(anguloElevacion);

		 alturaTorre = Math.round(alturaTorre * 100.0)/100.0; //para redondear a dos decimales
		 hipotenusa = Math.round(hipotenusa * 100.0)/100.0;
		 
		 System.out.println("Tu base es de " + distanciaHorizontal + " metros, " + "tu altura es de " + alturaTorre + " metros");
		 System.out.println("Como dato curioso se forma un tringulo rectángulo cuya hipotenusa es igual a " + hipotenusa);
				
	} //cierre de metodo main

} //cierre de clase funciones


/*
 * Funciones
 * 
 * -No retornan valores
 * 
 * -Si retornan valores
 * 
 * 
 * 
 * - Sintaxis de las funciones que si retornan valores
    tipoDeRetorno nombreDeLaFuncion(tipoDeDato argumento1, tipoDeDato argumento2, ...) {
  // Cuerpo de la función
}

    - Sintaxis de las funciones que no retornan valores
    palabraReservada nombreDeLaFuncion(){
    //cuerpo de la funcion
     * 
     *
     *Funciones de la bliblioteca de Matematicas
     */
     
 