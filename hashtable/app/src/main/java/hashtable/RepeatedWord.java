package hashtable;

import hashtable.structure.HashMap;


public class RepeatedWord {

    public static String findRepeat(String str) {

        String[] words = str.toLowerCase()
                .replaceAll("[^a-z ]", "")
                .split(" ");
        HashMap<String , String> seenWords = new HashMap();
        for (String word : words) {
            if (seenWords.contains(word)) {
                return word;
            } else {
                seenWords.add(word , word);
            }
        }
        return "No repeating words";
    }

}
