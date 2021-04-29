import java.util.Scanner;

public class IntegerPairs {
    static int[] inputArray;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int arrayLength = input.nextInt();
        inputArray = new int[arrayLength];
        System.out.println("Enter Input Array");
        for(int index = 0; index < arrayLength; index++) {
            inputArray[arrayLength] = input.nextInt();
        }
        System.out.println("Enter Pair Number");
        int pairNum = input.nextInt();
        input.close();

    }
}