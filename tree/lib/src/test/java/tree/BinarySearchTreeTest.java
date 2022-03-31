package tree;

import static org.junit.Assert.*;
import org.junit.Test;

public class BinarySearchTreeTest{

    @Test
    public void testAdd() {
        BinarySearchTree tree = new BinarySearchTree();
        assertTrue(tree.root == null);

        tree.add(60);
        tree.add(36);
        tree.add(13);
        tree.add(71);

        assertTrue((int) tree.root.value == 60);
        assertTrue((int) tree.root.left.value == 36);
        assertTrue((int) tree.root.left.left.value == 13);
        assertTrue((int) tree.root.right.value == 71);
    }

    @Test
    public void testContains() {
        BinarySearchTree tree = new BinarySearchTree();
        assertTrue(tree.root == null);

        tree.add(29);
        tree.add(35);
        tree.add(18);
        tree.add(10);

        assertTrue(tree.contains(29));
        assertTrue(tree.contains(35));
        assertTrue(tree.contains(18));
        assertTrue(tree.contains(10));
        assertFalse(tree.contains(-5));
        assertFalse(tree.contains(21));
        assertFalse(tree.contains(100));
    }

}