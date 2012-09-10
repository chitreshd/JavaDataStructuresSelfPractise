package self.prac.ds;

import java.util.Arrays;

/**
 * Queue means First In First Out
 * @author Chitresh
 *
 */
public class Queue<T> 
{
	
	private final static int BUFFER = 30;
	/*private int prevSize = BUFFER;*/
	private int size = 0;
	
	T[] userObjects;
	
	@SuppressWarnings("unchecked")
	public Queue()
	{
		userObjects = (T[]) new Object[BUFFER];
	}
	
	@SuppressWarnings("unchecked")
	public void put(T t)
	{
		if(size >= userObjects.length)
		{
			userObjects = (T[]) CollectionUtil.increaseSize(BUFFER, userObjects, size);						
		}
		userObjects[size] = t;
		size++;		
	}
	
	public T get()
	{
		T retVal = userObjects[0];
		shiftArray();
		return retVal;
	}

	private void shiftArray()
	{
		@SuppressWarnings("unchecked")
		T[] newArray = (T[]) new Object[userObjects.length];
		
		size--;
		System.arraycopy(userObjects, 1, newArray, 0, size);
		userObjects = newArray;
	}

	@Override
	public String toString() {		
		return "Queue [userObjects=" + Arrays.toString(userObjects) + "]";
	}
	
	public int size()
	{
		return size;
	}

}
