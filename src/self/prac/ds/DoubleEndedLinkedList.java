package self.prac.ds;

public class DoubleEndedLinkedList<T> extends LinkedList<T>
{
    
    protected Link tail;
    
    /**
     * Add the incoming data to the end of the list.
     * @param data
     */
    @Override
    public void addLast(T data)
    {
        Link dataLink = new Link();
        dataLink.data = data;
        
        if(tail == null)
        {
            tail = dataLink;
        } else
        {
            tail.next = dataLink;
            tail = dataLink;
        }
        
    }

}
