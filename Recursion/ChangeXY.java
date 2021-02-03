package Recursion;

public class ChangeXY {
    /*
Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.


changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"    
    
    */


    public static void main(String[] args) {
        System.out.println(changeXY("xhixhix"));
    }

    public static String changeXY(String str) {
        if(str.length() == 0) return "";
        char x = str.charAt(0);   
        if(x == 'x') return "y" + changeXY(str.substring(1));
        else return x + changeXY(str.substring(1));
  }
}
