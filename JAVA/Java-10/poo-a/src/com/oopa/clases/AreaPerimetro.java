package com.oopa.clases;

public class AreaPerimetro {

	public double areaCuadrado(double lado) {
		double area = lado*lado;
		return area;

	}
	public double perimetroCuadrado(double lado) {
		double perimetro = 4*lado;
		return perimetro;

	}
	
	public double areaTriangulo(double base, double altura) {
		return (base*altura)/2;
	}
	
	public double perimetroTriangulo(double ladoA, double ladoB, double ladoC) {
		
		return (ladoA +ladoB + ladoC);
	}
	
	public double perimetroCirculo(double radio) {
		return Math.PI *2*radio;
	}
	
	public double areaCirculo(double radio) {
		return Math.PI*radio*radio;
	}
}
