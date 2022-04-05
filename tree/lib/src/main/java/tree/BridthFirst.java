//package tree;
//
//
//public class BridthFirst<T> extends BinaryTree<T> {
//    public BridthFirst() {
//        super();
//    }
//
//    public static void breadthFirst(BinaryTree tree) {
//        Queue queue = new Queue();
//        queue.enqueue(tree.root);
//        while (queue.peek() != null) {
//            Node front = queue.dequeue();
//            System.out.print(front.value + " ");
//            if (front.left != null) {
//                queue.enqueue(front.left);
//            }
//            if (front.right != null) {
//                queue.enqueue(front.right);
//            }
//        }
//    }
//}
