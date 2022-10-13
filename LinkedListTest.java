import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTest {
    @Test
    public void testPrepend() {
        LinkedList l = new LinkedList();
        l.prepend(4);
        assertEquals(4, l.first());
    }
    @Test
    public void testPrependTwo() {
        LinkedList l = new LinkedList();
        l.prepend(4);
        l.prepend(5);
        assertEquals(5, l.first());
    }
    @Test
    public void testAppend() {
        LinkedList l = new LinkedList();
        l.append(4);
        assertEquals(4, l.first());
    }
    @Test
    public void testAppendTwo() {
        LinkedList l = new LinkedList();
        l.append(4);
        l.append(7);
        assertEquals(4, l.first());
    }
    @Test
    public void testLengthAppend() {
        LinkedList l = new LinkedList();
        l.append(4);
        l.append(7);
        l.append(99);
        assertEquals(3, l.length());
    }
    @Test
    public void testLengthPrepend() {
        LinkedList l = new LinkedList();
        l.prepend(4);
        l.prepend(7);
        l.prepend(99);
        assertEquals(3, l.length());
    }
    @Test
    public void testLastPrepend() {
        LinkedList l = new LinkedList();
        l.prepend(4);
        l.prepend(7);
        l.prepend(99);
        assertEquals(4, l.last());
    }
    @Test
    public void testLastAppend() {
        LinkedList l = new LinkedList();
        l.append(4);
        l.append(7);
        l.append(99);
        assertEquals(99, l.last());
    }
}
