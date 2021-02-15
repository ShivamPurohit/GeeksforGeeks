/*Binary Tree
Binary tree is the type of tree in which each parent can have at most two children. The children are referred to as left child or right child. This is one of the most commonly used trees. When certain constraints and properties are imposed on Binary tree it results in a number of other widely used trees like BST (Binary Search Tree), AVL tree, RBT tree etc.
*/



class Node{
    int data;
    Node right,left;
    Node(int data){
        this.data = data;
    }
}

public class Main{
    
    Node root;
    
    public void treeTraversal(Node node){
        if(node != null){
            treeTraversal(node.left);
            System.out.print(node.data + " ");
            treeTraversal(node.right);
        }
    }
    
    public static void main(String args[]){
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        
        tree.treeTraversal(tree.root);
    }
}
