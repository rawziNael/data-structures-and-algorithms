package hashtable;

import hashtable.structure.HashMap;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeftJoinTest{

    @Test
    public void testLeftJoin() {
        HashMap<String, String> first = new HashMap<>();
        first.add("fond", "enamored");
        first.add("wrath", "anger");
        first.add("diligent", "employed");
        first.add("outfit", "garb");
        first.add("guide", "usher");

        HashMap<String, String> second = new HashMap<>();
        second.add("fond", "averse");
        second.add("wrath", "delight");
        second.add("diligent", "idle");
        second.add("guide", "follow");
        second.add("flow", "jam");

        String[] array1 = {"enamored", "averse"};
        String[] array2 = {"anger", "delight"};
        String[] array3 = {"employed", "idle"};
        String[] array4 = {"garb", null};
        String[] array5 = {"usher", "follow"};

        HashMap<String, String[]> third = new HashMap<>();
        third = LeftJoin.leftJoin(first, second);
        assertEquals(5, third.getSize());
        assertFalse(third.contains("flow"));
        assertArrayEquals(array1, third.get("fond"));
        assertArrayEquals(array2, third.get("wrath"));
        assertArrayEquals(array3, third.get("diligent"));
        assertArrayEquals(array4, third.get("outfit"));
        assertArrayEquals(array5, third.get("guide"));
    }

}