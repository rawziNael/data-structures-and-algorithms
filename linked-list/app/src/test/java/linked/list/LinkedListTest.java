package linked.list;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test public void testInstantiateLinkedList() {
        LinkedList first = new LinkedList();
        first.insert(100);
        first.insert(99);
        first.insert(98);
        first.insert(97);
        first.insert(96);
        first.insert(95);
        first.insert(94);

        assertTrue(first.includes(100));
        assertFalse(first.includes(92));
    }
    @Test public void testIncludes() {
        LinkedList second = new LinkedList();
        second.insert(9);
        second.insert(7);
        second.insert(5);

        assertTrue(second.includes(6));
    }
    @Test public void testAppendLinkedList() {
        LinkedList third = new LinkedList();
        third.insert(100);
        third.insert(99);

        String output = "{99} -> {100} -> {50} -> NULL";
        assertEquals(output, third.toString());
    }
}
