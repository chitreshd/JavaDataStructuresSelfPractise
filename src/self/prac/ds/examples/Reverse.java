package self.prac.ds.examples;

import self.prac.ds.Stack;

public class Reverse 
{
	public static String reverse(String input)
	{
		Stack<Character> chars = new Stack<Character>();
		for(int i = 0; i < input.length() ; i++)
		{
			chars.push(input.charAt(i));
		}
		StringBuffer buffer = new StringBuffer();
		int limit = chars.size();
		for(int i = 0; i < limit; i++)
		{
			buffer.append(chars.pop());
		}
		return buffer.toString();
	}

}
