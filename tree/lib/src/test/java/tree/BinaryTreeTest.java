package tree;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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

    //test 17

    @Test
    public void breadthTreeTest(){
        BinaryTree <Integer> binaryTree = new BinaryTree<>();
        try{
            binaryTree.breadthFirst(binaryTree.getRoot());
        }catch (Exception e )
        {
            System.err.println("it's empty");
        }
    }

    @Test
    public void breadthTreeTest1(){

        BinaryTree <Integer> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new Node<>(15));
        ArrayList arr = new ArrayList();
        arr.add(15);
        assertEquals(binaryTree.breadthFirst(binaryTree.getRoot()),arr);
    }

    @Test
    public void breadthTreeTest2() {
        BinaryTree <Integer> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new Node<>(15));
        binaryTree.getRoot().setLeft(new Node<>(7));
        binaryTree.getRoot().setRight( new Node<>(5));
        ArrayList arr = new ArrayList();
        arr.add(15);
        arr.add(7);
        arr.add(5);
        assertEquals(binaryTree.breadthFirst(binaryTree.getRoot()),arr);
    }

    @Test
    public void breadthTreeTest3(){

        BinaryTree <Integer> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new Node<>(2));
        binaryTree.getRoot().setLeft(new Node<>(7));
        binaryTree.getRoot().setRight( new Node<>(5));
        binaryTree.getRoot().getLeft().setLeft(new Node<>(2));
        binaryTree.getRoot().getLeft().setRight(new Node<>(6));
        binaryTree.getRoot().getRight().setRight(new Node<>(9));

        binaryTree.getRoot().getLeft().getRight().setLeft(new Node<>(5));
        binaryTree.getRoot().getLeft().getRight().setRight(new Node<>(11));
        binaryTree.getRoot().getRight().getRight().setLeft(new Node<>(4));
        ArrayList arr = new ArrayList();
        arr.add(2);
        arr.add(7);
        arr.add(5);
        arr.add(2);
        arr.add(6);arr.add(9);arr.add(5);arr.add(11);arr.add(4);
        assertEquals(binaryTree.breadthFirst(binaryTree.getRoot()),arr);
    }

    @Test
    public void breadthTreeTest4(){
        BinaryTree <Integer> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new Node<>(15));
        binaryTree.getRoot().setLeft(new Node<>(7));
        binaryTree.getRoot().getLeft().setLeft( new Node<>(5));
        binaryTree.getRoot().getLeft().getLeft().setLeft(new Node<>(3));
        ArrayList arr = new ArrayList();
        arr.add(15);
        arr.add(7);
        arr.add(5);
        arr.add(3);
        assertEquals(binaryTree.breadthFirst(binaryTree.getRoot()),arr);
    }

    @Test
    public void breadthTreeTest5 () {

        BinaryTree <Integer> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new Node<>(15));
        binaryTree.getRoot().setRight(new Node<>(7));
        binaryTree.getRoot().getRight().setRight( new Node<>(5));
        binaryTree.getRoot().getRight().getRight().setRight(new Node<>(3));
        ArrayList arr = new ArrayList();
        arr.add(15);
        arr.add(7);
        arr.add(5);
        arr.add(3);
        assertEquals(binaryTree.breadthFirst(binaryTree.getRoot()),arr);
    }
}