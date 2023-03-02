package colecciones.gonb;

import java.util.ArrayList;
import java.util.List;

public class MisCollection {

	public static void main(String[] args) {
	
		wrapperClass();
		
	}
	
	//Listas de colección
	
	public void listasCollections( ) {
		List miLista = new ArrayList();
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
		
	}
	
	private void imprimir(Collection collection) {
		for (Objet elementos : Collection) {
			
		}
	}
	
	
	//Wrapper
	
	static void wrapperClass() {
		//byte, short, char, long, float, int, double
		
		byte numeroB =12;
		
		System.out.println("*****Byte*****");
		
		System.out.println("Tamaño de un byte " + Byte.SIZE);
		System.out.println("Valor máximo de un byte " + Byte.MAX_VALUE);
		System.out.println("Valor mínimo de un byte " + Byte.MIN_VALUE);
		System.out.println("---> " + numeroB);
		
		System.out.println("*****Entero*****");
		
		System.out.println("Tamaño de un entero byte " + Integer.BYTES);
		System.out.println("Tamaño de un entero  " + Integer.SIZE);
		System.out.println("Valor máximo de un entero " + Integer.MAX_VALUE);
		System.out.println("Valor mínimo de un entero " + Integer.MIN_VALUE);
		
		System.out.println("*****Short*****");
		
		System.out.println("Tamaño de un entero byte " + Short.BYTES);
		System.out.println("Tamaño de un short " + Short.SIZE);
		System.out.println("Valor máximo de un  " + Short.MAX_VALUE);
		System.out.println("Valor mínimo de un  " + Short.MIN_VALUE);
		
		System.out.println("*****Float*****");
		
		System.out.println("Tamaño de un entero byte " + Float.BYTES);
		System.out.println("Tamaño de un Float " + Float.SIZE);
		System.out.println("Valor máximo de un  " + Float.MAX_VALUE);
		System.out.println("Valor mínimo de un  " + Float.MIN_VALUE);
		
		System.out.println("*****Long*****");
		
		System.out.println("Tamaño de un long byte " + Long.BYTES);
		System.out.println("Tamaño de un long byte " + Long.SIZE);
		System.out.println("Valor máximo de un " + Long.MAX_VALUE);
		System.out.println("Valor mínimo de un " + Long.MIN_VALUE);
		
	}

}
