//package es.iessoterohernandez.daw.endes.boletinJUnit;
//
//import static org.junit.Assert.*;
//import static org.junit.Assert.fail;
//
//
//import static org.hamcrest.Matchers.*;
//import static org.hamcrest.MatcherAssert.assertThat;
//
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//
//
//import org.junit.BeforeClass;
//
//
//public class AccountTest {
//
//	private static Account a;
//
//	@BeforeEach
//	public void init() {
//		a = new Account("owner",11111,222);
//	}
//
//	@Test
//	public void testAccount() {
//		assertThat(a.name, is("owner"));
//		assertThat(a.getAccountNumber(), is(11111L));
//		assertThat(a.getBalance(), is(222.0F));
//	}
//
//	@Test
//	public void testDeposit() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testWithdraw() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testAddInterest() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetBalance() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetAccountNumber() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testToString() {
//		fail("Not yet implemented");
//	}
//
//}
