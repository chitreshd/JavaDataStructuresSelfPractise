package self.prac.ds;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestStack 
{
	
	@Test
	public void testStackForStrings()
	{
		Stack<String> stack = new Stack<String>();
		stack.push("abc");
		stack.push("pop");
		stack.push("cab");
		
		assertEquals("cab",stack.pop());
		assertEquals("pop",stack.pop());
		assertEquals("abc",stack.pop());
		
	}
	
	@Test
	public void testStackForInteger()
	{
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(90);
		stack.push(89);
		stack.push(78);
		
		int result = stack.pop();
		assertEquals(78, result);
		result = stack.pop();
		assertEquals(89,result);
		result = stack.pop();
		assertEquals(90,result);
	}
	
	@Test
	public void testStackForMoreThan30Enteries()
	{
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 1; i < 35; i++)
		{
			stack.push(i);
		}
		for(int i = 34; i > 0; i--)
		{
			int result = stack.pop();
			assertEquals(i,result);
		}
	}

}
