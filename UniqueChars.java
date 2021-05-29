import java.util.Scanner;

public class UniqueChars {
    static boolean charSet[] = new boolean[128];
    public static String isUniqueSolutionOne(String inputString) {
        String response = "unique";
        for(int index = 0; index < ((inputString.length() / 2) - 1) ; index++) {
            if(charSet[inputString.charAt(index)] || charSet[inputString.charAt(inputString.length() - index - 1)]){
                response = "not unique";
                break;
            }else {
                charSet[inputString.charAt(index)] = true;
                charSet[inputString.charAt(inputString.length() - index - 1)] = true;
            }
        }
        return response;
    }
     
    public static String isUniqueSolutionTwo(String inputString) {
        String response = "unique";
        int checker = 0;
        for(int index = 0; index < inputString.length(); index++) {
            //0000 0000 0000 0001 
            int val = inputString.charAt(index) - 'a';
            if((checker & (1 << val)) > 0) {
                response = "not unique";
                break;
            }
            checker |= 1 << val;
        }
        return response;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A String: ");
        String inputString = input.next();
        input.close();
        //System.out.println("The string is " + isUniqueSolutionOne(inputString));
        System.out.println("The string is " + isUniqueSolutionTwo(inputString));
    }
}