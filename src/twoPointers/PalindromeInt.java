package twoPointers;

public class PalindromeInt {

    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp = x;
        int rev = 0;
        while(x != 0){
            int mod = x%10;
            x = x/10;
            rev = (rev*10)+mod;
        }
        return temp == rev;
    }
}
