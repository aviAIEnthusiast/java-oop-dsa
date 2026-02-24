package algos;

public class BubbleSort {
    public static void sort(int[] arrInt) {

        if (arrInt == null || arrInt.length == 0) {
            System.err.println("INVALID INPUT");;
        }

        int n = arrInt.length;
        boolean swapped = false; // Flag to check if any swapping occurred
        for (int i = 0; i<n-1; i++) {
            for (int j = 0; j<n-1-i; j++) {
                
                if (arrInt[j] > arrInt[j+1]) {
                    int temp = arrInt[j+1];
                    arrInt[j+1] = arrInt[j];
                    arrInt[j] = temp;

                    swapped = true; // Set the flag to true if a swap occurred
                }
            }
            // If no two elements were swapped in the inner loop, then the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arrayToSort = {64, 34, 25, 12, 22, 11, 90};
        sort(arrayToSort);
        System.out.println("Sorted array: ");
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.print(arrayToSort[i] + " ");
        }
    }

}