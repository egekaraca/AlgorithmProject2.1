
public class InsertionSort {
    static void insertionSort(Comparable[] a) {
        //--------------------------------------------------------
        // Summary: Sorts an array in ascending order using the Insertion Sort algorithm.
        // The algorithm builds the sorted array one element at a time, inserting each element
        // into its correct position relative to the already sorted part of the array.
        // Precondition: 'a' is a non-null array of Comparable elements.
        // Postcondition: The array 'a' is sorted in ascending order.
        //--------------------------------------------------------
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && Sorts.less(a[j], a[j - 1]); j--) {
                Sorts.exch(a, j, j - 1);

            }
        }
    }

    static void floatInsertionDescendingSort(float[] a) {
        //--------------------------------------------------------
        // Summary: Sorts an array of floats in descending order using the Insertion Sort algorithm.
        // This method is specifically for sorting float arrays in descending order.
        // Precondition: 'a' is a non-null array of float values.
        // Postcondition: The array 'a' is sorted in descending order.
        //--------------------------------------------------------
        for (int i = 1; i < a.length; i++) {
            for(int j = i; j > 0 && Sorts.great(a[j], a[j - 1]); j--) {
                Sorts.floatExch(a,j,j-1);
            }
        }

    }

    // Task 1 - Step 2 : Insertion Sort From Descending Order.
    public static void changedInsertionSort(Comparable[] a) {
        //--------------------------------------------------------
        // Summary: Sorts an array in descending order using an Insertion Sort-like approach.
        // This method sorts arrays of Comparable elements in descending order, using the `great` comparison.
        // Precondition: 'a' is a non-null array of Comparable elements.
        // Postcondition: The array 'a' is sorted in descending order.
        //--------------------------------------------------------
            int n = a.length;
            for (int i = 1; i < n; i++) {
                for (int j = i; j > 0 && Sorts.great(a[j], a[j - 1]); j--) {
                    Sorts.exch(a, j, j - 1);
                }
            }
        }

}
