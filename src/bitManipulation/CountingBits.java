package bitManipulation;

public class CountingBits {

    public int[] countBits(int n) {
        int[] R = new int[n+1];
        if(n == 0) return R;

        for(int i=1;i<n+1;i++) {
            if(i%2 == 0) { // number is even
                R[i] = R[i/2];
            }
            else { // is odd
                R[i] = R[i-1] + 1;
            }
        }
        return R;
    }
}
