package stack_queue;

public class Stack<T> {

    Node<T> top;

    public Stack() {
        this.top = null;
    }

    // Adds a new node
    public void push(T value) {
        Node node = new Node(value, this.top);
        this.top = node;
    }

    // Remove the node from the top of the stack
    public T pop() {
        T value = this.top.value;
        this.top = this.top.next;
        return value;
    }

    // Returns the value of the node located on the top of the stack
    public String peek ()
    {
        if(!this.isEmpty())
            return this.top.value.toString();
        else
            return "Your stack is empty";
    }

    public boolean isEmpty(){
        return top == null;
    }
}
