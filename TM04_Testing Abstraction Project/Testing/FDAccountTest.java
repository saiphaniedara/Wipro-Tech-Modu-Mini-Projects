package Testing;
import Accounts.*;
import Exceptions.InvalidValueException;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FDAccountTest {
	static FDAccount ac1;
	static FDAccount ac2;
	@Before
	public void before() throws InvalidValueException
	{
		ac1=new FDAccount(100000,16,45);
		ac2=new FDAccount(20000000,19);
	}
	@Test
	public void testgetInterestRate() throws InvalidValueException {
		assertEquals("4.75",Double.toString(ac1.getInterestRate(16,45)));
		assertEquals("6.75",Double.toString(ac2.getInterestRate(19)));
	}
	
	@Test
	public void testCalculateInterest()
	{
		assertEquals("4750.0",Double.toString(ac1.calculateInterest()));
		assertEquals("1350000.0",Double.toString(ac2.calculateInterest()));
	}


}
