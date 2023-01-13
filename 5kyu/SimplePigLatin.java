/* Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.

Examples
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway ! */


//My solution

public class SimplePigLatin {
    public static String pigIt(String str) {
      String[] st = str.split(" ");
      String s = str.replaceAll("[^\\w^\\s]", "");
      String[] s1 = s.split(" ");
      for(int i = 0; i < s1.length; i++) {
        s1[i] = s1[i].substring(1)+s1[i].substring(0,1) +"ay";
      }
      String fin = String.join(" ", s1);
      for(int i = 0 ; i < st.length; i++) {
        if(st[i].contains("!") || st[i].contains("?") || st[i].contains(".") || st[i].contains(",") || st[i].contains(";") 
              || st[i].contains(":") || st[i].contains("'") || st[i].contains("!") || st[i].contains("...") || st[i].contains("*") 
              || st[i].contains("-") || st[i].contains("_")) {
            fin = fin + " " + st[i];
            }
      }

        return fin;
    }
}