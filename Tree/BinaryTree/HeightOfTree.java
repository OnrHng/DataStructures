package Tree.BinaryTree;

public class HeightOfTree {
    
    static Node root;

    static{
        root = new Node(1);
        root.left = new Node(2);
        // root.right = new Node(3);

        // root.left.left = new Node(4);
        // root.left.right = new Node(5);

        // root.right.left = new Node(6);
        // root.right.left.left = new Node(6);
        // root.right.left.right = new Node(6);

        // root.right.right = new Node(7);
        // // root.right.right.left = null;
        // // root.right.right.right = null;
        
    }

    public static void main(String[] args) {
        System.out.println(findHeight(root));
    }

    private static int findHeight(Node root) {
        if(root== null) return -1;
        return 1 + Math.max(findHeight(root.left), findHeight(root.right));
    }
}
