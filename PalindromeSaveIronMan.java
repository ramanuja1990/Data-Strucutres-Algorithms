/**
 * Jarvis is weak in computing palindromes for Alphanumeric characters.
While Ironman is busy fighting Thanos, he needs to activate sonic punch but Jarvis is stuck in computing palindromes.
You are given a string containing the alphanumeric character. Find whether the string is palindrome or not.
If you are unable to solve it then it may result in the death of Iron Man.

Input:
The first line of the input contains t, the number of test cases. Each line of the test case contains string 'S'.

Output:
Each new line of the output contains "YES" if the string is palindrome and "NO" if the string is not a palindrome.

Constraints:
1<=t<=100
1<=|S|<=100000
Note: Consider alphabets and numbers only for palindrome check. Ignore symbols and whitespaces.

Example:
Input:
2
I am :IronnorI Ma, i
Ab?/Ba

Output:
YES
YES
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class PalindromeSaveIronMan {
	private static String[] testCaseArray;

	/**
	 * Each Alphanumeric characters are considered and compared with the respective characters from the end of the string.
	 * If they are found same, it is a Palindrome
	 * 
	 * @param testCaseString - Input String
	 * @return YES or NO
	 */
	public static String isPalindrome(String testCaseString) {
		int start = 0;
		int end = testCaseString.length()-1;
		testCaseString = testCaseString.toUpperCase();
		while(start < end) {
			if(Character.isAlphabetic(testCaseString.charAt(start)) || Character.isDigit(testCaseString.charAt(start))) {
				if(Character.isAlphabetic(testCaseString.charAt(end)) || Character.isDigit(testCaseString.charAt(end))) {
					if(testCaseString.charAt(start) != testCaseString.charAt(end)) {
						return "NO";
						
					}else {
						start++;
						end--;
					}
				}else {
					end--;
				}
			}else {
				start++;
			}
			
		}
		return "YES";
	}


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int totalTestCases = Integer.parseInt(input.nextLine());
		testCaseArray = new String[totalTestCases];
		for(int testCase = 0; testCase < 2; testCase++) {
			testCaseArray[testCase] = input.nextLine();
		}
		
		for(int testCase = 0; testCase < totalTestCases; testCase++) {
			System.out.println(isPalindrome(testCaseArray[testCase]));
			
		}
	}
}
