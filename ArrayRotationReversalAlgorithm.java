import java.util.Scanner;

public class ArrayRotationReversalAlgorithm {
	private static int inputArray[];
	private static int arrayRotationLength = 3;
	
	/**
	 * Rotate Array using Reversal Algorithm
	 * Time Complexity: O(n)
	 */
	public static void leftRotateArray(int[] array, int rotationLength) {
		reverseArray(array, 0, rotationLength-1);
		reverseArray(array, rotationLength, array.length-1);
		reverseArray(array, 0, array.length-1);
	}
	
	/**
	 * Array Reversal using swapping
	 */
	public static void reverseArray(int[] array, int start, int end) {
		int temp;
		while(start < end) {
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void printArray(int[] array) {
		for(int i=0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the Array: ");
		int arrayLength = input.nextInt();
		inputArray = new int[arrayLength];
		System.out.println("Enter the elements of the Array");
		for(int arrayElement = 0; arrayElement < arrayLength; arrayElement++) {
			inputArray[arrayElement] = input.nextInt();
		}
		
		leftRotateArray(inputArray, arrayRotationLength);
		System.out.println("Array after rotation: ");
		printArray(inputArray);

	}
}
