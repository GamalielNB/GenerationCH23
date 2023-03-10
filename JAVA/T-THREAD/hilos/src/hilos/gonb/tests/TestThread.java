package hilos.gonb.tests;

import hilos.gonb.formathreads.Hilo1;

public class TestThread {
	public static void main(String[] args) {
		Thread h = new Hilo1("Juan");
		Thread h0 = new Hilo1("María");
		Thread h1 = new Hilo1 ("Raul");
		h1.start();
		
		h.start();
		
		/*try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		System.out.println(h.getState());
	}
}
