package Recursion;

public class NoX {

    /*
    Given a string, compute recursively a new string where all the 'x' chars have been removed.

    noX("xaxb") → "ab"
    noX("abc") → "abc"
    noX("xx") → ""

    */

    public static void main(String[] args) {
        System.out.println(noX("xaxb"));        
    }

    public static String noX(String str) {
        if(str.length() == 0) return "";
        String currChar = str.substring(0,1);
        if(currChar.equals("x")) return "" + noX(str.substring(1));
        else return currChar + noX(str.substring(1));
    }
}
