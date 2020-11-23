//Java program to reverse a doubly linked list
//Time Complexity: O(n)

public class Main{
    
    Node head;
     static class Node{
         int data;
         Node next,prev;
         Node(int d){
             data = d;
         }
     }
     
     public Node reverse(Node head){
        Node temp = null;
        Node current = head;
        while(current!=null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
            
        }
        
        if(temp!=null){
            head = temp.prev;
        }
        
         return head;
     }
     
     public void push(int new_data){
         Node new_node = new Node(new_data);
         
         new_node.next = head;
         new_node.prev = null;
         
         if(head != null){
              head.prev = new_node;
         }
         
         head = new_node;
     }
     
     void printList(Node head){
      Node n = head;
      while(n!=null){
          System.out.print(n.data + " ");
          n = n.next;
      }
      System.out.println("");
     }
    
    public static void main(String args[]){
        Main m = new Main();
        m.push(1);
        m.push(3);
        m.push(4);
        m.push(7);
        m.push(8);
        m.push(9);
        
        m.printList(m.head);
       Node new_head = m.reverse(m.head);
        System.out.println("After Reversing");
        m.printList(new_head);
    }
}

//Output :
// 9 8 7 4 3 1                                                           
// After Reversing                                                       
// 1 3 4 7 8 9 
