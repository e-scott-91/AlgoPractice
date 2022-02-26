import binarySearch.SearchAndReturnIndex;

public class AlgorithmPractice {

    public static void main(String[] args) {
        AddingNumbersList instance = new AddingNumbersList();
        SearchAndReturnIndex bs = new SearchAndReturnIndex();
        instance.addTwoNumbers();
        int[] input = new int[]{-1,2,4,5,7,9,10};
        bs.search(input, 7);

    }


}
