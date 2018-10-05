package recursion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Recursion {
	public static List<List<Character>> aList = new ArrayList<List<Character>>();
	public static List<String> result = new ArrayList<String>();
	static String current = null;
	public static void main(String[] args) {
		List<Character> sublist1 = new ArrayList<Character>();
		List<Character> sublist2 = new ArrayList<Character>();
		List<Character> sublist3 = new ArrayList<Character>();
		
		sublist1.add('a');
		sublist1.add('b');
		sublist1.add('c');
		sublist2.add('d');
		sublist2.add('e');
		sublist2.add('f');
		sublist3.add('g');
		sublist3.add('h');
		sublist3.add('i');
		aList.add(sublist1);
		aList.add(sublist2);
		aList.add(sublist3);

		GeneratePermutations(aList, aList.size(), current);
		

		
	}
	
	static void GeneratePermutations(List<List<Character>> Lists, int depth, String current)
	{
//		Iterator<List<Character>> itr = Lists.iterator();
//		while(itr.hasNext()) {
//			List<Character> tempList = (List<Character>) itr.next();
//			System.out.println(tempList.get(0));
//		}
	    if(depth == Lists.size())
	    {
	    	
	       result.add(current);
	       System.out.println(current);
	       return;
	     }
	    
	    for(int i = 0; i < Lists.get(depth).size(); ++i)
	    {
	        GeneratePermutations(Lists, depth + 1, current + Lists.get(depth).get(i));
	    }

	}
}
