package hashtable;

import hashtable.structure.HashMap;

import java.util.ArrayList;
import java.util.List;

public class LeftJoin{

    public static List<String> leftJoin(HashMap first , HashMap second) {
        List<String> list = new ArrayList<>();
        for(Object key : first.keys()){
            if(first.contains(key)){
                list.add(" [ " + key +  " , " + first.get(key)+ " , " + second.get(key)+ " ]  ");
            } else{
                list.add(" [ " + key + " , " + first.get(key) + " , " + null + " ]  ");
            }
        }
        return list;
    }
}
