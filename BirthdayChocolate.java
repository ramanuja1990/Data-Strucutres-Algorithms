/**
Lily has a chocolate bar that she wants to share it with Ron for his birthday. Each of the squares has an integer on it. She decides to share a contiguous segment of the bar selected 
such that the length of the segment matches Ron's birth month and the sum of the integers on the squares is equal to his birth day. You must determine how many ways she can divide the chocolate.
Consider the chocolate bar as an array of squares, . She wants to find segments summing to Ron's birth day,  with a length equalling his birth month, . 
In this case, there are two segments meeting her criteria:  and .

Function Description

Complete the birthday function in the editor below. It should return an integer denoting the number of ways Lily can divide the chocolate bar.

birthday has the following parameter(s):

s: an array of integers, the numbers on each of the squares of chocolate
d: an integer, Ron's birth day
m: an integer, Ron's birth month
Input Format

The first line contains an integer , the number of squares in the chocolate bar. 
The second line contains  space-separated integers , the numbers on the chocolate squares where . 
The third line contains two space-separated integers,  and , Ron's birth day and his birth month.

Constraints

, where ()
Output Format

Print an integer denoting the total number of ways that Lily can portion her chocolate bar to share with Ron.

Sample Input 0
5
1 2 1 3 2
3 2
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class BirthdayChocolate {
		private static List<Integer> inputArray = new ArrayList<Integer>();
		
	/**
	 * 	if length of array is equal to number of bars, then add all the elements and check if sum is equal to d.
	 * Else for each element, add m consecutive elements' value, and check if sum is equal to d. If yes, increment output d by 1.
	 * @return output - It is the number of times the conditions are met.
	 */
	 static int birthday(List<Integer> s, int d, int m) {
	        int output = 0;
	        if(s.size() == m){
	            int barSum = 0;
	            for(int square = 0; square < m; square++){
	                barSum += s.get(square);
	            }
	            if(barSum == d){
	                output++;
	            }
	        }else{
	             for(int square = 0; square < s.size()- m + 1; square++){
	                int barSum = s.get(square);
	                for(int nextSquare = square+1; nextSquare < square + m; nextSquare++){
	                    barSum += s.get(nextSquare);
	                }
	                if(barSum == d){
	                    output++;
	                }
	            } 
	        }
	        return output;
	    }
	 
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int arrayLength = sc.nextInt();
		 int[] tempArray = new int[2];
		 for(int i = 0; i < arrayLength; i++) {
			 inputArray.add(sc.nextInt());
		 }
		 for(int j = 0; j < tempArray.length; j++) {
			 tempArray[j] = sc.nextInt();
		 }
		 int d = tempArray[0];
		 int m = tempArray[1];
		 System.out.println(birthday(inputArray, d, m));
	 }
}
