import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  
	Compute c;
	
	@Test
	public void example() {
		MessageQueue mq = mock(MessageQueue.class);
		c = new Compute(mq);
		assertTrue(true);
	}

	@Test
	public void sizeIs0() {
	  
		MessageQueue mq = mock(MessageQueue.class);
		when(mq.size()).thenReturn(0);
		c = new Compute(mq);
		assertEquals(-1, c.countNumberOfOccurrences("aa"));
	  
	}
	
	@Test
	public void sizeIsNot0() {
	  
		MessageQueue mq = mock(MessageQueue.class);
		String s = "abc";
		when(mq.size()).thenReturn(12);
		when(mq.contains(s)).thenReturn(false);
		c = new Compute(mq);
		assertEquals(0, c.countNumberOfOccurrences(s));
	  
	}
  
}