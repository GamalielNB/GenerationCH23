package com.gonb.testers;

import com.gonb.clases.Circulo;
import com.gonb.clases.Cuadrado;
import com.gonb.clases.FigurasGeometricas;
import com.gonb.clases.Rectangulo;
import com.gonb.clases.Triangulo;

public class TestFigurasGeometricas {

	public static void main(String[] args) {
		FigurasGeometricas rectangulo = new Rectangulo(10,2);
		FigurasGeometricas circulo = new Circulo(2);
		FigurasGeometricas cuadrado = new Cuadrado(2);
		FigurasGeometricas triangulo = new Triangulo(5, 8);
		System.out.println(rectangulo.area());
		System.out.println(circulo.area());
		System.out.println("Area del cuadrado ---> " + cuadrado.area());
		System.out.println("Area del triangulo ---> " + triangulo.area());
		
		System.out.println(rectangulo.toString());
		
		rectangulo.pedirDatos();
		System.out.println(rectangulo.toString());
		System.out.println(rectangulo.area());
	}
	

}
