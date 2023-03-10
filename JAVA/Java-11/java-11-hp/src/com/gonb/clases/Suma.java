package com.gonb.clases;

public class Suma implements OperacionesArit, Mensajes {
private double a;
public Suma() {
	
	this.a = a;
	this.b = b;
}

public double getA() {
	return a;
}

public void setA(double a) {
	this.a = a;
}

public double getB() {
	return b;
}

public void setB(double b) {
	this.b = b;
}

private double b;
	@Override
	public double sumar() {
		
		return this.a + this.b;
	}

	@Override
	public double restar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mensaje() {
		// TODO Auto-generated method stub
		
	}

}
