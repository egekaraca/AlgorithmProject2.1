
public class BubbleSort {
    static void bubbleSort(int[] arr, int n) {
        //--------------------------------------------------------
        // Summary: Sorts an array of integers using the Bubble Sort algorithm.
        // The algorithm repeatedly steps through the list, compares adjacent elements,
        // and swaps them if they are in the wrong order. The process is repeated until the array is sorted.
        // Precondition: The array 'arr' contains integer elements and 'n' is the size of the array.
        // Postcondition: The array 'arr' is sorted in ascending order.
        //--------------------------------------------------------
        int i, j, temp;
        boolean checkSwapping;
        for (i = 0; i < n - 1; i++) {
            checkSwapping = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    checkSwapping = true;
                }
            }
            if (checkSwapping == false) {
                break;
            }
        }

    }
}
