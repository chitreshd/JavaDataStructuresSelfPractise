package self.prac.ds;

public class CollectionUtil {
	
	public static Object[] increaseSize(int BUFFER, Object[] userObjects, int size) 
	{
		int newSize = userObjects.length + BUFFER;
		
		Object[] newArray = new Object[newSize];
		
		System.arraycopy(userObjects, 0, newArray, 0, size);
		userObjects = newArray;
		return userObjects;
	}

}
