package self.prac.ds;

public class LinkedList<T>
{
    protected Link head;
    protected int size = 0;
    
    /**
     * Adds the data to the head of the list.
     * @param data
     */
    public void add(T data)
    {
        Link link = new Link();
        link.data = data;
        link.next = head;
        
        head = link;
        size++;
    }
    
    /**
     * Add the incoming data to the end of the list.
     * @param data
     */
    public void addLast(T data)
    {
        Link link = new Link();
        link.data = data;
        if(isEmpty())
        {
            head = link;
        } else
        {
            Link current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = link;
        }
    }
    
    public T getLast()
    {
        if(isEmpty())
            return null;
        
        Link current = head;
        
        while(current.next != null)
        {
            current = current.next;
        }
        
        return current.data;
    }
    public T find(T t)
    {
        Link current = head;
        
        while(current != null)
        {
            if(current.data.equals(t))
            {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }
    
    public T delete(T t)
    {
        if(!isEmpty())
        {
            if(head.data.equals(t))
            {
                head = head.next;
                return t;
            }
            
            Link current = head;
            Link previous = head;
            
            while(current != null)
            {
                if(current.data.equals(t))
                {
                    previous.next = current.next;
                    return t;
                }
                previous = current;
                current = current.next;
            }
        }
        
        
        return null;
    }
    
    public boolean isEmpty()
    {
        return (head == null);
    }
    
    public int size()
    {
        return size;
    }
    
    protected class Link
    {
        private T data;
        private Link next;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder("Linked list: ");
        Link current = head;
        
        while(current != null)
        {
            builder.append(current.data);
            builder.append(" -> ");
            current = current.next;
        }
        
        builder.append("null");
        return builder.toString();
    }
    
    

}
