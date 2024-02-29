package es.iessoterohernandez.daw.endes.boletinJUnit;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import java.text.NumberFormat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;






public class AccountTest {

	private static Account a;

	@BeforeEach
	public void init() {
		a = new Account("Bob Brown",123456789,1000);
	}

	@Test
	public void testDeposit() {
		assertThat(a.deposit(500), is(true));
        assertThat(a.getBalance(), is(1500f));
        
        assertThat(a.deposit(-200), is(false));
        assertThat(a.getBalance(), is(1500f));
	}

	@Test
	public void testWithdraw() {
		assertThat(a.withdraw(500, 0), is(true));
        assertThat(a.getBalance(), is(500f));

        assertThat(a.withdraw(-200, 0), is(false));
        assertThat(a.getBalance(), is(500f));

        assertThat(a.withdraw(1600, 0), is(false));
        assertThat(a.getBalance(), is(500f));

        assertThat(a.withdraw(200, -50), is(false));
        assertThat(a.getBalance(), is(500f));
	}

	@Test
	public void testAddInterest() {
		 
	        a.addInterest();	

	        assertThat(a.getBalance(), is(1000 + (1000 * 0.045f)));
	}


	@Test
	public void testToString() {
		String resultado = "123456789\tBob Brown\t"+NumberFormat.getCurrencyInstance().format(1000.00);
        assertThat(a.toString(), is(resultado));
	}

}



