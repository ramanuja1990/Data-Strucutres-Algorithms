import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
  
	public static void main(String[] args) {
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("A");
		aList.add("B");
		aList.add("C");
		aList.add("A");
		
		System.out.println(aList);
		aList.remove("A");
		System.out.println(aList);
	}

}
