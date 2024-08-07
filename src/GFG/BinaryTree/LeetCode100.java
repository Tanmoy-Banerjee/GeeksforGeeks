package GFG.BinaryTree;

import java.util.ArrayList;

public class LeetCode100 {

    public static boolean  isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;

        if(p == null|| q== null)
            return false;

        if(p.val != q.val)
            return false;

        return (isSameTree(p.left, q.left)&& isSameTree(p.right, q.right));
    }

//    public  static ArrayList<TreeNode> preOrder(TreeNode root){
//        ArrayList<TreeNode> nodes= new ArrayList<>();
//        if(root != null){
//            nodes.add(root);
//           nodes.addAll(preOrder(root.left));
//           nodes.addAll(preOrder(root.right));
//        }
//        return nodes;
//    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        System.out.println(isSameTree(root,root2));


    }



}
