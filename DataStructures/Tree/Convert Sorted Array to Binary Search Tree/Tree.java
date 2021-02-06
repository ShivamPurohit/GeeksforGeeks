class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data = data;
    }
}

public class Tree{
    static Node root;
     public Node sortedArrayToBST(int[] arr){
         if(arr.length == 0) return null;
         return constructTreeFromArray(arr,0,arr.length-1);
     }
     
     public Node constructTreeFromArray(int[] arr,int start,int end){
         if(start>end) return null;
         
         int mid = (start + end+1)/2;
         Node node = new Node(arr[mid]);
         
         node.left = constructTreeFromArray(arr,start,mid-1);
         node.right = constructTreeFromArray(arr,mid+1,end);
         
         return node;
     }
    
    public void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    
    public static void main(String args[]){
        Tree tree = new Tree();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i] + " ");
        
        System.out.println();
        
        root = tree.sortedArrayToBST(arr);
        tree.preOrder(root);
    }
}


// Output : 1 2 3 4 5 6 7 
            4 2 1 3 6 5 7 
