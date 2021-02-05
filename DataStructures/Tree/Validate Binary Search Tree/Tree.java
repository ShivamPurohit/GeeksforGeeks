class Node{
        Node right,left;
        int data;
        Node(int data){
            this.data = data;
        }
    }
    
public class Tree{
    
    Node root;
    
    boolean isBST(){
        return checkBST(root,Long.MIN_VALUE,Long.MAX_VALUE);    
    }
    
    boolean checkBST(Node root,long min,long max){
        if(root == null) return true;
        
        if(root.data < min || root.data > max) return false;
        
        return (checkBST(root.left,min,root.data-1)&&checkBST(root.right,root.data+1,max));
    }
    
    public static void main(String args[]){
        Tree tree = new Tree();
        tree.root = new Node(4); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(5); 
        tree.root.left.left = new Node(1); 
        tree.root.left.right = new Node(3); 
  
        if (tree.isBST()) 
            System.out.println("IS BST"); 
        else
            System.out.println("Not a BST"); 
    }
}

//OUTPUT : IS BST


//For edge cases on leetcode and interview bit
//[-2147483648,-2147483648]

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean check(TreeNode node, long MIN, long MAX) {
        if (node == null) {
            return true;
        }
        if (node.val >= MAX || node.val <= MIN) {
            return false;
        }
        return check(node.left, MIN, node.val) && check(node.right, node.val, MAX);
    }
}
