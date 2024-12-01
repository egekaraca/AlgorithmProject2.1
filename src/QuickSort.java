
public class QuickSort {
    class quickSort {
        // Summary: Sorts an array in ascending order using the QuickSort algorithm.
        // The algorithm works by selecting a pivot element, partitioning the array into two subarrays,
        // and recursively sorting the subarrays.
        // Precondition: The array 'a' contains Comparable elements.
        // Postcondition: The array is sorted in ascending order.
        //--------------------------------------------------------
        public static void sort(Comparable[] a) {
            StdRandom.shuffle(a);
            sort(a, 0, a.length - 1);
        }

        private static void sort(Comparable[] a, int lo, int hi) {
            //--------------------------------------------------------
            // Summary: Recursively partitions the array around a pivot element and sorts the subarrays.
            // Precondition: The array 'a' contains Comparable elements.
            // Postcondition: The array is sorted in ascending order.
            //--------------------------------------------------------
            if (hi <= lo) {
                return;
            }
            int j = partition(a, lo, hi);
            sort(a, lo, j - 1);
            sort(a, j + 1, hi);
        }

        private static int partition(Comparable[] a, int lo, int hi) {
            //--------------------------------------------------------
            // Summary: Partitions the array into two subarrays around a pivot element. Elements less than the pivot
            // are placed on the left, and elements greater than the pivot are placed on the right.
            // Precondition: The array 'a' contains Comparable elements, and indices 'lo' and 'hi' are valid.
            // Postcondition: Returns the index of the pivot element after partitioning.
            //--------------------------------------------------------
            int i = lo, j = hi + 1;
            Comparable v = a[lo];
            while (true) {
                while (Sorts.less(a[++i], v)) if (i == hi) break;
                while (Sorts.less(v, a[--j])) if (j == lo) break;
                if (i >= j) break;
                Sorts.exch(a, i, j);
            }
            Sorts.exch(a, lo, j);
            return j;
        }

    }

     class descendingQuickSort {
         // Summary: Sorts an array in descending order using the QuickSort algorithm.
         // This version of QuickSort uses a custom comparator to sort the elements in descending order.
         // Precondition: The array 'a' contains Comparable elements.
         // Postcondition: The array is sorted in descending order.
         //--------------------------------------------------------
        public static void sort(Comparable[] a) {
            StdRandom.shuffle(a);
            sort(a, 0, a.length - 1);
        }

        private static void sort(Comparable[] a, int lo, int hi) {
            if (hi <= lo) {
                return;
            }
            int j = partition(a, lo, hi);
            sort(a, lo, j - 1);
            sort(a, j + 1, hi);
        }
        private static int partition(Comparable[] a, int lo, int hi) {
            int i = lo, j = hi + 1;
            Comparable v = a[lo];

            while (true) {

                while (greater(a[++i], v)) if (i == hi) break;
                while (greater(v, a[--j])) if (j == lo) break;

                if (i >= j) break;
                exch(a, i, j);
            }
            exch(a, lo, j);
            return j;
        }
        private static boolean greater(Comparable v, Comparable w) {
            return v.compareTo(w) > 0;
        }

        private static void exch(Comparable[] a, int i, int j) {
            Comparable temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        public static void main(String[] args) {
            Integer[] array = {1,2,3,4,8,10};

            System.out.println("Before Sort:");
            for (int val : array) {
                System.out.print(val + " ");
            }

            descendingQuickSort.sort(array);

            System.out.println("\nAfter Sort:");
            for (int val : array) {
                System.out.print(val + " ");
            }
        }





    }

}
