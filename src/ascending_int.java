
import java.util.Scanner;

public class ascending_int {
    public static <n> void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input integers
        int[] intArray = new int[3];
        System.out.print("Please input 3 integers: ");
        intArray[0] = input.nextInt();
        intArray[1] = input.nextInt();
        intArray[2] = input.nextInt();

        // Bubble Sort
        int n = intArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (intArray[j] > intArray[j + 1]) {
                    // Change place
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }

        // Print out result
        System.out.println("Integers in ascending order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(intArray[i] + "\t");
        }
    }
}