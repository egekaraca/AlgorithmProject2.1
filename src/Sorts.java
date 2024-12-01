

public class Sorts {
    static void floatExch(float[] a, int i, int j) {
        //--------------------------------------------------------
        // Summary: Swaps two elements in a float array.
        // Precondition: The indices 'i' and 'j' are valid indices within the array 'a'.
        // Postcondition: The elements at indices 'i' and 'j' are swapped in the array 'a'.
        //--------------------------------------------------------
        float temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }


    static void exch(Comparable[] a, int i, int j) {
        //--------------------------------------------------------
        // Summary: Swaps two elements in a Comparable array.
        // Precondition: The indices 'i' and 'j' are valid indices within the array 'a'.
        // Postcondition: The elements at indices 'i' and 'j' are swapped in the array 'a'.
        //--------------------------------------------------------
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


    static boolean great(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }
}
