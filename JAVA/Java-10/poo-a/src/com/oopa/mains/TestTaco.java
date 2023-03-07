package com.oopa.mains;

import com.oopa.clases.Taco;

public class TestTaco {

	public static void main(String[] args) {
		//Instanciar dos objetos
		Taco taco1 = new Taco("Maíz", "Pollo", 2, "Grande", 20.50f);
		Taco taco2 = new Taco("Harina", "Carne Asada", 1, "Chico", 59.90f);
		
		System.out.println(taco1.toString());
		System.out.println(taco2.toString());


	}

}
