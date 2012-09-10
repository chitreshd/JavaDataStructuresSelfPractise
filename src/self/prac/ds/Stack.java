package self.prac.ds;

import java.util.Arrays;

public class Stack<T> 
{
	private final static int BUFFER = 30;
	private int size = 0;

	T[] userObjects;
	
	@SuppressWarnings("unchecked")
	public Stack()
	{
		userObjects = (T[]) new Object[BUFFER];
	}
	
	@SuppressWarnings("unchecked")
	public void push(T t)
	{
		if(size >= userObjects.length)
		{
			userObjects = (T[]) CollectionUtil.increaseSize(BUFFER, userObjects, size);			
		}
		userObjects[size++] = t;
	}
	
	public T pop()
	{
		return userObjects[--size];
	}
	
	public int size()
	{
		return size;
	}
	@Override
	public String toString() {
		return "Stack [size=" + size
				+ ", userObjects=" + Arrays.toString(userObjects) + "]";
	}
	
	
	
}
