package libs;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FuncionesTests {

	private static Funciones funciones;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		funciones = new Funciones();
		}
	
	@BeforeEach
	void setUp() throws Exception {
	System.out.println("Iniciando test ......");
	}

	
	
	@Test
	void devuelveCentralTest() {
		
		
		assertEquals(5, funciones.devuelveCentral(1, 5, 9));
		assertEquals(5, funciones.devuelveCentral(9, 1, 5));
		assertEquals(5, funciones.devuelveCentral(5, 1, 9));
	}
	
	
	@Test
	void esBisiesto() {
		
	
		assertTrue(funciones.esBisiesto(2028));
		assertFalse(funciones.esBisiesto(2013));
		
		
	}
	
	@Test
	void esCapicua() {
		
		int v[] = {3,5,6,5,3};
		
		assertTrue(funciones.esCapicua(v));
		
		int v2[] = {1,4,7,6,3};
		
		assertFalse(funciones.esCapicua(v2));
		
		
	}
	
	
	@Test
	void suma_vectores() {
		
		int v[] = {1,2,3};
		int v2[]= {4,6,8};
		int vresultado []= {5,8,11};
		
		assertArrayEquals(vresultado,funciones.suma_vectores(v,v2));
		
		assertThrows(ArithmeticException.class, ()->funciones.suma_vectores(v, vresultado));
		
		
	}
}
