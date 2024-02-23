package es.iessoterohernandez.daw.endes.boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;


import java.util.stream.Stream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.BeforeEach;
import java.util.Collection;
import java.util.HashSet;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

class FridgeTest {

	private static Fridge f;
	@BeforeEach
	public void init() {
		f = new Fridge();
	}

	@ParameterizedTest
	@CsvSource({"item1", "item2", "item3"})
	void testPut(String input) {
		
	}

	@ParameterizedTest
	@CsvSource("")
	void testContains() {
		fail("Not yet implemented");
	}

	@ParameterizedTest
	@MethodSource("")
	void testTake() {
		fail("Not yet implemented");
	}
	
	

}
