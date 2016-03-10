package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Accounting_Test {

Accounting Account = new Accounting(1122, 20000, 4.5);

//put methods in here so they work throughout the whole thing.

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//google
		// run once
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//google
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		
	}
	@Test
	public void test_methods() {
		Account.deposit(2500);	
		assertTrue(Account.getBalance() == 22500);
		Account.withdraw(3000);
		assertTrue(Account.getBalance() == 19500);
	}
	public void test_gets() {
	}
}