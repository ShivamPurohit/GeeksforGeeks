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
    
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    
    public void insertAfter(Node prev_node,int data){
        if(prev_node == null){
            System.out.println("Previous Node cannot be Null");
            return;
        }
        Node new_node = new Node(data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }
    
    public void append(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new Node(data);
            return;
        }
        new_node.next = null;
        
        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        last.next = new_node;
        return;
    }
    
    public void printList(){
        Node n = head;
        while(n != null){
            System.out.print(n.data + " ");
            n=n.next;
        }
    }
    
    public static void main(String args[]){
        LinkedList llist = new LinkedList();
       
        llist.append(3);
        llist.push(4);
        llist.push(1);
        llist.append(9);
        llist.insertAfter(llist.head.next.next,5);
        
        llist.printList();
    }
}

// Output:  1 4 3 5 9 
