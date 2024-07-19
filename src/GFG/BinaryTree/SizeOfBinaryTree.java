package GFG.BinaryTree;

public class SizeOfBinaryTree {

    public static int getSize(Node root){

        if(root == null){
            return  0;
        }else{
            return 1+ getSize(root.left)+getSize(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.left.right.left = new Node(70);
        root.left.right.right = new Node(80);
        root.right = new Node(30);
        root.right.right = new Node(60);


        System.out.println(getSize(root));
    }


}
