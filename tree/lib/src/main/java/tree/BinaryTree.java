package tree;

import java.util.ArrayList;

public class BinaryTree<T>{
    Node<T> root;

    public BinaryTree() {
    }

    public BinaryTree(Node<T> node) {
        this.root = node;
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
}
