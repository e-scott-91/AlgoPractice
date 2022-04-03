import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs =new HashSet<>();
        for(int e :nums){
            if(!hs.add(e)){
                return true;
            }
        }
        return false;
    }
}
