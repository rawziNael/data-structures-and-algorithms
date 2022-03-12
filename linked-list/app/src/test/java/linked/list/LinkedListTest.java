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
        LinkedList ap = new LinkedList();
        ap.insert(100);
        ap.insert(99);
        ap.append(50);

        String output = "{99} -> {100} -> {50} -> NULL";
        assertEquals(output, ap.toString());
    }


    @Test public void testInsertBeforeLinkedList() {
        LinkedList before = new LinkedList();
        before.insert(100);
        before.insert(98);
        before.insert(96);
        before.insertBefore(99, 50);

        String output = "{96} -> {97} -> {98} -> {50} -> {99} -> {100} -> NULL";
        assertEquals(output, before.toString());
    }

    @Test public void testInsertAfterLinkedList() {
        LinkedList after = new LinkedList();
        after.insert(99);
        after.insert(97);
        after.insertAfter(97, 50);

        String output = "{96} -> {97} -> {50} -> {98} -> {99} -> {100} -> NULL";
        assertEquals(output, after.toString());
    }

    // Code Challenge: Class 07 - (k-th value from the end of a linked list).
    @Test
    public void testGetKFromEnd() {
        LinkedList tail = new LinkedList();
        tail.insert(8);
        tail.insert(11);
        tail.insert(6);
        tail.insert(18);
        tail.insert(23);

        assertEquals(6, tail.getKValue(2));
        assertEquals(23, tail.getKValue(4));
        assertEquals( 8, tail.getKValue(0));
        assertEquals(-1, tail.getKValue(20));
    }

    //Code Challenge: Class 08 - Zip two linked lists.

    @Test
    public void testZipList() {
        LinkedList fLL = new LinkedList();
        LinkedList sLL = new LinkedList();

        // Testing when the arguments are equal in length
        fLL.insert(5);
        fLL.insert(3);
        fLL.insert(1);
        sLL.insert(6);
        sLL.insert(4);
        sLL.insert(2);
        Node actual = LinkedList.zipLinkedList(fLL, sLL);

        assertEquals("Should be null", actual);

    }
}
