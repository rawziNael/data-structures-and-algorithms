package tree;
<<<<<<< HEAD

import static org.junit.Assert.*;
import org.junit.Test;
=======
import org.junit.Test;

import static org.junit.Assert.*;
>>>>>>> main

public class MaximumValueTest{
    @Test
    public void testFindMaximumValue() {
<<<<<<< HEAD
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

=======
        MaximumValue maximumValue = new MaximumValue();
        assertEquals(null, MaximumValue.findMaximumValue(maximumValue));

        maximumValue.root =
                new Node(1,
                        new Node(7, new Node(30), null), new Node(10,
                                new Node(20),
                                new Node(5)));
        assertEquals(30, (int) MaximumValue.findMaximumValue(maximumValue));

        maximumValue.root.value = 1000;
        assertEquals(1000, (int) MaximumValue.findMaximumValue(maximumValue));
    }
>>>>>>> main
}