package string;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    class Anagram {
        private final String originalWord;
        private final char[] sortedChars;

        Anagram(String word) {
            this.originalWord = word;
            sortedChars = word.toCharArray();
            Arrays.sort(sortedChars);
        }

        @Override
        public boolean equals(Object o) {
            Anagram anagram = (Anagram) o;
            return Arrays.equals(anagram.sortedChars, sortedChars);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(sortedChars);
        }
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 1) {
            //actual
            //return List.of(List.of(strs[0]));
        }

        Map<Anagram, List<String>> map = new HashMap<>();

        for (String str : strs) {
            Anagram a = new Anagram(str);
            if (map.containsKey(a)) {
                map.get(a).add(str);
            } else {
                map.put(a, new ArrayList<String>() {{add(str);}});
            }
        }

        return new ArrayList<>(map.values());
    }

}
