package com.oopa.mains;

import com.oopa.clases.AreaPerimetro;
import com.oopa.clases.FigurasGeometricas;

public class TestAreaPerimetro {

	public static void main(String[] args) {
	
		AreaPerimetro ap = new AreaPerimetro();
		ap.areaCuadrado(5);
		FigurasGeometricas fg = new FigurasGeometricas();
		fg.setArea(ap.areaCuadrado(5));
		System.out.println("---> " + fg.getArea());
		
		fg.setPerimetro(ap.perimetroCuadrado(5));
		System.out.println("Perimetro del cuadrado --> " + fg.getPerimetro());
		
		fg.setArea((ap.areaTriangulo(5,3)));
		System.out.println("Area del triangulo --> " +fg.getArea());
		
		fg.setPerimetro((ap.perimetroTriangulo(3, 4, 5)));
		System.out.println("Perimetro del triangulo --> " +fg.getPerimetro());
		
		fg.setPerimetro((ap.perimetroCirculo(.5)));
		System.out.println("Perimetro del circulo --> " +fg.getPerimetro());
		
		fg.setArea((ap.areaCirculo(1)));
		System.out.println("Area del circulo --> " +fg.getArea());
		
	}

}
