package stack_queue;

public class Stack<T> {

    private Node<T> top;

    public Stack(Node<T> top) {
        this.top = top;
    }

    // Adds a new node
    public void push(T value) {
        Node node = new Node(value, this.top);
        this.top = node;
    }

    // Removes the node from the top of the stack
    public T pop() {
        T value = this.top.value;
        this.top = this.top.next;
        return value;
    }

    // Returns the value of the node located on the top of the stack
    public String peek ()
    {
        if(!this.isEmpty())
            return this.top.toString();
        else
            return "The stack is empty";
    }

    public boolean isEmpty(){
        return top == null;
    }
}
