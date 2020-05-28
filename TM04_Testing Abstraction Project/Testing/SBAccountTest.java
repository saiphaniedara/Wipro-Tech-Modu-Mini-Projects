package Testing;
import Accounts.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class SBAccountTest {
	@Test
	public void testCalculateInterest() throws Exception {
		SBAccount ac=new SBAccount(1,200000);
		assertEquals("8000.0",Double.toString(ac.calculateInterest()));
		ac=new SBAccount(2,100000);
		assertEquals("6000.0",Double.toString(ac.calculateInterest()));
	}

}
