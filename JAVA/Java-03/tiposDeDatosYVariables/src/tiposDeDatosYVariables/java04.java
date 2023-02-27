package tiposDeDatosYVariables;

public class java04 {

    public static void main(String[] args) {
    	int edad = 18;
    	boolean tieneLicencia = true;
    	if (edad >= 18 && tieneLicencia) {
    	    System.out.println("Puede conducir un coche");
    	} else {
    	    System.out.println("No puede conducir un coche");
    	}

    	//or
    	
    	String nombre = "Juan";
    	String apellido = "Perez";
    	if (nombre.equals("Juan") || apellido.equals("Pérez")) {
    	    System.out.println("El usuario es Juan Pérez");
    	} else {
    	    System.out.println("El usuario no es Juan Pérez");
    	}
        
    	//no
    	
    	boolean esVerdadero = true;
    	if (!esVerdadero) {
    	    System.out.println("La condición es falsa");
    	} else {
    	    System.out.println("La condición es verdadera");
    	}
    	
    	//operadores logicos
    	
    	//Verificar si un número es par y positivo:
    		int num1 = 6;
    		
    		
    		if (num1 > 0 && num1 % 2 == 0) {
    		    System.out.println("El número es par y positivo");
    		} else {
    		    System.out.println("El número no es par y positivo");
    		}


    		//Verificar si un número está dentro de un rango específico
    		int num2 = 10;
    		
    		
    		if (num2 >= 5 && num2 <= 15) {
    		    System.out.println("El número está dentro del rango especificado");
    		} else {
    		    System.out.println("El número está fuera del rango especificado");
    		}

    		   		

    		//Verificar si una cadena es igual a otra o no
    		String cadena1 = "Hola";
    		String cadena2 = "hola";
    		    		
    		if (cadena1.equals(cadena2)) {
    		    System.out.println("Las cadenas son iguales");
    		} else {
    		    System.out.println("Las cadenas son diferentes");
    		}

    }
    
    
    
    
}