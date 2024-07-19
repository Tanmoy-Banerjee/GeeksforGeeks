package GFG.BinaryTree;

import java.util.ArrayList;
import java.util.List;

/*
144. Binary Tree Preorder Traversal
Easy
Topics
Companies
Given the root of a binary tree, return the preorder traversal of its nodes' values.



Example 1:


Input: root = [1,null,2,3]
Output: [1,2,3]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]

 */
public class LeetCode144 {


    static ArrayList<Integer> array = new ArrayList<>();
    public static List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return  array;
        }

            array.add(root.val);

            preorderTraversal(root.left);
            preorderTraversal(root.right);


        return array;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(11);
        root.left = new TreeNode(25);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(5);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);


        System.out.println(preorderTraversal(root));
    }
}
