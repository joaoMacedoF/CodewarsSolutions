/* 
Complete the method/function so that it converts dash/underscore delimited words into camel casing. 
The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).
 The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior" */

//My Solution

public class ConvertStringToCamelCase {
    public static String toCamelCase(String s){
        String s1;
        if(s.contains("-")) {
          String[] string = s.split("-");
          for(int i = 0; i < string.length-1; i++) {
                string[i+1]=string[i+1].substring(0,1).toUpperCase() + string[i+1].substring(1).toLowerCase();
                
                }
          return s = String.join("", string).trim();
              }   
        if(s.contains("_")) {
          String[] string = s.split("_");
          for(int i = 0; i < string.length-1; i++) {
            string[i+1]=string[i+1].substring(0,1).toUpperCase() + string[i+1].substring(1).toLowerCase();
              }
          return s = String.join("", string).trim();
      }  
        return s1 = s;
    }
}
