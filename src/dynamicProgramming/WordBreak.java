package dynamicProgramming;

import java.util.Arrays;
import java.util.List;

public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        int size = s.length();
        boolean[] dp = new boolean[size +1];

        Arrays.fill(dp, false);
        dp[0] = true;

        for (int i= 0; i <= size; i++){
            for (int j=0; j< i; j++){
                if (dp[j] == true && wordDict.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[size];
    }

}
