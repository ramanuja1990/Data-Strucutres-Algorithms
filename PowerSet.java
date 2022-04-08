import java.util.*;
import java.util.Scanner;

class PowerSet {

    public ArrayList<ArrayList<String>> dpOne(ArrayList<String> input, ArrayList<ArrayList<String>> output, int index){
        if(index == input.size()){
            return output;
        }
        ArrayList<ArrayList<String>> subset = new ArrayList<ArrayList<String>>();
        ArrayList<String> temp = new ArrayList<String>();
        if(index != -1){
            subset = new ArrayList<ArrayList<String>>();
            for(int i = 0; i < output.size(); i++){
                temp = new ArrayList<String>();

                temp.addAll(output.get(i));
                
                temp.add(input.get(index));
                subset.add(temp);
            }  
        }else {
            subset.add(temp);
        }
        output.addAll(subset);
        return dpOne(input, output, index+1);
    }
    public static void main(String[] args){
        ArrayList<String> input = new ArrayList<String>();
        input.add("a1");
        input.add("a2");
        input.add("a3");
        PowerSet m1 = new PowerSet();
        ArrayList<ArrayList<String>> outArray= new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> output = m1.dpOne(input, outArray, -1);
        for(ArrayList<String> a : output){
            for(String b : a){
                System.out.print(b);
            }
            System.out.println();
        }
    }
}