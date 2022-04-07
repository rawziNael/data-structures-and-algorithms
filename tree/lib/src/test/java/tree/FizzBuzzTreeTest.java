package tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTreeTest{
    BinaryTree test = new BinaryTree<>();

    @Before
    public void createTree() {
        test.root = new Node<>(3, new Node<>(15, new Node<>(4), new Node<>(10)), new Node<>(6));
    }

    @Test
    public void testFizzBuzzTree() {
        FizzBuzzTree.fizzBuzzTree(test);

        assertEquals("Fizz", test.root.value);
        assertEquals( "FizzBuzz", test.root.left.value);
        assertEquals( 4, test.root.left.left.value);
        assertEquals("Buzz", test.root.left.right.value);
        assertEquals( "Fizz", test.root.right.value);
    }
}