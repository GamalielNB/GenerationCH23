package hilos.gonb.tests;

import hilos.gonb.formarunnable.Hilo2;

public class TestRun {
	public static void main(String[] args) {
		Hilo2 ht = new Hilo2 ("Pedro");
		Thread st = new Thread (ht);
		st.start();
		
		new Thread(new Hilo2("Canicula")).start();
		new Thread(new Hilo2("Mariano")).start();
	}
}
