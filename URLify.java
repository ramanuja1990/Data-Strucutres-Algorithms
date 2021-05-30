//Replace spaces with %20
import java.util.Scanner;

class URLify {
    public static String urlify(String inputString) {
        long start = System.nanoTime();
        int spaceCount = 0;
        for(int i = 0; i < inputString.length(); i++) {
            if(inputString.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        char str[] = new char[inputString.length() + (spaceCount * 2)];
        int j = 0;
        for(int index = 0; index < inputString.length(); index ++) {
            if(inputString.charAt(index) == ' ') {
               str[j] = '%';
               str[j+1] = '2';
               str[j+2] = '0';
               j += 3;
            }else {
                str[j] = inputString.charAt(index);
                j++;
            }
        }
        long end = System.nanoTime();
        System.out.println("Method 1 Time: " + (end - start));
        return String.valueOf(str);
    }
    
    public static String urlifyTwo(String inputString) {
        long start = System.nanoTime();
        StringBuilder str = new StringBuilder();
        for(int index = 0; index < str.length(); index++) {
            if(inputString.charAt(index) == ' ') {
                str.append("%20");
            }else {
                str.append(inputString.charAt(index));
            }
        }
        long end = System.nanoTime();
        System.out.println("Method 2 Time: " + (end - start));
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A String: ");
        String inputString = input.nextLine();
        input.close();
        System.out.println("The  URLified string is " + urlifyTwo(inputString));
        System.out.println("The  URLified string is " + urlify(inputString));
        
    }
}