package tree;

import static org.junit.Assert.*;
import org.junit.Test;

public class BinaryTreeTest{

    @Test
    public void testPreOrder() {
        BinaryTree binaryTree = new BinaryTree();
        assertTrue(binaryTree.preOrder() != null);

        binaryTree.root = new Node(10);
        binaryTree.root.left = new Node(7);
        binaryTree.root.right = new Node(100);
        binaryTree.root.left.left = new Node(3);
        binaryTree.root.left.right = new Node(18);
        binaryTree.root.right.left = new Node(5);
    }

    @Test
    public void testInOrder() {
        BinaryTree binaryTree = new BinaryTree();
        assertTrue(binaryTree.inOrder() != null);

        binaryTree.root = new Node('A');
        binaryTree.root.left = new Node('B');
        binaryTree.root.right = new Node('C');
        binaryTree.root.left.right = new Node('D');
        binaryTree.root.left.right.right = new Node('E');
        binaryTree.root.right.left = new Node('F');
        binaryTree.root.right.right = new Node('G');
    }

    @Test
    public void testPostOrder() {
        BinaryTree binaryTree = new BinaryTree();
        assertTrue(binaryTree.postOrder() != null);

        binaryTree.root = new Node(15);
        binaryTree.root.left = new Node(24);
        binaryTree.root.right = new Node(6);
        binaryTree.root.right.left = new Node(5);
        binaryTree.root.right.right = new Node(3);
    }
}