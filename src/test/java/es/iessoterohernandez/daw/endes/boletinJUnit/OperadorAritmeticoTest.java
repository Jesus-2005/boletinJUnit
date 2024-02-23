package es.iessoterohernandez.daw.endes.boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperadorAritmeticoTest {
	private static OperadorAritmetico o;
	@BeforeEach
	public void init() {
		o = new OperadorAritmetico();
	}

	@Test
	void testSuma() {
		assertThat(o.suma(1, 1), is(2));
	}

	@Test
	void testDivision() {
		try {
			assertThat(o.division(10, 5), is(2));
			assertThat(o.division(10, 0), is(2));
			fail();
		}catch(Exception e) {
			
		}
		
	}

}
