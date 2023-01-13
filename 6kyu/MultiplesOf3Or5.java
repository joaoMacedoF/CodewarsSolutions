/* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in. Additionally, if the number is negative, return 0 (for languages that do have them).

Note: If the number is a multiple of both 3 and 5, only count it once.

Courtesy of projecteuler.net (Problem 1) */


//My Solution

import java.util.Arrays;
import java.util.stream.IntStream;

public class MultiplesOf3Or5 {
    public static int solution(int number) {
        int sum = 0;
        int[] arr = IntStream.range(0, number).toArray();
        System.out.println(Arrays.toString(arr));
       for(int i = 0; i < arr.length; i++) {
         if(arr[i]%3 == 0 || arr[i]%5 == 0) {
           sum = sum + arr[i];
         } 
       }  
       return sum;
      }  
}
