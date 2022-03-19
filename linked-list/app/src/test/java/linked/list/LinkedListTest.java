package linked.list;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    // Code Challenge: Class 05 - Linked List Implementation
    @Test void  testInstantiateAnEmptyLinkedList(){
        LinkedList linkedList = new LinkedList();
    }
    @Test public void testInsertLinkedList() {
        LinkedList first = new LinkedList();
        first.insert(100);
        first.insert(99);
        first.insert(98);
        assertEquals(100, first.head.next.next.value);

    }
    @Test public void testIncludesExists() {
        LinkedList second = new LinkedList();
        second.insert(9);
        second.insert(7);
        second.insert(5);

        assertTrue(second.includes(7));
    }

    @Test public void testIncludesNotExists() {
        LinkedList third = new LinkedList();
        third.insert(9);
        third.insert(7);
        third.insert(5);

        assertFalse(third.includes(10));
    }

    //Code Challenge: Class 06- Extend a Linked List to allow various insertion methods.
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
}
