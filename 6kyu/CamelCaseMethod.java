/* 
Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or camelCase in Java) for strings. 
All words must have their first letter capitalized without spaces.

For instance:

camelCase("hello case"); // => "HelloCase"
camelCase("camel case word"); // => "CamelCaseWord"
Don't forget to rate this kata! Thanks :) */


//My Solution

public class CamelCaseMethod {

    public static String camelCase(String str) {
      if(str.contentEquals("")) {
        return "";
      }
        String[] string = str.trim().split(" +");
        for(int i = 0; i < string.length; i++) {
          string[i]=string[i].substring(0,1).toUpperCase() + string[i].substring(1).toLowerCase();
        }

        return str = String.join("", string).trim();
    }

}