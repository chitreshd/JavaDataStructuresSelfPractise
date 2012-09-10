package self.prac.ds;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestQueue {
	
	private Queue<String> data;
	
	@Before
	public void setUp()
	{
		data = new Queue<String>();
		data.put("abc");
		data.put("def");
		data.put("cab");
	}
	
	@Test
	public void testPut()
	{
		assertEquals(data.size(),3);
		String expected = "Queue [userObjects=[abc, def, cab, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]]";
		assertEquals(expected, data.toString());
		
	}
	
	@Test
	public void testGet()
	{
		assertEquals("abc", data.get());
		assertEquals(2,data.size());
		
		assertEquals("def", data.get());
		assertEquals(1,data.size());
		
		assertEquals("cab", data.get());
		assertEquals(0,data.size());
	}
	
	@Test
	public void testPutForMoreThan30Items()
	{
		add30MoreItemsToData();
		assertEquals(33, data.size());		
	}

	private void add30MoreItemsToData() 
	{
		for(int i = 0; i < 30; i++)
		{
			data.put("ghi");
		}
	}
	
	@Test
	public void testGetForMoreThan30Items()
	{
		add30MoreItemsToData();
		assertEquals("abc", data.get());
		assertEquals("def", data.get());
		assertEquals("cab", data.get());
		assertEquals("ghi", data.get());
		assertEquals(29,data.size());
	}
	
	@Test
	public void testPutForMoreThan60Items()
	{
		add30MoreItemsToData();
		add30MoreItemsToData();
		assertEquals(63, data.size());
	}
	
	@Test
	public void testGetForMoreThan60Items()
	{
		add30MoreItemsToData();
		add30MoreItemsToData();
		assertEquals("abc", data.get());
		assertEquals("def", data.get());
		assertEquals("cab", data.get());
		
		for ( int i = 0 ; i < 30 ; i ++)
		{
			assertEquals("ghi", data.get());
		}
		
		assertEquals(30, data.size());
		
	}
	

}
