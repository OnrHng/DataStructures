package Recursion;

public class SumDigits {

    /*
        Given a non-negative int n, return the sum of its digits recursively (no loops). 
        Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

        sumDigits(126) → 9
        sumDigits(49) → 13
        sumDigits(12) → 3
    */

    public static void main(String[] args) {
        System.out.println(sumDigits(126));
    }

    public static int sumDigits(int n) {
        // base case
        if(n == 0) return 0;
        
        // recursive case
        int val = n % 10;
        n = n / 10;
        
        return val +  sumDigits(n);
      }
}
