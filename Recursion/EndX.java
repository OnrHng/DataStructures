package Recursion;

public class EndX {
    
    /*

        Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.

        endX("xxre") → "rexx"
        endX("xxhixx") → "hixxxx"
        endX("xhixhix") → "hihixxx"
    */

    public static void main(String[] args) {
        System.out.println(endX("xxre"));        
    }

    public static String endX(String str) {
        if(str.length() <= 1) return str;
        
        
        int currChar = str.charAt(0);
        if (currChar == 'x') return endX(str.substring(1)) + "x" ;
        else return str.substring(0,1) + endX(str.substring(1));
      }
      
}
