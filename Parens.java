import java.util.*;

/**
    P(()) = ()
    P(()()) = () + P(());

   */
class Parens {

  public static HashSet<String> getParens(int n) {
    HashSet<String> output = new HashSet<String>();
    if (n == 0) {
      output.add("");
      return output;
    }

    String prefix = "()";
    HashSet<String> partials = getParens(n - 1);
    for (String s : partials) {
      for (int j = 0; j <= s.length(); j++) {
        String first = s.substring(0, j);
        String last = s.substring(j);
        output.add(first + prefix + last);
      }
    }
    return output;
  }

  public static void main(String[] args) {
    int n = 3;
    HashSet<String> output = getParens(n);
    for (String s : output) {
      System.out.print(s + " ");
    }
    System.out.println();
  }
}
