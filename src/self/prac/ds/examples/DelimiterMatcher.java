package self.prac.ds.examples;

import self.prac.ds.Stack;

public class DelimiterMatcher 
{
	public static boolean isValid(String input)
	{
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0 ; i < input.length(); i++)
		{
			Character temp = input.charAt(i); 
			if(temp == '[' || temp == '{' || temp == '(')
			{
				stack.push(temp);
			} else if (temp == ']' || temp == '}' || temp == ')')
			{
				if(stack.size() == 0)
				{
					return false;
				}
				
				Character tempx = stack.pop();
				if( tempx != '[' && temp == ']'||
					tempx != '(' && temp == ')'||
					tempx != '{' && temp == '}' )
				{
					return false;
				}
					
			}
		}
		if(stack.size() == 0)
		{
			return true;
		}
		return false;
	}
	

}
