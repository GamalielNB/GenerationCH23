package com.oopa.mains;

import com.oopa.clases.ClaseGenerica;

public class TestGenerico {

	public static void main(String[] args) {
		ClaseGenerica <Integer> intObj = new ClaseGenerica<Integer>(55);
		ClaseGenerica <String> caracteresObj = new ClaseGenerica<String>("Prueba");
		
		intObj.claseTipo();
		caracteresObj.claseTipo();
	}

}
