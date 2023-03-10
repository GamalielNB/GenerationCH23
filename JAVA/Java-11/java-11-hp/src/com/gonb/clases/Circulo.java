package com.gonb.clases;

public class Circulo extends FigurasGeometricas {
	private int radio;
	public Circulo(int radio) {
		super("Circulo");
		this.radio = radio;
	}
	@Override
	public double area() {
		
		return Math.PI * Math.pow(radio, 2);
	}
	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}

}
