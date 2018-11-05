/**
 * Welcome. In this kata, you are asked to square every digit of a number.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

Note: The function accepts an integer and returns an integer
 */

import java.lang.Math; 
import java.lang.StringBuilder;
public class SquareDigit {

    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }
    public static int squareDigits(int n) {
        StringBuilder sb = new StringBuilder();
        String intStr = Integer.toString(n);
        for(int i = 0; i < intStr.length(); i++) {
            sb.append((int)Math.pow((double) Character.digit(intStr.charAt(i), 10), 2));
        }
        String result = sb.toString();
        return Integer.parseInt(result);
    }
  
  }