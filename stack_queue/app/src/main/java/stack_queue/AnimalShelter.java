package stack_queue;

public class AnimalShelter<T> {
    Node<T> front;
    Node<T> back;

    public AnimalShelter() {
        this.front = null;
        this.back = null;
    }

    public void enqueue(T value) {
        Node newNode = new Node(value, null);
        if (this.front == null) {
            this.front = newNode;
            this.back = newNode;
        } else {
            this.back.next = newNode;
            this.back = newNode;
        }
    }

    public Object dequeue(String animalType) {
        Node previous = this.front;
        Node current = this.front;
        while (current != null) {
            if (current.value.toString() == animalType) {

                if (current == previous && current.next == null) {
                    this.front = null;
                    this.back = null;

                } else if (current == previous && current.next != null) {
                    this.front = this.front.next;

                } else if (current == this.back) {
                    this.back = previous;
                }
                if (current != previous) {
                    previous.next = previous.next.next;
                }
                return current.value;
            }

            if (previous != current) {
                previous = previous.next;
            }
            current = current.next;
        }
        return null;
    }

    public Node<T> peek() {
        if(this.front != null){
            return front;
        }else{
            return null;
        }
    }
}
