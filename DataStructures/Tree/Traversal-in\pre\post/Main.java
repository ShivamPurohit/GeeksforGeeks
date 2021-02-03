import java.util.Scanner;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data = data;
    }
}
public class Main{
    static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    
    static Node insert(Node root,int data){
        if(root == null) return new Node(data);
        if(data < root.data) root.left = insert(root.left,data);
        else root.right = insert(root.right,data);
        return root;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0){
            int data = scan.nextInt();
            root = insert(root,data);    
        }
        scan.close();
        
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        
    }
}
