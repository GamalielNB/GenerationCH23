package pruebasJunit.gonb.test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.rmi.AccessException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import pruebasJunit.gonb.app.Calculadora;

class CalculadoraTest {
	private Calculadora ct;
	private Calculadora ct1 = null;

	@BeforeEach

	public void configurandoBefore() {
		ct = new Calculadora();
		System.out.println("Ejecutando Before ---> configurandoBefore");
	}

	@AfterEach

	public void configurandoAfter() {
		System.out.println("Ejecutandop AfterEach() ---> configurandoAfter()");
		System.out.println("*****************************");

	}

	@Test
	public void calculadoraNull() {

		assertNull(ct, "La clase es una instancia no nula");
		System.out.println("ejecuando primer test --> caculadora");
	}

	@Test
	public void calculadoraNotNull() {
		assertNull(ct, "La clase esta instanciada ");
		System.out.println("ejecutandose segundo test --> calculadora");
	}

	@Test

	public void primersAssert() {

		/*
		 * 1.- Indicar que se va a evaluar 2.- Indicar lo que se a arealizar 3.-
		 */

		int resultadoEsperado = 10;
		int resultadoActual;
		resultadoActual = ct.sumar(5, 5);
		assertEquals(resultadoEsperado, resultadoActual);
		System.out.println("Ejecutnado tercer test --> primerosASsert()");

	}

	@Test
	public void sumaTest() {
		Calculadora calculadora = new Calculadora();
		assertEquals(20, ct.sumar(10, 10));
		System.out.println("Ejecutando cuarto test --> primeroASsert");
	}

	/********* TIPOS DE TEST ******/
	@Test
	private void tiposAsserts() {
		assertTrue(1 == 1);
		assertEquals("Generation", "Generation");
		assertNull(ct);

		Calculadora c1 = new Calculadora();
		Calculadora c2 = new Calculadora();
		Calculadora c3 = new Calculadora();

		assertSame(c1, c3);
		assertNotSame(c2, c3);
		assertEquals(1, 1.5, .5);

	}
	
	public void validandosuma(){
		assertEquals(111,ct.sumar(5,6));
	}

	public void validandoResta() {
		assertEquals(50,ct.restar(56, 6));
	}
	
	public void validandoRestaNegativa() {
		assertEquals(-10,ct.restar(10, 20));
	}
	
	@Test
	private void validandoDivision() {
		assertEquals(2,ct.dividir(10, 5));
	}
	/*
	@Test
	public void divisionByZero() {
		assertThrows(AccessException.class,
				() -> ct.divisionByZero(10, 0), "No se puede dividir por cero");
	}
	*/
	
	@Disabled("En espera")
	@Test
	public void divisionByZero() {
		assertThrows(AccessException.class,
				() -> ct.divisionByZero(0, 1), "No se puede dividir por cero");
}
