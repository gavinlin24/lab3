import static org.junit.Assert.*;
import org.junit.Test;

public class LinkedListTests {
    
    @Test
    public void testPrepend(){
        LinkedList list = new LinkedList();

        list.prepend(1);
        list.prepend(2);
        list.prepend(3);
        list.prepend(4);
        list.prepend(5);

        assertEquals(5, list.first());
        assertEquals(1, list.last());
        assertEquals(5, list.length());

    }

    @Test
    public void testAppend(){
        LinkedList list = new LinkedList();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        assertEquals(1, list.first());
        assertEquals(5, list.last());
        assertEquals(5, list.length());

    }
}
