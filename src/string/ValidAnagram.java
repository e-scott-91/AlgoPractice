package string;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        int[] counts = new int[26];

        for(char sChar : s.toCharArray()) {
            counts[sChar - 'a']++;
        }

        for(char tChar : t.toCharArray()) {
            if (counts[tChar - 'a'] <= 0){
                return false;
            } else {
                counts[tChar - 'a']--;
            }
        }

        for(int count : counts) {
            if(count != 0) return false;
        }

        return true;
    }
}
