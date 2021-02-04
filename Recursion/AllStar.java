package Recursion;

public class AllStar {
    
    /*

    Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".


    allStar("hello") → "h*e*l*l*o"
    allStar("abc") → "a*b*c"
    allStar("ab") → "a*b"
    */

    public static void main(String[] args) {
        System.out.println(allStar("hello"));
    }

    public static String allStar(String str) {
        // base 
        // if(str.length() == 0) return "";
        // if(str.length() == 1) return str.substring(str.length()-1);
        
        if(str.length() <= 1) return str;
        
        // recursive case
        return str.substring(0,1) + "*" +  allStar(str.substring(1));
        
    }
      
}
