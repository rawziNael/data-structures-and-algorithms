package linked.list;

public class LinkedList {
        public Node head;

        public LinkedList() {


        }


   // Code Challenge: Class 05: Linked List Implementation

   public void insert(int val) {
            Node node = new Node(val);
            node.next = head;
            head = node;
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

    //Code Challenge: Class 06 - Extend a Linked List to allow various insertion methods.

    public void append(int val) {
        Node newNode = new Node(val);
        Node runner = head;
        while (runner.next != null) {
            runner = runner.next;
        }
        runner.next = newNode;
    }

    public void insertBefore(int target, int val) {
        Node newNode = new Node(val);
        Node runner = head;
        while (runner.next.value != target) {
            runner = runner.next;
        }
        newNode.next = runner.next;
        runner.next = newNode;
    }

    public void insertAfter(int target, int val) {
        Node newNode = new Node(val);
        Node runner = head;
        while (runner.value != target) {
            runner = runner.next;
        }
        newNode.next = runner.next;
        runner.next = newNode;

    }

    //Code Challenge: Class 07 - (k-th value from the end of a linked list).

    public int getKValue(int k) {
        Node current = this.head;

        while (current != null) {
            Node kFromEnd = current;
            for (int i = 0; i < k; i++) {
                if (kFromEnd.next == null && i != k - 1) {
                    return -1;
                }
                kFromEnd = kFromEnd.next;
            }
            if (kFromEnd.next == null) {
                return current.value;
            }
            current = current.next;
        }
        return -1;
    }

    //Code Challenge: Class 08 - Zip two linked lists.

    public static Node zipLinkedList(LinkedList first, LinkedList second) {
        if (first.head == null) {
            return second.head;
        } else if (second.head == null) {
            return first.head;
        }

        Node current = first.head;
        Node tempOne = current.next;
        Node tempTwo = second.head.next;

        while (current != null) {
            if (current.next == null && second.head != null) {
                current.next = second.head;
                return first.head;
            }
            current.next = second.head;
            second.head.next = tempOne;
            if (tempTwo == null) {
                return first.head;
            }
            second.head = tempTwo;
            current = tempOne;
            tempOne = current.next;
            tempTwo = second.head.next;
        }
        return first.head;
    }
}

