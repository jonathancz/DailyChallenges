/**
 * In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
 * Example:

        HighAndLow("1 2 3 4 5") // return "5 1"
        HighAndLow("1 2 -3 4 5") // return "5 -3"
        HighAndLow("1 9 3 4 -5") // return "9 -5"
 */
import java.util.Arrays; 
import java.lang.StringBuilder;
public class HighandLow{

    public static void main(String[] args){
        System.out.println(HighAndLow("1 2 3 4 5")); // return "5 1"
        System.out.println(HighAndLow("1 2 -3 4 5")); // return "5 -3"
        System.out.println(HighAndLow("1 9 3 4 -5")); // return "9 -5"
    }
    public static String HighAndLow(String numbers) {
        StringBuilder sb = new StringBuilder();
        String[] items = numbers.split(" ");
        int[] numArr = new int[items.length];
        for(int i = 0; i < items.length; i++){
            numArr[i] = Integer.parseInt(items[i]);
        }
        Arrays.sort(numArr);
        sb.append(Integer.toString(numArr[numArr.length - 1]));
        sb.append(" ");
        sb.append(Integer.toString(numArr[0]));
        return sb.toString();
      }
}