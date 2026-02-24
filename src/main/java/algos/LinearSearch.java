package algos;

public class LinearSearch {

    public static int linearSearch(int[] intArr, int searchKey) {
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == searchKey) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] intArr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int searchKey = 7;

        int result = linearSearch(intArr, searchKey);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
    
}
