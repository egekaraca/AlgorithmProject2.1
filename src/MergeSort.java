
public class MergeSort {

    public class mergeSort {
        private static Comparable[] aux;

        public static void sort(Comparable[] a){
            aux = new Comparable[a.length];
            sort(a, 0, a.length-1);
        }
        private static void merge(Comparable[] a, int lo, int mid, int hi) {
            //--------------------------------------------------------
            // Summary: Merges two sorted halves of the array into a single sorted array.
            // The merge step compares elements from both halves and arranges them
            // into the correct order. It is used in both ascending and descending sorts.
            // Precondition: The array is divided into two sorted halves.
            // Postcondition: Merges the two sorted halves into a single sorted array.
            //--------------------------------------------------------

            for (int k = lo; k <= hi; k++) {
                aux[k] = a[k];
            }

            int i = lo, j = mid + 1;
            for (int k = lo; k <= hi; k++) {
                if (i > mid) a[k] = aux[j++];
                else if (j > hi) a[k] = aux[i++];
                else if (Sorts.less(aux[j], aux[i])) a[k] = aux[j++];
                else a[k] = aux[i++];
            }
        }

        private static void sort(Comparable[] a, int lo, int hi){
            //--------------------------------------------------------
            // Summary: Recursively divides the array and merges the halves using the merge function.
            // This method uses the merge function to sort the array.
            // Precondition: The array is divided into subarrays.
            // Postcondition: The array is sorted either in ascending or descending order based on the boolean flag.
            //--------------------------------------------------------
            if(hi <= lo) return;
            int mid = lo + (hi - lo) / 2;
            sort(a, lo, mid);
            sort(a, mid+1, hi);
            merge(a, lo, mid, hi);
        }

    }

    public static class descendingMergeSort {
        private static Comparable[] aux;

        public static void sortDescending(Comparable[] a) {
            //--------------------------------------------------------
            // Summary: Calls the sorting method with the flag for descending sort.
            // Precondition: The array contains Comparable elements.
            // Postcondition: The array is sorted in descending order.
            //--------------------------------------------------------
            aux = new Comparable[a.length];
            sort(a, 0, a.length - 1);
        }

        private static void merge(Comparable[] a, int lo, int mid, int hi) {

            for (int k = lo; k <= hi; k++) {
                aux[k] = a[k];
            }

            int i = lo, j = mid + 1;
            for (int k = lo; k <= hi; k++) {
                if (i > mid) a[k] = aux[j++];
                else if (j > hi) a[k] = aux[i++];
                else if (Sorts.great(aux[j], aux[i])) a[k] = aux[j++];
                else a[k] = aux[i++];
            }
        }

        private static void sort(Comparable[] a, int lo, int hi) {
            if (hi <= lo) return;
            int mid = lo + (hi - lo) / 2;
            sort(a, lo, mid);
            sort(a, mid + 1, hi);
            merge(a, lo, mid, hi);
        }




    }

}
