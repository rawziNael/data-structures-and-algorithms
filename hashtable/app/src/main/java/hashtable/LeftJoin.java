package hashtable;

import hashtable.structure.HashMap;

public class LeftJoin{

    public static HashMap<String, String[]> leftJoin(HashMap<String, String> first, HashMap<String, String> second) {
        HashMap<String, String[]> result = new HashMap<>();
        for (String key : first.keys()) {
            String[] str = new String[2];
            str[0] = first.get(key);
            str[1] = second.contains(key) ? second.get(key) : null;
            result.add(key, str);
        }
        return result;
    }
}
