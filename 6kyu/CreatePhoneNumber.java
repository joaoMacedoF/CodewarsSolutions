
/* Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

Example
Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
The returned format must be correct in order to complete this challenge.

Don't forget the space after the closing parentheses! */


//My Solution

import java.util.Arrays;
public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
  
        String telNum = Arrays.toString(numbers).replaceAll("(^\\[|\\]$)", "");
        String telNum1 = telNum.replaceAll(",", "");
        String[] str = telNum1.split(" ");
        String first = "";
        String second = "";
        String third = "";
        for(int i = 0; i < str.length; i++) {
          first = "("+ str[0]+str[1]+str[2]+")";
          second = str[3]+str[4]+str[5];
          third = str[6]+str[7]+str[8]+str[9];
        }
        String last = first + " " + second + "-" + third;
        return last;
      }
}
