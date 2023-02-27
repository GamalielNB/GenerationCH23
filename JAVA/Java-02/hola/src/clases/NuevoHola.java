package clases;

import java.util.Scanner;

public class NuevoHola {
	
	
	private String nombre;
	//Para inicializar la variable (obejto de tipo String)
	//usamos el metodo constructor

	public NuevoHola(String nombre) { //esto es un constructor y tiene el mismo nombre que el miembro del dato
		super();
		this.nombre = nombre;
	}
	
	//Crear método para saludar
	
	public void saludo() {
		System.out.println("Hola desde java con sts de nuevo " + this.nombre);
	}
	
	public void saludoConNombre() {
		System.out.println("Hola tu eres el gran: " + this.nombre);
		
	}
	
}
