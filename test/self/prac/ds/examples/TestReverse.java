package self.prac.ds.examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestReverse 
{
	
	@Test
	public void testReverse()
	{
		String input = "abcdefgh";
		assertEquals(Reverse.reverse(input),"hgfedcba");
	}

}
