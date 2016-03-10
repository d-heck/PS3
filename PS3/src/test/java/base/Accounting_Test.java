package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import base.InsufficientFundsException;

public class Accounting_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	public void test_methods() throws InsufficientFundsException {
		Accounting Account = new Accounting(1122, 20000, 4.5);
		Account.deposit(2500);	
		assertTrue(Account.getBalance() == 22500);
		Account.withdraw(3000);
		assertTrue(Account.getBalance() == 19500);
		System.out.printf("The balance in the account is: " + "$%.2f", Account.getBalance());
		System.out.println("\n" + "The monthly interest rate is: " + Account.getMonthlyInterestRate() + "%");
		System.out.println("The date created was: " + Account.getDateCreated());
	}
	
	@Test
	public void test_gets() {
		Accounting Account = new Accounting(1122, 20000, 4.5);
		assertTrue(Account.getBalance() == 20000);
		assertTrue(Account.getId() == 1122);
		assertTrue(Account.getMonthlyInterestRate() == 4.5/12);
		assertTrue(Account.getAnnualInterestRate() == 4.5);
	}
	@Test(expected=InsufficientFundsException.class)
	public final void testWithdraw() throws InsufficientFundsException {
		Accounting Account = new Accounting(1122, 500, 4.5);
		assertEquals("$400 Expected, actual is $500",(long)Account.getBalance(),(long)500.00);
		Account.withdraw(900);
	}
}