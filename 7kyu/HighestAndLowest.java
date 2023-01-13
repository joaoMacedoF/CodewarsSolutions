/* 
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Examples
highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
Notes
All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first. */

//My Solution

import java.util.Arrays;

public class HighestAndLowest {
  public static String highAndLow(String numbers) {
    String[] string = numbers.split(" ");
    int[] arr = new int[string.length];
    
    for(int i = 0; i < string.length; i++) {
      arr[i] = Integer.valueOf(string[i]);
    }
    Arrays.sort(arr);
    int bigInt=0;
    int smallInt=0;
    for(int i = 0; i<arr.length; i++) {
      bigInt=arr[arr.length-1];
      smallInt=arr[0];
    }

    String str = String.valueOf(bigInt);
    String str1 = String.valueOf(smallInt);
    String str2 = " ";
    str.concat(str2).concat(str1);
    return str.concat(str2).concat(str1);
  }
}