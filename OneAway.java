import java.util.Scanner;

public class OneAway {

    public static boolean isOneAway(String s1, String s2) {
        String first = s1.length() < s2.length() ? s1 : s2;
        String second = s2.length() < s1.length() ? s2: s1;
        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;
        while(index1 < first.length() && index2 < second.length()) {
            if(first.charAt(index1) != second.charAt(index2)){
                if(foundDifference)
                    return false;
                else
                    foundDifference = true;
                if(first.length() == second.length()){
                    index1++;
                    index2++;
                }else {
                    index2++;
                }
            }else {
                index1++;
                index2++;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String 1");
        String s1 = input.next();
        System.out.println("Enter String 2");
        String s2 = input.next();
        input.close();
        String outString = isOneAway(s1, s2) ? "One Away" : "not one away";
        System.out.println("The two strings are " + outString);
    }
}