package colecciones.gonb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MisCollection {

	public static void main(String[] args) {
		// Se crea un objeto llamado c de clase MisCollection y se llama a la ufncio
		// imprimir y en el argumento se le da la collection
		MisCollection c = new MisCollection();

		//imprimir(c.listasCollections());
		//imprimir(c.setCollections());
		mapCollections();
		
		Object a[] = c.setCollections().toArray();
		for ( int i = 0; i < a.length; i++) {
			System.out.println("este es un set en arreglo " +a[i]);
		}
		// wrapperClass();
		
	}
	
	//maps collection
	
	private static void mapCollections () {
		Map miMap = new HashMap(); 
		
		miMap.put("valor1", "Juan");
		miMap.put("valor2", "Maria");
		miMap.put("valor3", "Arturo");
		miMap.put("valor4", "Karla");
		
		imprimir (miMap.values());
		imprimir (miMap.keySet());
		
	}
	
	
	
	

	Set setCollections() {
		
		Set miSet = new HashSet ();
		miSet.add("uno");
		miSet.add("dos");
		miSet.add("tres");
		miSet.add("cuatro");
		miSet.add("cinco");
		
		miSet.remove("dos"); //se agrega el elemento a quitar en el arreglo
		System.out.println("El tamaño de la lista " + miSet.size());
		
		//miSet.clear(); //elimina todos los elementos de la lista
		
		
		boolean e = miSet.isEmpty();
		System.out.println("--> " + e );
		
		
		
		
		return miSet;
	}

	// Listas de colección
	// PASO 2 se genera un metodo de tipo list, se genera un objeto de la coleccion
	// lista pero de la clase que implemente ARRAYLIST y se agregan elementos a la
	// lista
	private List listasCollections() {
		List miLista = new ArrayList();
		System.out.println(miLista + "Tamaño de la lista antes " + miLista.size());
		System.out.println("esta vacia " + miLista.isEmpty());

		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
		miLista.add(0, "Pato"); // al especificar el índice lo movera hacía alla, quedano como Pato,1,2,3

		miLista.set(0, miLista); // set lo que hace es ocular el elemento en dicha posición
		miLista.remove(2); // elimina al elemento

		System.out.println(miLista + "Tamaño de la lista despues " + miLista.size());
		System.out.println("esta vacia " + miLista.isEmpty());

		boolean e = miLista.contains(3); // busca si el elemento puest en parentesis se encuentra en el arreglo
		System.out.println("---> " + e);

		return miLista;

	}

	// PASO 1 se gera una funcion/metodo de tipo estatido de tipo void (sin return)
	// que espera una COLLECTION cualquiera que sea, y con el for va iterar los
	// elementos
	private static void imprimir(Collection collection) {
		for (Object elementos : collection) {
			System.out.println("elementos " + elementos);

		}
	}

	// Wrapper

	static void wrapperClass() {
		// byte, short, char, long, float, int, double

		byte numeroB = 12;

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
