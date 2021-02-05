class Node{
        Node right,left;
        int data;
        Node(int data){
            this.data = data;
        }
    }
    
public class Tree{
    
    Node root;
    
    boolean isSymmetricBST(){
        return checkSymmetric(root,root); 
    }
    
    boolean checkSymmetric(Node r1,Node r2){
        if(r1 == null && r2==null) return true;
        if(r1 == null || r2==null) return false;
        
        else{
            return (r1.data == r2.data) && checkSymmetric(r1.left,r2.right) && checkSymmetric(r1.right,r2.left);
        }
    }
    
    public static void main(String args[]){
        Tree tree = new Tree();
        tree.root = new Node(4); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(2); 
        tree.root.left.left = new Node(1); 
        tree.root.left.right = new Node(3); 
        tree.root.right.left = new Node(3);
        tree.root.right.right = new Node(1);
  
        if (tree.isSymmetricBST()) 
            System.out.println("Is symmetric!"); 
        else
            System.out.println("Not symmetric!"); 
    }
}
