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
    
   int GetNth(Node head,int n){
    int count = 0;
    
    if(head == null) return -1;
        
    if(count == n) return head.data;
    
    return GetNth(head.next,n-1);
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
        Main llist = new Main();
       
        llist.push(3);
        llist.push(4);
        llist.push(1);
        llist.push(9);
        llist.push(5);
        System.out.println("\n Linked List created");
        llist.printList();
        
        System.out.printf("Element at index 3 is %d",
                          llist.GetNth(llist.head, 3));
    }
}

//Time Complexity: O(n)
//Output :
// Linked List created                                                                                                                         
//5 9 1 4 3                                                                                                                                    
//Element at index 3 is 4
