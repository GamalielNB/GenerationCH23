package pruebasJunit.gonb.app;

public class Calculadora {
	
	public int sumar (int n1, int n2) {
		return (n1+n2);
	}
	
	public int restar (int n1, int n2) {
		return (n1-n2);
	}
	
	public int multiplicar (int n1, int n2) {
		return n1*n2;
	}
	
	public int dividir (double v1, double v2) {
		return  (int) (v1/v2);
	}
	
	public double divisionByZero (double v1, double v2) {
		if (v2==0) {
			throw new ArithmeticException("*** No se puede dividir por cero");
		}
		
		return (v1/v2);

}
