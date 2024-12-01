
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class BackProcess {

    // Task 1 - Step 1: Read Array From File.
    public static int[] readInputFile(String fileName) throws IOException {
        //--------------------------------------------------------
        // Summary: Reads an array from a file where the first line
        // contains the array size, followed by array elements.
        // Precondition: The file exists, and the first line contains
        // a valid integer for the array size, followed by the array elements.
        // Postcondition: Returns an integer array populated with the data from the file.
        //--------------------------------------------------------
        int[] intArray = null;
        BufferedReader inputFile = new BufferedReader(new FileReader(fileName));
        String line = inputFile.readLine();
        while (line != null) {
            int arraySize = Integer.parseInt(line.trim());
            intArray = new int[arraySize];

            int lineNumber = 0;
            while ((line = inputFile.readLine()) != null && lineNumber < arraySize) {
                intArray[lineNumber] = Integer.parseInt(line.trim());
                lineNumber++;
            }
        }

        return intArray;
    }

    String fileName = "src/txtFiles/inputs.txt";

}


