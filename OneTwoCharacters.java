import java.util.Scanner;

/**
 * We have two special characters. The first character can be represented by one bit 0. The second character can be represented by two bits (10 or 11).
 * Now given a string represented by several bits. Return whether the last character must be a one-bit character or not. The given string will always end with a zero.
 * Example 1:
 * Input: bits = [1, 0, 0]
 * Output: True
 * Explanation: The only way to decode it is two-bit character and one-bit character. So the last character is one-bit character.
 */

public class OneTwoCharacters {
	static int[] bits;
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		String inputString = input.nextLine();
		String[] inputArray = inputString.split(" ");
		bits = new int[inputArray.length];
		for(int i = 0; i < inputArray.length; i++) {
			bits[i] = Integer.parseInt(inputArray[i]);
		}
		isOneBitCharacter(bits);
	}
	
	public static boolean isOneBitCharacter(int[] bits) {
        for(int i = 0; i < bits.length-2;){
            if(i == bits.length-1 && bits[i] == 0)
                return true;
                
            if(bits[i] == 1){
                i = i + 2;
            }else
                i++;
        }
        return false;
    }
}
