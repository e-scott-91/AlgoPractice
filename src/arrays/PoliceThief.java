package arrays;

import java.util.ArrayList;

public class PoliceThief {

    static int policeThief(char arr[], int n, int k)
    {
        int res = 0;
        ArrayList<Integer> thi = new ArrayList<>();
        ArrayList<Integer> pol = new ArrayList<>();

        // store indices in the ArrayList
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'P')
                pol.add(i);
            else if (arr[i] == 'T')
                thi.add(i);
        }

        // track lowest current indices of
        // thief: thi[l], police: pol[r]
        int l = 0, r = 0;
        while (l < thi.size() && r < pol.size()) {
            // can be caught
            if (Math.abs(thi.get(l++) - pol.get(r++)) <= k)
                res++;
                // increment the minimum index
            else if (thi.get(l) < pol.get(r))
                l++;
            else
                r++;
        }
        return res;
    }
}
