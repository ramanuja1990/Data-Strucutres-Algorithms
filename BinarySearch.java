import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static int[] inputArray;
    public static int binarySearch(int[] inputArray, int findNum, int left, int right) {
        if(left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("Printing Mid " + mid);
            if(inputArray[mid] == findNum) {
                return mid;
            }
            if(inputArray[mid] > findNum) {
                return binarySearch(inputArray, findNum, left, mid - 1);
            }

            if(inputArray[mid] < findNum) {
               return binarySearch(inputArray, findNum, mid + 1, right);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter inputArray Length");
        int arrayLength = input.nextInt();
        inputArray  = new int[arrayLength];
        System.out.println("Enter Input Array...");
        for(int index = 0; index < arrayLength; index++) {
            inputArray[index] = input.nextInt();
        }
        System.out.println("\n Enter number to find");
        int findNum = input.nextInt();
        int numPosition = binarySearch(inputArray, findNum, 0, arrayLength - 1);
        System.out.println(Arrays.toString(inputArray));
        if(numPosition != -1) {
            System.out.println("Number " + findNum + " found at Postion " + numPosition);
        }else {
            System.out.println("Number " + findNum + " not found in the array");
        }
    }
}