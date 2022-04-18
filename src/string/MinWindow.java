package string;

import java.util.HashMap;
import java.util.Map;

public class MinWindow {

    public String minWindow(String s, String t) {

        int i=0,j=0;
        int minLength = Integer.MAX_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        String ans = "";

        for(int k=0;k<t.length();k++){
            if(map.containsKey(t.charAt(k))){
                map.put(t.charAt(k), map.get(t.charAt(k))+1);
            }else {
                map.put(t.charAt(k),1);
            }
        }

        int count = map.size();

        while(j<s.length()){

            char c = s.charAt(j);

            if(map.containsKey(c)){
                map.put(c, map.get(c)-1);
            }

            if(map.containsKey(c) && map.get(c)==0){
                count--;
            }

            if(count == 0){
                while(count == 0 && i<=j){

                    if((j-i+1) < minLength){
                        minLength = j-i+1;
                        ans = s.substring(i,j+1);
                    }


                    if(map.containsKey(s.charAt(i))){
                        map.put(s.charAt(i), map.get(s.charAt(i))+1);
                    }

                    if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) > 0){
                        count++;
                    }
                    i++;
                }
            }
            j++;

        }

        return ans;


    }
}
