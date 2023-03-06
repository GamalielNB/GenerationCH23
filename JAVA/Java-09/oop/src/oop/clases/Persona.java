package oop.clases;

public class Persona {
	public String nombre = "Juan";
	public int edad;
	double altura;
	
	
	
	

	//Inicia con metodo get y set
	public String getNombre() {
		return nombre;
	}

	
	//Metodo constructor
	public Persona(String nombre, int edad, double altura, double peso, String zodiaco) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.zodiaco = zodiaco;
	}
	public Persona() {
		// TODO Auto-generated constructor stub
	}


	public Persona(String string) {
		// TODO Auto-generated constructor stub
	}


	//finaliza metodo constructor
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String datosPersona() {
		return this.nombre + " " + this.edad + " " this.altura + " " + this.peso + " " + " " + this.zodiaco;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getZodiaco() {
		return zodiaco;
	}

	public void setZodiaco(String zodiaco) {
		this.zodiaco = zodiaco;
	}

	double peso;
	String zodiaco;
}

//finaliza con metodo constructor