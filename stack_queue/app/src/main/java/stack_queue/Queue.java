package stack_queue;

public class Queue<T> {

    private Node<T> front;
    private Node<T> back;

    public Queue(Node<T> front, Node<T> back) {
        this.front = front;
        this.back = back;
    }

    // Add a new node
    public void enqueue(T value) {
        Node node = new Node(value, null);
        if (this.front == null) {
            this.front = node;
            this.back = node;
        } else {
            this.back.next = node;
            this.back = node;
        }
    }

    // Removes the node
    public T dequeue() {
        if (this.front == null) {
            return null;
        } else {
            T frontNodeValue = this.front.value;
            this.front = this.front.next;
            return frontNodeValue;
        }
    }

    // Returns the value of the node located in the front of the queue
    public Node peek() {
        if(isEmpty()){
            return null;
        }
        else{
            return front;
        }
    }

    public boolean isEmpty(){
        return this.front==null;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", back=" + back +
                '}';
    }
}
