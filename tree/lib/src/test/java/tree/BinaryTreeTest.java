package tree;

import static org.junit.Assert.*;

import org.junit.Before;
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
        binaryTree.root.right.left = new Node (5);
    }

    @Test
    public void testInOrder() {
        BinaryTree binaryTree = new BinaryTree();
        assertTrue(binaryTree.inOrder() != null);

        binaryTree.root = new Node(21);
        binaryTree.root.left = new Node(62);
        binaryTree.root.right = new Node(4);
        binaryTree.root.left.right = new Node(5);
        binaryTree.root.left.right.right = new Node(987654321);
        binaryTree.root.right.left = new Node(0);
        binaryTree.root.right.right = new Node(-8);
    }

    @Test
    public void testPostOrder() {
        BinaryTree binaryTree = new BinaryTree();
        assertTrue(binaryTree.postOrder() != null);

        binaryTree.root = new Node(-21, null, null);
        binaryTree.root.left = new Node(99, null, null);
        binaryTree.root.right = new Node(496, null, null);
        binaryTree.root.right.left = new Node(32, null, null);
        binaryTree.root.right.right = new Node(3, null, null);
    }
}