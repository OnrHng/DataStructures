package Tree.BinaryTree;


public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        //base case -> root un null olmasi

       if(root == null) return true;
       
       int heightLeft = findHeight(root.left);
       int heightRigth = findHeight(root.right);
       
       if (Math.abs(heightLeft - heightRigth) > 1) return false;
       else return true && isBalanced(root.left) && isBalanced(root.right); 
       // else return true; 

   }
   
   private static int findHeight(TreeNode root) {
       if(root == null) return 0;
       return 1 + Math.max(findHeight(root.left), findHeight(root.right));
   }
   
   
   /*
       Yukseklikleri al. sol ve sag. ve control et fark 1 den fazla mi degil mi? Eger 1 den fazla ise return false;
   
   */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
   
}
