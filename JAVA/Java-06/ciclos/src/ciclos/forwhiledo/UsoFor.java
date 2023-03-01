package ciclos.forwhiledo;

import java.util.Iterator;

public class UsoFor {
	public void cicloFor() {
		System.out.println("Ciclo for");
		for (int i = 0; i < 10; i++) {
			System.out.println("el iterador --> " + i);
		}
	}
	
	public void letrasfor() {
		System.out.println("Ciclo for letras");
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.print("soy ---> " + (char)i + ",");
		}
	}
}
