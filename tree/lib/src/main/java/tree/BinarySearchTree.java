package tree;

public class BinarySearchTree{

    public SecondNode root;

    public BinarySearchTree() {}

    public BinarySearchTree(SecondNode node) {
        this.root = node;
    }

    public void add(int value) {
        root = add(root, value);
    }

    public SecondNode add(SecondNode node, int value) {
        if (node == null) {
            return new SecondNode(value);
        } else if (value < node.value) {
            node.left = add(node.left, value);
        } else {
            node.right = add(node.right, value);
        }
        return node;
    }

    public boolean contains(int data) {
        return contains(root, data);
    }

    public boolean contains(SecondNode node, int data) {
        if (node == null) {
            return false;
        }
        if (data == node.value) {
            return true;
        } else if (data < node.value) {
            return contains(node.left, data);
        } else {
            return contains(node.right, data);
        }
    }
}
