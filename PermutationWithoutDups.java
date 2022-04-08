import java.util.*;
class PermutationWithoutDups {

    /**
        P(a1a2) = a1 + P(a2)
        P(a1a2a3) = {a1 + P(a2a3)} + {a2 + P(a1a3)} + {a3 + P(a1a2)}
     */
    public static ArrayList<String> getPermsM2(String input){
        if(input == null){
            return null;
        }
        ArrayList<String> perm = new ArrayList<String>();
        if(input.length() == 0){
            perm.add("");
            return perm;
        }
        for(int i = 0; i < input.length(); i++){
            //Remove Char i and find remaining Permutation
            char first = input.charAt(i);
            String remainder = input.substring(0,i) + input.substring(i+1);
            ArrayList<String> partials = getPermsM2(remainder);
            //Prepend char i for all permutations
            for(String s : partials){
                perm.add(first + s);
            }
        }
        return perm;
    }

    /**
        P(a1) = a1
        P(a1a2) = a1a2 & a2a1
     */
    public static ArrayList<String> getPerms(String input){
        if(input == null){
            return null;
        }
        ArrayList<String> output = new ArrayList<String>();
        if(input.length() == 0){
            output.add("");
            return output;
        }
        char first = input.charAt(0);
        String remainder = input.substring(1);
        ArrayList<String> words = getPerms(remainder);
        for(String word: words){ //[bc, cb]
            for(int i = 0; i <= word.length(); i++){  //[abc, bac, bca, acb, cab, cba]
                String s = word.substring(0, i) + first + word.substring(i);
                output.add(s);
            }
        }
        return output;
    }

    public static void main(String[] args){
        String input = "abc";
        ArrayList<String> out = getPerms(input);
        for(String s : out){
            System.out.print(s + " ");
        }
        System.out.println();
        ArrayList<String> out2 = getPermsM2(input);
        for(String s : out2){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}