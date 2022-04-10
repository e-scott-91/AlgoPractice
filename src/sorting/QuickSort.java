package sorting;

public class QuickSort {

    public void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    static int partition(int[] arr, int low, int high){
        int p = low, j;
        for(j=low+1; j <= high; j++)
            if(arr[j] < arr[low])
                swap(arr, ++p, j);

        swap(arr, low, p);
        return p;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swapTemp = array[index1];
        array[index1] = array[index2];
        array[index2] = swapTemp;
    }

}
