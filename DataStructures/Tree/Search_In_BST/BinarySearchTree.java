public class BinarySearchTree{
   
 
    class Node{

        int data;
  
         Node left,right;
 
         Node(int data){
   
         this.data = data;
  
            }
    }
   
 
    
Node root;
    

    BinarySearchTree(){
 
       root = null;

    }
    

   
 public Node search(Node root,int key){
  
      if(root == null || root.data == key){
   
         return root;
  
      }
 
       
        if(root.data < key){
       
            return search(root.right,key);
  
                }

               return search(root.left,key);
      
            }
    

   public static void inOrder(Node root){
    
    if(root!=null){
  
          inOrder(root.left);
    
        System.out.println(root.data + " ");
   
         inOrder(root.right);

        }
    }
   
 

    public Node insert(Node root,int data){
     
        if(root == null){
    
            return new Node(data);
   
         }
     
   
        if(data < root.data){
   
         root.left = insert(root.left,data);
  
        }
        
 
       if(data > root.data){
       
        root.right = insert(root.right,data);
   
        }
      
 
        return root;
  
  }
   

 
    public static void main(String args[]){
      
     BinarySearchTree tree = new BinarySearchTree();
   
     tree.root = tree.insert(tree.root,50);
    
     tree.root = tree.insert(tree.root,30);
  
     tree.root = tree.insert(tree.root,20);
     
     tree.root = tree.insert(tree.root,40);
   
     tree.root = tree.insert(tree.root,70);

     tree.root = tree.insert(tree.root,60);

     tree.root = tree.insert(tree.root,80);


        
        inOrder(tree.root);

    Node searchRoot = tree.search(tree.root,30);

        if(searchRoot != null){
            System.out.println(searchRoot.data + " exsits in Tree");
        }else{
            System.out.println("Element does not exists in the Tree");
        }

    }
}
