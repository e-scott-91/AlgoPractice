package string;

public class CharacterReplacement {

    public int characterReplacement(String s, int k) {
        int N = s.length();
        int max_length = 0;
        int windowStart = 0;
        int max_count = 0;
        int[] charCount = new int[26];

        for (int windowEnd=0; windowEnd < s.length(); windowEnd++){
            charCount[s.charAt(windowEnd) - 'A']++;
            max_count = Math.max(max_count, charCount[s.charAt(windowEnd) - 'A']);

            while (windowEnd - windowStart - max_count + 1 > k) {
                charCount[s.charAt(windowStart) - 'A']--;
                windowStart++;
            }

            max_length = Math.max(max_length, windowEnd - windowStart +1);

        }

        return max_length;
    }

}
