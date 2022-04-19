package tree;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BinaryTree<T extends Comparable<T>>{
    Node<T> root;

    ArrayList<T> array =new ArrayList<>();

    public BinaryTree() {
    }

    public BinaryTree(Node<T> node) {
        this.root = node;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public ArrayList<T> preOrder() {
        ArrayList<T> list = new ArrayList<>();
        return preOrder(this.root, list);
    }

    public ArrayList<T> preOrder(Node<T> node, ArrayList<T> list) {
        if (node != null) {
            list.add(node.value);
            preOrder(node.left, list);
            preOrder(node.right, list);
        }
        return list;
    }

    public ArrayList<T> inOrder() {
        ArrayList<T> list = new ArrayList<>();
        return inOrder(this.root, list);
    }

    public ArrayList<T> inOrder(Node<T> node, ArrayList<T> list) {
        if (node != null) {
            inOrder(node.left, list);
            list.add(node.value);
            inOrder(node.right, list);
        }
        return list;
    }

    public ArrayList<T> postOrder() {
        ArrayList<T> list = new ArrayList<>();
        return postOrder(this.root, list);
    }

    public ArrayList<T> postOrder(Node<T> node, ArrayList<T> list) {
        if (node != null) {
            postOrder(node.left, list);
            postOrder(node.right, list);
            list.add(node.value);
        }
        return list;
    }


    //Code Challenge17

    public ArrayList<T> breadthFirst(Node <T> root) {
        Queue<T> queue = new PriorityQueue<T>();
        if(root == null)
            throw  new IllegalStateException("is empty");
        queue.add((T) root);
        array.add(root.value);
        Node node;
        while(!queue.isEmpty()){
            node = (Node) queue.poll();
            if(node.getLeft() != null) {
                queue.add((T) node.getLeft());
                array.add((T) node.getLeft().getValue());
            }
            if(node.getRight() != null) {
                queue.add((T) node.getRight());
                array.add((T) node.getRight().getValue());
            }
        }
        return array;
    }
}
