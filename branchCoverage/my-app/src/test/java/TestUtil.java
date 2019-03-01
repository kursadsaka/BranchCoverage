import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
	Util c;

	@Before
	public void setUp() { c = new Util(); }

	@Test
	public void example() { assertTrue(true); }
	
	@Test
	public void lengthIsOne() {
		assertFalse(c.compute(1));
	}
	
	@Test
	public void lengthIsEven() {
		assertFalse(c.compute(1, 1));
	}
	
	@Test
	public void lengthIsOdd() {
		assertTrue(c.compute(1, 1, 1));
	}
	
	@Test
	public void testRuntimeException() {
		try{
			c.compute(0, 1, 1);
			fail();
		} catch (RuntimeException e) {
			
		}
	}
	
	@Test
	public void testFalse() {
		assertFalse(c.compute(3, 5, 9));
	}
	
}