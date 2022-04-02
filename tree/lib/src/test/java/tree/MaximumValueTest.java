package tree;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumValueTest{
    @Test
    public void testFindMaximumValue() {
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
}