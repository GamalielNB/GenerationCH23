package com.oopa.clases;

public class FigurasGeometricas {
	private double perimetro;
	private double area;
	public Object ap;
	
	//constructor vacio
	public FigurasGeometricas() {

	}

	//constructor sobre cargado porque ya tiene parametros
	public FigurasGeometricas(double perimetro, double area) {

		this.perimetro = perimetro;
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	
}
