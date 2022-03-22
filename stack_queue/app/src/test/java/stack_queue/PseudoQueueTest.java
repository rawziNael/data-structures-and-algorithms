package stack_queue;

import org.junit.Test;
import static org.junit.Assert.*;

public class PseudoQueueTest{

    @Test
    public void testEnqueue() {
        PseudoQueue pseudoQueue = new PseudoQueue();
        pseudoQueue.enqueue("Rawzi");
        pseudoQueue.enqueue(true);
        pseudoQueue.enqueue(7.2);
        assertEquals("Rawzi", pseudoQueue.dequeue());
        assertEquals(true, pseudoQueue.dequeue());
        assertEquals(7.2, pseudoQueue.dequeue());
        assertEquals(null, pseudoQueue.dequeue());
    }

    @Test
    public void testDequeue() {
        PseudoQueue pseudoQueue = new PseudoQueue();
        pseudoQueue.enqueue(15);
        pseudoQueue.enqueue(32);
        pseudoQueue.enqueue(4);
        assertEquals(15, pseudoQueue.dequeue());
        assertEquals(32, pseudoQueue.dequeue());
        assertEquals(4, pseudoQueue.dequeue());
        assertEquals(null, pseudoQueue.dequeue());
    }
}