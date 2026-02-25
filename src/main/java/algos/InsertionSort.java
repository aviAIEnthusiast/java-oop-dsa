package algos;

public class InsertionSort {
    public static void sort(int[] arrInt) {

        if (arrInt == null || arrInt.length == 0) 
            System.err.println("INVALID INPUT");

        int n = arrInt.length;

        for (int i = 0; i < n; i++) {
            int j = i;

            while (j >= 1 && arrInt[j] < arrInt[j-1]) {
                int tmp = arrInt[j-1];
                arrInt[j-1] = arrInt[j];
                arrInt[j] = tmp;
                j = j-1;
            }
        }
    }


public static void main(String[] args) {
    int[] arrayToSort = {3, 2, 7, 4, 1};
    sort(arrayToSort);
    System.out.println("Sorted array: ");
    for (int i = 0; i < arrayToSort.length; i++) {
        System.out.print(arrayToSort[i] + " ");
    }
}
}