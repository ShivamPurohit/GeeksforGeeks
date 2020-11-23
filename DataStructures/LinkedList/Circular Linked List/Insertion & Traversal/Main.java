public class Main{
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
        }
    }
    
    Node push(Node head_ref,int new_data){
       Node new_node = new Node(new_data);
       Node temp = head_ref;
       new_node.next = head_ref;
       
       if(head_ref!=null){
           while(temp.next!=head_ref){
               temp = temp.next;
           }
           temp.next = new_node;
       }else{
           new_node.next = new_node;
       }
       head_ref = new_node;
       
       return head_ref;
    }
    
    void printList(Node head){
        Node n = head;
        do{
            System.out.print(n.data+" ");
            n = n.next;
        }while(n!=head);
    }
    
    public static void main(String args[]){
        Main m = new Main();
        Node head = null;
        head = m.push(head,2);
        head = m.push(head,5);
        head = m.push(head,8);
        head = m.push(head,9);
        
        m.printList(head.next.next);
    }
    
    //Output :
    //5 2 9 8
}
