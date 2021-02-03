package Recursion;

public class CountX {
    /*
        Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

        countX("xxhixx") → 4
        countX("xhixhix") → 3
        countX("hi") → 0
    */


    public static void main(String[] args) {
        System.out.println(countX("xhixhix"));
    }


    public static int countX(String str) {
        if(str.length() == 0) return 0;
        
        if(str.charAt(0) == 'x') return 1 + countX(str.substring(1));
        else return 0 + countX(str.substring(1));
      }
}
