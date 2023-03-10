package com.gonb.clases;

public class Cuadrado extends FigurasGeometricas {
	private int lado;

	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return lado*lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
}
