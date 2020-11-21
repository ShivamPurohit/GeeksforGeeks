public class Main{
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
    
    public void removeDuplicate(){
        Node current = head;
        while(current!= null && current.next!=null){
            if(current.next.data == current.data){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
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
        Main llist = new Main();
       
        llist.push(1);
        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);
        llist.push(4);
        llist.push(4);
        llist.push(5);
        
        llist.printList();
        llist.removeDuplicate();
        llist.printList();
    }
}

//Output : 
//5 4 4 4 3 2 1 1 
//5 4 3 2 1 
