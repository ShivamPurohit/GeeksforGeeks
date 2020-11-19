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
    
    public void deleteNode(int key){
        Node temp = head, prev = null;
        
        if(temp != null && temp.data == key){
            head = temp.next;
            return;
        }
        
        while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        
        if(temp == null) return;
        
        prev.next = temp.next;
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
        
        llist.deleteNode(1);
        System.out.println("\n After Deletion");
        llist.printList();
    }
}


//Output : 
// Linked List created
//5 9 1 4 3 

// After Deletion
//5 9 4 3
