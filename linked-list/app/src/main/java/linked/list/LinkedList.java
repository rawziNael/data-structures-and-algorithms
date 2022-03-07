package linked.list;

public class LinkedList {

        public Node head;
        public LinkedList() {

        };

    public void insert(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public boolean includes(int target) {
        Node runner = head;

        while (runner != null) {
            if (runner.value == target) {
                return true;
            } else {
                runner = runner.next;
            }
        }
        return false;
    }

    public String toString() {
        String str = "";
        Node runner = head;

        while (runner != null) {
            str += "{" + runner.value + "} -> ";
            runner = runner.next;
        }
        str += "NULL";
        return str;
    }
}
