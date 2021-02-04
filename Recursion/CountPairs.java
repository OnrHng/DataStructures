package Recursion;

public class CountPairs {
    
    /*
        We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.

        countPairs("axa") → 1
        countPairs("axax") → 2
        countPairs("axbx") → 1
    */

    public static void main(String[] args) {
        System.out.println(countPairs("axax"));        
    }

    public static int countPairs(String str) {
        // pair olusabilmesi icin str minimum 3 uzunlugunda olmalidir.
        
        if(str.length() < 3) return 0;
        
        
        // String pair = str.substring(0,4);
        
        if(str.charAt(0) == str.charAt(2)) return 1 + countPairs(str.substring(1));
        else return 0 + countPairs(str.substring(1));
        
      }
      
}
