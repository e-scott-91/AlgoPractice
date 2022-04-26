package arrays;

import java.util.Arrays;

public class BoatsToSavePeople {

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        if (people.length == 1){
            if (people[0] <= limit) return 1;
            else return 0;
        }

        int lp=0;
        int rp = people.length -1;
        int count = 0;

        while (lp <= rp) {
            if (people[lp] + people[rp] <= limit) {
                count++;
                lp++;
                rp--;
            } else {
                count++;
                rp--;
            }
        }

        return count;
    }
}
