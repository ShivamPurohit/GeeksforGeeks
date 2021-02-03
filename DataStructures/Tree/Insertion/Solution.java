import java.util.Scanner;

    
    class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    
   public class Solution{
        public static void inOrder(Node root){
            if(root == null) return;
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
        
        public static Node insert(Node root, int data){
            if(root == null){
                return new Node(data);
            }
            if(data < root.data){
                root.left = insert(root.left,data);
            }else{
                root.right = insert(root.right,data);
            }
            
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
        }
        
    }
    
