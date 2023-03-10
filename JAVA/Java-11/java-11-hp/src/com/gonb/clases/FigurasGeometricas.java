package com.gonb.clases;

public abstract class FigurasGeometricas {
	private String nombre;

	public FigurasGeometricas(String nombre) {
		this.nombre = nombre;
	}

	public abstract double area();
	public abstract void pedirDatos();

	@Override
	public String toString() {
		return "FigurasGeometricas [nombre=" + nombre + ", area()=" + area() + "]";
	}
}
