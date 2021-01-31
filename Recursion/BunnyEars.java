package Recursion;

public class BunnyEars {
    /*
        bunnyEars2(0) → 0
        bunnyEars2(1) → 2
        bunnyEars2(2) → 4
        bunnyEars2(3) → 6 => 2+2+2
    */
    public static void main(String[] args) {
        int ears = bunnyEars2(2);
        System.out.println(ears);
    }

    public static int bunnyEars2(int bunny) {
        if (bunny == 0) return 0;
        
        return 2 + bunnyEars2(bunny - 1);

    }
    
}
