package es.iessoterohernandez.daw.endes.boletinJUnit;


import static org.junit.jupiter.api.Assertions.*;


import java.util.stream.Stream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import es.iessoterohernandez.daw.endes.boletinJUnit.Boa;

class BoaTest {

	private static Boa b;
	@BeforeEach
	public void init() {
		b = new Boa("SuNombre",20,"granola bars");
	}

	@ParameterizedTest
	@MethodSource("boasProvider")
	void testIsHealthy(Boa boa, boolean saludable) {
		 assertThat(boa.isHealthy(), is(saludable));
	}

	@ParameterizedTest
	@MethodSource("boasAndCageLeghtProvider")
	void testFitsInCage(Boa boa, int cageLength, boolean longitudMenor) {
		assertThat(boa.fitsInCage(cageLength), is(longitudMenor));
	}
	
	static Stream<Arguments> boasProvider() {
	    return Stream.of(
	            Arguments.of(new Boa("HealthyBoa", 10, "granola bars"), true ),
	            Arguments.of(new Boa("UnhealthyBoa", 8, "mice"), false)
	    );
	}
	
	static Stream<Arguments> boasAndCageLeghtProvider() {
	    return Stream.of(
	            Arguments.of( new Boa("FitsInCageBoa", 8, "granola bars"), 10, true ),
	            Arguments.of(new Boa("TooBigForCageBoa", 12, "granola bars"), 10, false)
	    );
	}

}
