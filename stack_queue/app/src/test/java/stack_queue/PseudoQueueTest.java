package stack_queue;

import org.junit.Test;
import static org.junit.Assert.*;

public class PseudoQueueTest{

    @Test
    public void testEnqueue() {
        PseudoQueue pseudoQueue = new PseudoQueue();
        pseudoQueue.enqueue(15);
        assertTrue(pseudoQueue.first.peek() != null);
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