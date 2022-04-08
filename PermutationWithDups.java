import java.util.*;

class PermutationWithDups {

  public static ArrayList<String> getPerms(
    HashMap<Character, Integer> input,
    int remaining
  ) {
    ArrayList<String> output = new ArrayList<String>();
    if (remaining == 0) {
      output.add("");
      return output;
    }
    for (char c : input.keySet()) {
      int count = input.get(c);
      if (count > 0) {
        input.put(c, count - 1);
        ArrayList<String> partials = getPerms(input, remaining - 1);
        input.put(c, count);  //Add back count so that original is not altered
        for (String s : partials) {
          output.add(c + s);
        }
      }
    }
    return output;
  }

  public static void main(String[] args) {
    String input = "aabc";
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for (char c : input.toCharArray()) {
      if (!map.containsKey(c)) {
        map.put(c, 0);
      }
      map.put(c, map.get(c) + 1);
    }
    ArrayList<String> out = getPerms(map, input.length());
    for (String s : out) {
      System.out.print(s + " ");
    }
    System.out.println();
  }
}
