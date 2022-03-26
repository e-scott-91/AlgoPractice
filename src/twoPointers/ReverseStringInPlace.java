package twoPointers;

public class ReverseStringInPlace {

    // With an input array of chars, reverse string without
    // any additional memory usage
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length -1;
        while (start <= end) {
            char firstValueToSwap = s[start];
            char secondValueToSwap = s[end];
            s[start] = secondValueToSwap;
            s[end] = firstValueToSwap;
            start++;
            end--;
        }
    }
}
