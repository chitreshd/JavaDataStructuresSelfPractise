package self.prac.ds.examples;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestDelimiterMatcher 
{
	@Test
	public void testForValidInput()
	{
		
		String input = "acbdef";
		assertTrue(DelimiterMatcher.isValid(input));
		
		input = "abcsdnsd[cdc(nmj{hjk}iop)dcd]";
		assertTrue(DelimiterMatcher.isValid(input));
		
		input = "[[[[(((({{{}}}))))]]]]";
		assertTrue(DelimiterMatcher.isValid(input));
	}
	
	@Test
	public void testForInValidInput()
	{
		String input = "acb{";
		assertFalse(DelimiterMatcher.isValid(input));
		
		input = "abc{}]";
		assertFalse(DelimiterMatcher.isValid(input));
	}

}
