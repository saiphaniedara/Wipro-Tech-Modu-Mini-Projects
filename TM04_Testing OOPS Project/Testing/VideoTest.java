package Testing;
import storeclasses.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class VideoTest {
	static Video v;
	String vname="Matrix";
	@Test
	public void testVideo() {
		v=new Video(vname);
		assertEquals(vname,v.getName());
	}

	@Test
	public void testDoCheckOut() {
		v.doCheckOut();
		assertTrue(v.getCheckOut());
	}

	@Test
	public void testDoReturn() {
		v.doReturn();
		assertFalse(v.getCheckOut());
	}

	@Test
	public void testReceiveRating() {
		int rating=5;
		v.receiveRating(rating);
		assertEquals(rating,v.getRating());
	}

}
