/* Write a program to determine if a string contains only unique characters. Return true if it does and false otherwise.

The string may contain any of the 128 ASCII characters. Characters are case-sensitive, e.g. 'a' and 'A' are considered different characters. */

//My Solutions

public class AllUnique {
    public static boolean hasUniqueChars(String str) {
      for (int i = 0; i < str.length(); i++) {
        for(int j = i+1; j < str.length(); j++) {
          if(str.charAt(i) == str.charAt(j)) {
            return false;
          }
        }
      }
      return true;
    }
}