package Recursion;

public class PairStar {
    
    /*

Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".


pairStar("hello") → "hel*lo"
pairStar("xxyy") → "x*xy*y"
pairStar("aaaa") → "a*a*a*a"
    */

    public static void main(String[] args) {
        System.out.println(pairStar("xxyy"));
    }

    public static String pairStar(String str) {
        // base 
        // if(str.length() == 0) return "";
        // if(str.length() == 1) return str.substring(str.length()-1);
        
        if(str.length() <= 1) return str;
        
        // recursive case
        char currChar = str.charAt(0);
        char nextChar = str.charAt(1);
        if(currChar == nextChar)  return currChar + "*" + pairStar(str.substring(1));  
        else return  currChar + pairStar(str.substring(1));
      }
    
}
