package tree;

import static org.junit.Assert.*;
import org.junit.Test;


public class MaximumValueTest{
    @Test
    public void testFindMaximumValue() {
        MaximumValue.root = new Node(9);
        MaximumValue.root.left = new Node(12);
        MaximumValue.root.right = new Node(5);
        MaximumValue.root.left.right = new Node(8);
        assertEquals(12, MaximumValue.findMax(MaximumValue.root));

        MaximumValue.root.left.right.left = new Node(17);
        MaximumValue.root.left.right.right = new Node(11);
        MaximumValue.root.right.right = new Node(9);
        MaximumValue.root.right.right.left = new Node(4);
        assertEquals(17, MaximumValue.findMax(MaximumValue.root));
    }
}