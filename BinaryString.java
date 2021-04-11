import java.util.Arrays;
import java.util.Scanner;

/**
 * Generate all the strings of n bits. Assume A[0..n – 1] is an array of size n.
 */
public class BinaryString {
    private static int[] BinaryString;
    public static void printBinaryStrings(int stringLength) {
        
        if(stringLength < 1) {
            System.out.println(Arrays.toString(BinaryString));
        }else {
            BinaryString[stringLength - 1] = 0;
            printBinaryStrings(stringLength - 1);
            BinaryString[stringLength - 1] = 1;
            printBinaryStrings(stringLength - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String Length...");
        int stringLength = input.nextInt();
        BinaryString = new int[stringLength];
        printBinaryStrings(stringLength);
        input.close();
    }
}