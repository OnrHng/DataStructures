package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Loop Solution: " + computeFactorialWithoutRecursion(5));
        System.out.println("Recursion Solution: " + computeFactorialWithRecursion(5));
        // computeFactorialWithRecursion(5);
        // computeFactorialWithoutRecursion(5);
    }

    private static int computeFactorialWithoutRecursion(int num) {
        int result = 1;
        for (int i = num; i > 0; i--) {
            result = result * i;
        }
        return result;
    }

    private static int computeFactorialWithRecursion(int num) {
        // Base case: if n is 1, we can return the answer directly
        if( num ==  1) return 1;
            
        return num * computeFactorialWithRecursion(num -1);
        
    }
    
}
