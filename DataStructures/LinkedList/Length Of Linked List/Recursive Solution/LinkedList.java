public class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    
    int getCountRec(Node node){
        //Base Case
        if(node == null) return 0;
        
        return 1 + getCountRec(node.next);
    }
    
   int getCount(){
        return getCountRec(head);
   }
    
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    
    public void printList(){
        Node n = head;
        while(n != null){
            System.out.print(n.data + " ");
            n=n.next;
        }
        System.out.println("");
    }
    
    public static void main(String args[]){
        LinkedList llist = new LinkedList();
       
        llist.push(3);
        llist.push(4);
        llist.push(1);
        llist.push(9);
        llist.push(5);
        System.out.println("\n Linked List created");
        llist.printList();
        int count = llist.getCount();
        System.out.println("Length of Linked is " + count);
    }
}


//Output : 
// Linked List created
//5 9 1 4 3 
//Length of Linked is 5
