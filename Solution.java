public class Solution {
    
    public static void main(String[] args) {
        System.out.println("Hello, World");
        // TEST CASES
        System.out.println(dashatize(274));
        System.out.println(dashatize(5311));
        System.out.println(dashatize(86320));
        System.out.println(dashatize(974302));
    }

    public static String dashatize(int num) {
        return Integer.toString(num).replaceAll("([13579])","-$1-").replaceAll("--","-").replaceAll("^-","").replaceAll("-$","");
    }
}