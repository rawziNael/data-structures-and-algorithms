package hashtable;

import hashtable.structure.HashMap;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LeftJoinTest{

    @Test
    public void testLeftJoin() {

        LeftJoin leftJoin = new LeftJoin();

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

        List<String> list = new ArrayList<>();

        list.add(" [ " + "diligent" +  " , " + "employed"+ " , " + "idle"+ " ]  ");
        list.add(" [ " + "wrath" +  " , " + "anger"+ " , " + "delight"+ " ]  ");
        list.add(" [ " + "fond" +  " , " + "enamored"+ " , " + "averse"+ " ]  ");
        list.add(" [ " + "guide" +  " , " + "usher"+ " , " + "follow"+ " ]  ");
        list.add(" [ " + "outfit" +  " , " + "garb"+ " , " + "null"+ " ]  ");
        assertEquals(list,leftJoin.leftJoin(first,second));
    }

}