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
    @Test void testAppend() {
        LinkedList linkedList= new LinkedList();
        linkedList.insert(21);
        linkedList.insert(16);
        linkedList.insert(35);
        linkedList.append(12);

        //linkedlist length
        Node current = linkedList.head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        assertTrue(linkedList.includes(16));
        assertEquals(4, size);
        assertEquals(12, linkedList.head.next.next.next.value);
    }

    @Test
    void testInsertBeforeFirstNode (){
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insertBefore(3,4);

        String expected =  "{4} -> {3} -> {2} -> {1} -> NULL";
        String actual = linkedList.toString();

        assertEquals(expected,actual);
    }
    @Test
    void testInsertAfterMiddle () {
        LinkedList linkedList = new LinkedList();

        linkedList.insert(4);
        linkedList.insert(8);
        linkedList.insert(10);
        linkedList.insertAfter(8, 6);
        String expected = "{10} -> {8} -> {6} -> {4} -> NULL";
        String actual = linkedList.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testInsertBeforeEnd(){
        LinkedList linkedList = new LinkedList();

        linkedList.insert(4);
        linkedList.insert(8);
        linkedList.insert(10);
        linkedList.insertBefore(4,6);
        String expected = "{10} -> {8} -> {6} -> {4} -> NULL";
        String actual = linkedList.toString();

        assertEquals(expected,actual);
    }

    @Test
    public void testInsertAfter() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(13);
        linkedList.insert(7);
        linkedList.insert(4);
        linkedList.insertAfter(4, 11);

        // linkedlist length
        Node current = linkedList.head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        assertTrue(linkedList.includes(11));
        assertEquals(4, size);
        assertEquals(11 , linkedList.head.next.value);
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
