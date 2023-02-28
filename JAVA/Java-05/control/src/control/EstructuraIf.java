package control;

import java.util.Scanner;

public class EstructuraIf {
	Scanner entrada = new Scanner(System.in);

	public void controlIf() {
		
		long nota = 5;
		
		if (nota > 5) {
			System.out.println("Nota aprobatoria " + nota);
		}
		System.out.println("continua el control...");

		
		if (nota >= 5) {
			System.out.println("Nota aprobatoria " + nota);
		} else {
			System.out.println("Nota no aprobatoria " + nota);
		}
	
		
		
	}
	
	//Crear programa que inidique si 2 numeros son divisiles
	
			public void divisible () {
				System.out.print("Introduzca un primer número: ");
				int dato1 = entrada.nextInt();
				
				System.out.print("Introduzca un segundo número: ");
				int dato2 = entrada.nextInt();
				
				if(dato1%dato2 == 0) {
					System.out.println(dato1 + " es divisible entre " + dato2);
				} else {
					System.out.println(dato1 + " no es divisible entre " + dato2);
				}
			}
			
			
			//metodo para comparar
			
			public void comparar () {
				System.out.print("Introduzca un primer número: ");
				int valor1 = entrada.nextInt();
				
				System.out.print("Introduzca un segundo número: ");
				int valor2 = entrada.nextInt();
				
				if(valor1 > valor2) {
					System.out.println(valor1 + " es mayor que " + valor2);
				} else {
					System.out.println(valor2 + " es mayor que " + valor1);
				}
				
			}
				
			//anidado if
			
			
			public void anidado() {
				System.out.print("Introduzca un número: ");
				int numero1 = entrada.nextInt();
				
				
			
				if (numero1 > 0) {
					System.out.println("numero1 " + numero1 + " es positivo " );
				} else if (numero1 < 0 ) {
					System.out.println("numero1 " + numero1 + " es negativo " );
				} else {
					System.out.println("numero1 " + numero1 + " es igual a 0  " );
				}
			}
			
			
	
}
