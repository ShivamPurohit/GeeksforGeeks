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
    
    public void deleteNode(int position){
        Node temp = head;
        
        if(temp == null) return;
        if(position == 0){
            head = temp.next;
            return;
        }
        
        for(int i=0;temp!=null && i<position-1;i++){
            temp = temp.next;
        }
        
        if(temp == null || temp.next == null) return;
        
        Node next = temp.next.next;
        temp.next = next;
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
        
        llist.deleteNode(4);
        System.out.println("\n After Deletion at position 4");
        llist.printList();
    }
}


// Output :
//  Linked List created
// 5 9 1 4 3 

//  After Deletion at position 4
// 5 9 1 4 
