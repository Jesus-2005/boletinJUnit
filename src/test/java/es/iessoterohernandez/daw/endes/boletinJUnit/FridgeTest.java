package es.iessoterohernandez.daw.endes.boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.CsvSource;


class FridgeTest {

	private static Fridge f;
	@BeforeEach
	public void init() {
		f = new Fridge();
	}

	@ParameterizedTest
	@CsvSource({"item1", "item2", "item3"})
	void testPut(String item) {
		assertTrue(f.put(item));
	}

	@ParameterizedTest
	@CsvSource({"item1", "item2", "item3"})
	void testContains(String item) {
		f.put(item);
		assertTrue(f.contains(item));
	}

	@ParameterizedTest
	@CsvSource({"item1", "item2", "item3"})
	void testTakeNoSuchItemException(String item) {
        Fridge fridge = new Fridge();
        assertThrows(NoSuchItemException.class, () -> fridge.take(item));
    }
	
	

}
