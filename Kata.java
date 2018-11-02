/**
 * You will be given an array and a limit value. You must check that all values in the array are below or equal to the limit value. If they are, return true. Else, return false.

You can assume all values in the array are numbers.

 */

public class Kata
{
  public static void main(String[] args){
    System.out.println(smallEnough(new int[] { 66, 101 }, 200)); // TRUE
    System.out.println(smallEnough(new int[] { 78, 117, 110, 99, 104, 117, 107, 115 }, 100)); // FALSE
  }

  public static boolean smallEnough(int[] a, int limit)
  {
    for(int c : a) {
        if(c > limit) return false;
    }
    return true;
  }
}