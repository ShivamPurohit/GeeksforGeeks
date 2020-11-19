//Complexity Analysis: 
 
//Time complexity: O(n). 
//Auxiliary Space:O(1). 

// Java program to detect loop in a linked list 
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
  
    void detectLoop() 
    { 
        int flag = 0;
        Node fast = head,slow = head;
        while(fast!=null && slow!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                flag = 1;
                break;
            }
        }
        
        if(flag == 1){
            System.out.println("Loop Detected");
        }else{
            System.out.println("No Loop Found");
        }
    } 
  
   
    public static void main(String args[]) 
    { 
        Main llist = new Main(); 
  
        llist.push(20); 
        llist.push(4); 
        llist.push(15); 
        llist.push(10); 
  
        llist.head.next.next.next.next = llist.head; 
  
        llist.detectLoop(); 
    } 
} 


//Output : 
//Loop Detected
