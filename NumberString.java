import java.util.Arrays;
import java.util.Scanner;

/**
 * K Array string of length n
 * T(n) = O(k pow n)
 */
public class NumberString {
    public static int[] KArrayString;
    public static void NumberString(int stringLength, int numbers) {
        if(stringLength < 1) {
            System.out.println(Arrays.toString(KArrayString));
        }else {
            for(int i = 0; i < numbers; i++) {
                KArrayString[stringLength - 1] = i;
                NumberString(stringLength - 1, numbers);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String Length");
        int stringLength = input.nextInt();
        System.out.println("Enter Numbers Array");
        int numbers = input.nextInt();
        KArrayString = new int[stringLength];
        NumberString(stringLength, numbers);
        input.close();
    }
}