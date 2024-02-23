package es.iessoterohernandez.daw.endes.boletinJUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubscripcionTest {

	private static Subscripcion s;
	@BeforeEach
	public void init() {
		s = new Subscripcion(10,2);
	}

	@Test
	void testPrecioPorMes() {
		assertThat(s.precioPorMes(), is(5.00));
	}
// Se comprueba que se cambia perfectamente el periodo a 0
	@Test
	void testCancel() {
		s.cancel();
		assertThat(s.precioPorMes(), is(0.00));
	}

}
