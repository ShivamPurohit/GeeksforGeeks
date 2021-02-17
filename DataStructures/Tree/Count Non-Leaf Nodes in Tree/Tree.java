//Count Non-Leaf Nodes in Tree

class GFG
{
	int countNonLeafNodes(Node root)
	{
	    if(root == null || (root.left == null && root.right == null)){
	        return 0;
	    }
	    
	    return (1 + countNonLeafNodes(root.left) + countNonLeafNodes(root.right));
	}
}
