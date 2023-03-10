package hilos.gonb.formathreads;

public class Hilo1 extends Thread {

	@Override
	public void run() {
		System.out.println("Se inicia el Thread o Hilo " + this.getName());
		
		for (int i =0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Termina el Thread o Hilo " + this.getName());
	}

	public Hilo1(String name) {
		super(name);
		
	}
}
