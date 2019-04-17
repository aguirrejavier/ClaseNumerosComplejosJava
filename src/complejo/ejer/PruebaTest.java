package complejo.ejer;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class PruebaTest {
	
	
	@Test
	public void queSuma() {
		Complejo c1 = new Complejo(2,3);
		Complejo c2 = new Complejo(3,3);
		Complejo esperado = new Complejo(5,6);
		assertEquals(esperado, c1.sumar(c2));
	}
	@Test
	public void queSuma2() {
		Complejo c1 = new Complejo(2,3);
		Complejo esperado = new Complejo(6,3);
		assertEquals(esperado, c1.sumar(4));
	}
	
	@Test
	public void queResta() {
		
		Complejo num = new Complejo(2,3);
		Complejo num2= new Complejo(3,3);
		Complejo esperado = new Complejo(-1,0);
		assertEquals(esperado, num.restar(num2));
	}
	
	@Test
	public void queMultiplica() {
		
		Complejo c1 = new Complejo(2,3);
		double escalar = 2;
		Complejo esperado = new Complejo(4,6);
		assertEquals(esperado, c1.multiplicar(escalar));
	}
	
	@Test
	public void testClone() {
		Complejo c1 = new Complejo(2,3);
		Complejo c2 = new Complejo();
		c2.clone(c1);
		assertEquals(c1, c2);
	}
	
	@Test
	public void testordenar() {
		
		Complejo[] original = {new Complejo(4,4), new Complejo(1,-1),new Complejo(3,3)};
		Arrays.sort(original);
		Complejo[] esperado = {new Complejo(1,-1), new Complejo(3,3), new Complejo(4,4)};
		assertArrayEquals(esperado, original);
	}
	
	@Test
	public void testordenarPorReal() {
	
		Complejo[] original = {new Complejo(-2,4), new Complejo(1,-1),new Complejo(3,3)};
		Arrays.sort(original, new ComplejosPorParteReal());
		Complejo[] esperado = {new Complejo(-2,4), new Complejo(1,-1), new Complejo(3,3)};
		assertArrayEquals(esperado, original);
	}
	
	@Test
	public void testordenarPorImaginario() {
		
		Complejo[] original = {new Complejo(0,0), new Complejo(1,-1),new Complejo(3,3)};
		Arrays.sort(original, new ComplejosPorParteImaginaria());
		Complejo[] esperado = {new Complejo(1,-1), new Complejo(0,0), new Complejo(3,3)};
		assertArrayEquals(esperado, original);
	}
}
