package com.oopa.clases;

public class Persona {
	private int edad;
	private String nombre;
	private int nss;
	public Persona () {}
	public int getEdad() {
		return edad;
	}
	
	//constructor sobrecargado
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNss() {
		return nss;
	}
	public void setNss(int nss) {
		this.nss = nss;
	}
	
	//Constructor vacio 
	public Persona(int edad, String nombre, int nss) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.nss = nss;
	}

}
