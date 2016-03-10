package base;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Date;

		public class Account_Test {

			@BeforeClass
			public static void setUpBeforeClass() throws Exception {
			}

			@AfterClass
			public static void tearDownAfterClass() throws Exception {
			}

			@Before
			public void setUp() throws Exception {
			}

			@After
			public void tearDown() throws Exception {
			}
			
			@Test
			public void AccountHasFunds() throws InsufficientFundsException{
				Account h=new Account();
				h.setbalance(10);
				h.withdraw(20);
				
				if (h.getbalance()<0){
					fail("You do not have enough funds to withdraw this amount");
				}
			}

			@Test
			public void testAccount() {
				Account testAccount=new Account();
				testAccount.setannualinterest(.045);
				testAccount.setbalance(20000);
				testAccount.setid(1122);
				testAccount.withdraw(2500);
				testAccount.deposit(3000);
				System.out.println(testAccount.getMonthlyInterestRate());
				System.out.print(testAccount.getbalance());
				System.out.println(testAccount.getDate());
	}
}
