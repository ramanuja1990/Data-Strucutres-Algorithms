import java.util.Arrays;
import java.util.Scanner;

public class Permutation {
    
    boolean isPermutable(String inputOne, String inputTwo) {
        boolean response = true;
        if(inputOne.length() != inputTwo.length()) {
            response = false;
        }else {
            int[] letters = new int[128];
            for(int i = 0; i < inputOne.length(); i++){
                letters[inputOne.charAt(i)]++;
            }
            for(int i = 0; i < inputTwo.length(); i++){
                letters[inputTwo.charAt(i)]--;
                if(letters[inputTwo.charAt(i)] < 0) {
                    response = false;
                    break;
                }
            }
        }
        return response;
    }

    String sort(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }


    boolean isPermutableMethodTwo(String inputOne, String inputTwo) {
        if(inputOne.length() != inputTwo.length()) {
            return false;
        }
        inputOne = this.sort(inputOne);
        inputTwo = this.sort(inputTwo);
        return inputOne.equals(inputTwo);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First String");
        String s1 = input.nextLine();
        System.out.println("Enter Second String");
        String s2 = input.nextLine();
        Permutation p  = new Permutation();
        boolean result = p.isPermutable(s1, s2);
        input.close();
        System.out.println(result);
        boolean resultTwo = p.isPermutableMethodTwo(s1, s2);
        System.out.println(resultTwo);
    }
}