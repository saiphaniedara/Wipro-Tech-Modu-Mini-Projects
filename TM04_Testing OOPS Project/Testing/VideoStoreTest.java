package Testing;
import storeclasses.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class VideoStoreTest {
	static VideoStore vs=new VideoStore();

	@Test
	public void test(){
		String vname="Matrix";
		vs.addVideo(vname);
		assertEquals(vname,vs.getLastAddedVideo());
		vs.doCheckOut(vname);
		assertTrue(vs.getCheckOut(vname));
		vs.doReturn(vname);
		assertFalse(vs.getCheckOut(vname));
		int rat=8;
		vs.receiveRating(vname,rat);
		assertEquals(rat,vs.getRating(vname));
		vname="Robot";
		vs.addVideo(vname);
		assertEquals(vname,vs.getLastAddedVideo());
		vs.doCheckOut(vname);
		assertTrue(vs.getCheckOut(vname));
		vs.doReturn(vname);
		assertFalse(vs.getCheckOut(vname));
		rat=5;
		vs.receiveRating(vname,rat);
		assertEquals(rat,vs.getRating(vname));
	}

}
