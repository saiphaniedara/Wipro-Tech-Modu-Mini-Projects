package Testing;
import Accounts.*;
import Exceptions.InvalidValueException;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RDAccountTest {
	static RDAccount ac1;
	@Before
	public void before() throws InvalidValueException
	{
		ac1=new RDAccount(100000,20,65);
	}
	@Test
	public void testgetInterestRate() throws InvalidValueException {
		assertEquals("9.25",Double.toString(ac1.getInterestRate(65,20)));
	}
	@Test
	public void testCalculateInterest()
	{
		assertEquals("8093.75",Double.toString(ac1.calculateInterest()));
	}

}
