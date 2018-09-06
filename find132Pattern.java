import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class find132Pattern {
	private static int[] inputArray; 
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString = br.readLine();
		String[] input = inputString.split(" ");
		for(int i = 0; i < input.length; i++) {
			inputArray[i] = Integer.parseInt(input[i]);
		}
		
		System.out.println(find132Pattern(inputArray));
	}

	public static boolean find132Pattern(int[] nums) {
        for(int i = 0; i < nums.length - 2; i++){
            int ai = nums[i];
            int aj = Integer.MIN_VALUE;
           
            boolean dipPoint = false;
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] > aj){
                    aj = nums[j];
                }else{
                    dipPoint = true;
                }
                if(dipPoint){
                    if(nums[j] < aj && nums[j] > ai){
                        return true;
                    }
                }
    
            }
        }
        return false;
	}
}
