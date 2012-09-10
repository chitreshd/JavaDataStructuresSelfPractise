package self.prac.ds;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestLinkedList
{
    @Test
    public void testAdd()
    {
        LinkedList<String> list = new LinkedList<String>();
        assertTrue(list.isEmpty());
        
        list.add("abc");
        assertFalse(list.isEmpty());
        assertEquals(list.size(),1);
        
        list.add("abc");
        assertFalse(list.isEmpty());
        assertEquals(list.size(),2);
        
        list.add("abc");
        assertFalse(list.isEmpty());
        assertEquals(list.size(),3);
        
    }
    
    @Test
    public void testFind()
    {
        LinkedList<String> list = new LinkedList<String>();
        
        list.add("abc");
        list.add("def");
        list.add("cab");
        
        assertEquals(list.find("abc"), "abc");
        assertEquals(list.find("def"), "def");
        assertEquals(list.find("cab"), "cab");
        assertEquals(list.find("abc"), "abc");
        
        assertNull(list.find("not present"));
    }
    
    @Test
    public void testDelete()
    {
        LinkedList<String> list = new LinkedList<String>();
        assertNull(list.delete("abc"));
        
        list.add("abc");
        list.add("def");
        list.add("cab");
        
        assertEquals(list.delete("abc"),"abc");
        assertNull(list.delete("abc"));
        
        assertEquals(list.delete("cab"),"cab");
        assertNull(list.delete("cab"));
        
        assertEquals(list.delete("def"),"def");
        assertNull(list.delete("def"));
    }
    
    @Test
    public void testAddLast()
    {
        LinkedList<String> list = new LinkedList<String>();
        assertTrue(list.isEmpty());
        
        list.addLast("abc");
        assertEquals("abc", list.getLast());
        list.addLast("def");
        assertEquals("def", list.getLast());
        list.addLast("cab");
        assertEquals("cab", list.getLast());
        
    }

    @Test
    public void testGetLast()
    {
        LinkedList<String> list = new LinkedList<String>();
        assertTrue(list.isEmpty());
        
        list.add("abc");
        assertEquals("abc", list.getLast());
        list.add("def");
        assertEquals("abc", list.getLast());
        list.add("cab");
        assertEquals("abc", list.getLast());
    }
    
}
