import java.lang.StringBuilder;

public class OddEvenSort {
  
   public static void main(String[] args) {
       sortMyString("CodeWars");
   }

  public static void sortMyString(String s) {
    StringBuilder even = new StringBuilder();
    StringBuilder odd = new StringBuilder();
    StringBuilder result = new StringBuilder();
    char[] a = s.toCharArray();
    for(int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
        if(i % 2 == 0) {
            even.append(a[i]);
        }
        if(i % 2 == 1) {
            odd.append(a[i]);
        }
    }
    result = result.append(even.toString());
    result = result.append(" ");
    result = result.append(odd.toString());


    System.out.println("Even indices: " + even.toString());
    System.out.println("Odd indices " + odd.toString());
    String output = result.toString();
	System.out.println("Output: " + output);
  }
}