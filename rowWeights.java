/**
 * Task
Given an array of positive integers (the weights of the people), return a new array/tuple of two integers, 
where the first one is the total weight of team 1, and the second one is the total weight of team 2.

    Example Input >> Output
    1- rowWeights([13, 27, 49])  ==>  return (62, 27)
    Explanation:
    The first element 62 is the total weight of team 1, and the second element 27 is the total weight of team 2.
    
 */

public class rowWeights {
    
    public static void main(String[] args) {
        int[] test = rowWeights(new int[]{70,58,75,34,91}); // int[]{236,92}
        for(int a : test) {
            System.out.println(a);        }
    }
    public static int[] rowWeights (final int[] weights)
    {
        int team1 = 0;
        int team2= 0;
        for(int i = 0; i < weights.length; i++) {
            if(i % 2 == 0) {
                team1 += weights[i];
           }
           else {
               team2 += weights[i];
           }
        }
        return new int[]{team1, team2}; // Do your magic!
    }
}