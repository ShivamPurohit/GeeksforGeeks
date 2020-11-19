// Java program to find length of loop in linked list
public class Main { 
    Node head;
  
    
    static class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
  
        new_node.next = head; 
  
        head = new_node; 
    } 
  
  int lengthOfList(Node n){
      Node temp = n;
      int count = 1;
      while(temp.next!=n){
          count++;
          temp = temp.next;
      }
      return count;
  }
  
    int detectLoop() 
    { 
    
        Node fast = head,slow = head;
        while(fast!=null && slow!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return lengthOfList(slow);
            }
        }
        return 0;
        
    } 
  
   
    public static void main(String args[]) 
    { 
        Main llist = new Main(); 
  
        llist.push(20); 
        llist.push(4); 
        llist.push(15); 
        llist.push(10); 
  
        llist.head.next.next.next.next = llist.head; 
  
        int length = llist.detectLoop(); 
        System.out.println("Length of loop is " + length);
    } 
} 
