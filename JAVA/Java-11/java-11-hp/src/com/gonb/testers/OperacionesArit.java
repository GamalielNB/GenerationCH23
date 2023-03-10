package com.gonb.testers;

import com.gonb.clases.Mensajes;
import com.gonb.clases.Suma;

public class OperacionesArit {
	private static Suma sss;
	private String suma;

	public static void main(String[] args) {
		Suma s = new Suma(5,8);
		OperacionesArit ss= new Suma(10,3);
		Mensajes sss= new Suma();
		
		System.out.println("Suma" + s.sumar());
		System.out.println("Operaciones Artimeticas " + ss.suma);
		s.mensaje();
		sss.mensaje();
	}
}
