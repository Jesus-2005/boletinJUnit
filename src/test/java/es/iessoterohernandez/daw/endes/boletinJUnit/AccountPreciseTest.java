package es.iessoterohernandez.daw.endes.boletinJUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountPreciseTest {
	
	
	private Account a;

	@BeforeEach
	public void setUp() {
	a = new Account("Owner", 123456789, 1000.00f);
	}

	@Test
	public void test() {
	for (int i = 0; i < 1000; i++) {
	a.deposit(10.00f);
	a.withdraw(5.00f, 0.00f);
	}

	assertEquals(1000.00f + 10.00f * 1000 - 5.00f * 1000, a.getBalance());
	}
	
}
