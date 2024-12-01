
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // Task 1 - Step 2: Sort array in descending order using a modified insertion sort.
        String fileName = "src/txtFiles/inputs.txt";
        int[] numbers = BackProcess.readInputFile(fileName);
        Integer[] comparableNumbers = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            comparableNumbers[i] = numbers[i];
        }
        InsertionSort.changedInsertionSort(comparableNumbers);

        if (numbers != null) {
            System.out.println("Array sorted in descending order: ");
            for (Comparable num : comparableNumbers) {

                System.out.print(num + " ");
            }
        } else {
            System.out.println("Array not read. Try Again.");
        }
        System.out.println(" ");

        // Task 1 - Step 3: Use the modified insertion sort algorithm to sort floats.
        float[] myFloatArray = {6.9f, 1.4f, 5.7f, 4.3f, 2.8f};

        InsertionSort.floatInsertionDescendingSort(myFloatArray);
        System.out.println(" ");
        System.out.println("Descending order, from right to left for float array:");

        if (myFloatArray != null) {
            for (float num : myFloatArray) {
                System.out.print(num + " ");
            }
        }
        else{
                System.out.println("Array not sorted. Try again.");
            }
        System.out.println(" ");

        // Task 1 - Step 4: Sort the array from file using Merge Sort in descending order.
        Integer[] array = {5, 3, 8, 6, 2};

        System.out.println("\nBefore Sort:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        MergeSort.descendingMergeSort.sortDescending(array);


        System.out.println("\nAfter Sort:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(" ");

        // Task 1 - Step 5: Create an array of Car objects.

        Car[] cars = new Car[10];
        cars[0] = new Car("Ford", "Mustang GT", 2015);
        cars[1] = new Car("Nissan", "GTR", 2024);
        cars[2] = new Car("Audi", "R8", 2017);
        cars[3] = new Car("BMW", "M3 GTR", 2005);
        cars[4] = new Car("Porsche", "GT3 RS", 2020);
        cars[5] = new Car("Ford", "Explorer", 2010);
        cars[6] = new Car("Mercedes-Benz", "C 180", 2019);
        cars[7] = new Car("Chevrolet", "Corvette", 2000);
        cars[8] = new Car("Aston Martin", "DB11", 2011);
        cars[9] = new Car("Togg", "T10X", 2022);

        // Task 1 - Step 6: Sort the cars with the modified QuickSort (in descending order)
        System.out.println("\nBefore QuickSort:");
        for (Car car : cars) {
            System.out.println(car.toString());
        }
        QuickSort.descendingQuickSort.sort(cars);

        System.out.println("\nAfter QuickSort:");
        for (Car car : cars) {
            System.out.println(car.toString());
        }


    }
        }


