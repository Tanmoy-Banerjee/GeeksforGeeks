package GFG.BinaryTree;

public class NodesAtKDistance {

    public  static void printKDist(Node root, int k ){
        if(root == null)
            return;
        if(k==0){
            System.out.print(root.key+" ");
        }else {
            printKDist(root.left,k-1);
            printKDist(root.right,k-1);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.right = new Node(70);
        root.left.left = new Node(40);
        root.left.left.left = new Node(50);

        printKDist(root, 2);
    }
}
