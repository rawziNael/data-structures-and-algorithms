package stack_queue;

public class Node<T> {
         T value;
         Node next;

        Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
}
