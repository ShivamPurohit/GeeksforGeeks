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
    
   public void printMiddle(){
       Node fast = head;
       Node slow = head;
       if(head!=null){
           while(fast!=null && fast.next!=null){
           fast = fast.next.next;
           slow = slow.next;
       }
       
       System.out.println("The middle element is : " + slow.data);
       }
       
   }
    
    public void printList(){
        Node n = head;
        while(n != null){
            System.out.print(n.data + " ");
            n=n.next;
        }
    }
    
    public static void main(String args[]){
        Main llist = new Main();
       
        llist.push(3);
        llist.push(4);
        llist.push(1);
        llist.push(9);
        llist.push(5);
        
        llist.printList();
        llist.printMiddle();
    }
}
