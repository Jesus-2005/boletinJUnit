package es.iessoterohernandez.daw.endes.boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaTest {
	
	private static Pila p;
	@BeforeEach
	public void init() {
		p = new Pila();
	}

	@Test
	void testPush() {
		p.push(6);
		assertThat(p.pop(), is(6));
		
		/*Con esto comprobamos que le numero <=2 no entra 
		y utilizamos p.top para que nos devuelva el primer valor añadido*/
		
		p.push(7);
		p.push(1);
		assertThat(p.top(), is(7));
	}

	@Test
	void testPop() {
		p.push(8);
		p.push(13);
		assertThat(p.pop(), is(13));
		p.pop();
		assertNull(p.pop());
	}

	@Test
	void testIsEmpty() {
		p.push(11);
		assertFalse(p.isEmpty());
		p.pop();
		assertTrue(p.isEmpty());
	}

	@Test
	void testTop() {
		p.push(16);
		p.push(8);
		assertThat(p.top(), is(8));
		p.pop();
		p.pop();
		assertNull(p.top());
	}

}
