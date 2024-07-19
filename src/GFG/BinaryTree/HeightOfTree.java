package GFG.BinaryTree;

public class HeightOfTree {

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        else {
            return Math.max(height(root.left),height(root.right))+1;
        }
    }


    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.left.left = new Node(50);

        System.out.println(height(root));
    }
}
