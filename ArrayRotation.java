import java.util.Scanner;

public class ArrayRotation {
	private static int inputArray[];
	private static int arrayRotationLength = 3;
	
	/**
	 * <p> Method to Left Rotate the input array</p>
	 * <p> Time Complexity : O(n * arrayRotationLength) </p>
	 * <p> Space Complexity: O(1)
	 */
	public static void leftRotateArray(int[] array, int rotationLength) {
		for(int i = 0; i < rotationLength; i++) {
			int tempArray = array[0];
			for(int j = 0; j < (array.length - 1); j++) {
				array[j] = array[j+1];
			}
			array[(array.length-1)] = tempArray;
		}
	}
	
	/**
	 * <p> Method to Right Rotate the input array</p>
	 * <p> Time Complexity : O(n * arrayRotationLength) </p>
	 * <p> Space Complexity: O(1)
	 */
	public static void rightRotateArray(int[] array, int rotationLength) {
		for(int i = 0; i < rotationLength; i++) {
			int tempArray = array[(array.length-1)];
			for(int j =  (array.length - 1); j >0 ; j--) {
				array[j] = array[j-1];
			}
			array[0] = tempArray;
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
		rightRotateArray(inputArray, arrayRotationLength);
		System.out.println("Array after rotation: ");
		printArray(inputArray);
	}
	



}
