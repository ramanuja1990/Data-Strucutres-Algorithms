import java.util.Scanner;

public class StringCompression {
    
    public static String compressedString(String inputString){
        StringBuilder compressedString = new StringBuilder();
        int consecutiveCount = 1;
        char prevChar = inputString.charAt(0);
        for(int index = 1; index < inputString.length(); index++){
            if(inputString.charAt(index) != prevChar) {
                compressedString.append(prevChar);
                compressedString.append(consecutiveCount);
                consecutiveCount = 1;
                prevChar = inputString.charAt(index);
            }else {
                consecutiveCount++;
            }
        }
        compressedString.append(prevChar);
        compressedString.append(consecutiveCount);
        return compressedString.toString();
    }

    public static String compressedStringTwo(String inputString) {
        StringBuilder compressedString = new StringBuilder();
        int consecutiveCount = 0;
        for(int index = 0; index < inputString.length(); index++){
            consecutiveCount++;
            if((index + 1)  >= inputString.length() || 
                inputString.charAt(index) != inputString.charAt(index + 1)){
                    compressedString.append(inputString.charAt(index));
                    compressedString.append(consecutiveCount);
                    consecutiveCount = 0;
            }
        }
        return compressedString.toString();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A String: ");
        String inputString = input.nextLine();
        input.close();
        System.out.println("Compressed string is: " + compressedString(inputString));
        System.out.println("Compressed string is: " + compressedStringTwo(inputString));
    }
}