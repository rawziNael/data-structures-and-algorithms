/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack_queue;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testPush() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(7);
        stack.push(16);
        stack.push(9);
        assertEquals(9, stack.top.value);
        assertEquals( 16, stack.top.next.value);
        assertEquals(7 , stack.top.next.next.value);
        assertEquals(5, stack.top.next.next.next.value);
    }

    @Test
    public void testPop() {
        Stack stack = new Stack();
        stack.push(23);
        stack.pop();
        assertEquals(null, stack.top);

        stack.push(28);
        stack.push(11.5);
        stack.push("Hi");
        stack.pop();
        assertEquals(11.5, stack.top.value);

        stack.pop();
        stack.pop();
        assertEquals(null, stack.top);
    }

    @Test
    public void testPeek() {
        Stack stack = new Stack();
        stack.push(64);
        assertEquals("64", stack.peek());

        stack.push("Rawzi");
        assertEquals("Rawzi", stack.peek());

        stack.pop();
        assertEquals( "64", stack.peek());
    }

    @Test
    public void  instantiateEmptyStack (){
        Stack stack = new Stack();
        assertEquals( null, stack.top);
    }

    @Test
    public void  peekExceptionStack (){
        Stack stack = new Stack();
        assertEquals("Your stack is empty",stack.peek());
    }

    @Test
    public void testEnqueue() {
        Queue queue = new Queue();
        queue.enqueue("Rawzi");
        assertEquals("Rawzi", queue.front.value);
    }

    @Test
    public void testMultipleEnqueue (){
        Queue queue = new Queue();
        queue.enqueue(2.5);
        queue.enqueue(15);
        queue.enqueue("Rawzi");
        queue.enqueue("a");

        assertEquals(2.5 , queue.front.value);
    }

    @Test
    public void testDequeue(){
        Queue queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals( 1, queue.dequeue());
        assertEquals( 2, queue.dequeue());

        queue.enqueue(18);
        queue.enqueue(16);
        assertEquals( 18, queue.dequeue());
        assertEquals( 16, queue.dequeue());
        assertEquals( null, queue.dequeue());
    }

    @Test
    public void TestPeekQueue (){
        Queue queue = new Queue();
        assertEquals(null, queue.peek());

        queue.enqueue(14.3);
        queue.enqueue(2);
        queue.enqueue("Z");
        assertEquals(queue.front, queue.peek());
    }

    @Test
    public void TestDequeueUntilEmpty(){
        Queue queue = new Queue();
        queue.enqueue('X');
        queue.enqueue("Rawzi");
        queue.enqueue(14.5);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertEquals(null, queue.peek());
    }

    @Test
    public void TestInstantiateEmptyQueue (){
        Queue queue = new Queue();
        assertEquals(null, queue.peek());
    }
}
