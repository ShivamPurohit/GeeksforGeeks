class Tree
{
    int minValue(Node node)
    {
       Node curr = node;
       while(curr.left!=null){
           curr = curr.left;
       }
       return (curr.data);
    }
}
