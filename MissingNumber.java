/**
 * Find the Missing Number
You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in list. One of the integers is missing in the list. Write an efficient code to find the missing integer.
 */

package recursion;

public class MissingNumber {

	public static void main(String args[]) 
    { 
        int a[] = {1,2,4,5,6}; 
        int miss = getMissingNo(a,5); 
        System.out.println(miss);    
    } 
	
	public static int getMissingNo(int[] arr, int n) {
		int sum = 0;
		int total = (n+1) * (n+2) / 2;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return total-sum;
	}
}
