//Size of Binary Tree 
//1st-way of doing this

class Tree
{
	public static int getSize(Node root)
	{
        int countl = 0,countr = 0;
        if(root == null) return 0;
        
        if(root.left!= null){
            countl = getSize(root.left);
        }
        if(root.right!=null){
            countr = getSize(root.right);
        }
        int tree_size = countl + countr + 1;
        return tree_size;
    }
}

//2nd-way of doing this

class Tree
{
	public static int getSize(Node root)
	{
      
        if(root == null) return 0;
        
        return getSize(root.left) + getSize(root.right) + 1;
    }
}
