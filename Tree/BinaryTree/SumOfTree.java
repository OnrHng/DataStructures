package Tree.BinaryTree;

/*
 find the sum of trees root's values;
*/

public class SumOfTree {
    
    static Node root;

    static{
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);
    }

    public static void main(String[] args) {
        System.out.println(sumOfTree(root));
    }

    public static int sumOfTree(Node root) {
        if(root == null) return 0;

        return root.val + sumOfTree(root.left) + sumOfTree(root.right);
    }
}
