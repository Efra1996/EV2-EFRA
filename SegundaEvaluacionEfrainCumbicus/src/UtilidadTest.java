import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
	
class UtilidadTest {
	
	@Test
	void ejercicioDtest1() {
		Utilidad ut=new Utilidad();
		int valor=ut.ejercicioD(0);
		int esperado=0;
		assertEquals(esperado, valor);
	}
	@Test
	void ejercicioDtest2() {
		Utilidad ut=new Utilidad();
		
		int valor=ut.ejercicioD(2);
		int esperado=4;
		assertEquals(esperado, valor);
	}
	@Test
	void ejercicioDtest3() {
		Utilidad ut=new Utilidad();
		
		int valor=ut.ejercicioD(3);
		int esperado=9;
		assertEquals(esperado, valor);
	}
	@Test
	void ejercicioDtest4() {
		Utilidad ut=new Utilidad();
		
		int valor=ut.ejercicioD(4);
		int esperado=28;
		assertEquals(esperado, valor);
	}
	@Test
	void ejercicioDtest5() {
		Utilidad ut=new Utilidad();
		
		int valor=ut.ejercicioD(5);
		int esperado=125;
		assertEquals(esperado, valor);
	}
	
	
}
