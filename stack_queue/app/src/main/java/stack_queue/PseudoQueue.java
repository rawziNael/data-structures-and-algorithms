package stack_queue;

public class PseudoQueue<T> {
        Stack<T> first;
        Stack<T> second;

        public PseudoQueue() {
            this.first = new Stack();
            this.second = new Stack();
        }

        public void enqueue(T value) {
                first.push(value);
        }

        public T dequeue() {
            T pseudoValue;

            if (this.first.isEmpty()) {
                System.out.println("The first stack is Empty");
                return null;
            } else {
                while (!this.first.isEmpty()) {
                    second.push(first.pop());
                }
                pseudoValue = second.pop();

                while (!this.second.isEmpty()) {
                    first.push(second.pop());
                }
                return pseudoValue;
            }
        }

        @Override
        public String toString() {
            return "PseudoQueue{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }
}
