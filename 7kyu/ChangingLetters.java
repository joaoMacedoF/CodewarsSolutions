/* When provided with a String, capitalize all vowels

For example:

Input : "Hello World!"

Output : "HEllO WOrld!"

Note: Y is not a vowel in this kata. */

// My Solution

public class ChangingLetters {
    public static String swap(String st){
      StringBuilder sb = new StringBuilder();
      for(char ch : st.toCharArray()) {
        char t = Character.toUpperCase(ch);
        if(t == 'A' || t == 'E' || t == 'I' || t == 'O' || t == 'U') {
          sb.append(t);
        }else {
          sb.append(ch);
        }     
      }
     st = sb.toString();
     return st;
    }
}