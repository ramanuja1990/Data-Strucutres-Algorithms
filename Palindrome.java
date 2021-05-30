import java.util.Scanner;

//Check if string is permutable Palindrome

class Palindrome {

    public static boolean permPalindromeMethodOne(String inputString) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        int countOdd = 0;
        for(char c : inputString.toCharArray()) {
            int x = c - 'a';
            table[x]++;
            if(table[x] % 2 == 1)
                countOdd++;
            else
                countOdd--;
        }
        return countOdd <= 1;
    }

    public static boolean permPalindromeMethodTwo(String inputString){
        /**
         * If One bit is 1 0001000
         * 00010000 - 00000001 = 00001111
         * 00010000 & 00001111 = 0
         */
        int bitVector = 0;
        for(char c: inputString.toCharArray()){
            int mask = 1 << (Character.getNumericValue(c) - Character.getNumericValue('a'));
            if((bitVector & mask) == 0) {
                bitVector |= mask;
            }else {
                bitVector &= ~mask;
            }
        }
        return (bitVector & (bitVector - 1)) == 0; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A String: ");
        String inputString = input.nextLine();
        input.close();
        System.out.println("The  URLified string is " + permPalindromeMethodOne(inputString));
        System.out.println("The  URLified string is " + permPalindromeMethodTwo(inputString));
    }
}