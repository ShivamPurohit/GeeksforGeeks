//Write a GetNth() function that takes a linked list and an integer index and returns the data value stored in the node at that index position. 
//Algorithm: 

//1. Initialize count = 0
//2. Loop through the link list
//     a. if count is equal to the passed index then return current
//         node
//    b. Increment count
//     c. change current to point to next of the current.

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
    
int GetNth(int index){
    Node temp = head;
    int count =0;
    
    while(temp!=null){
        if(count == index){
            return temp.data;
        }
        count++;
        temp = temp.next;
    }
    
    assert(false); // for non-existent element
    return 0;
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
        
        System.out.println("Element at index 2 is "
                           + llist.GetNth(2));
    }
}

//Time Complexity: O(n)
//Output :
// Linked List created                                                                                                                         
//5 9 1 4 3                                                                                                                                    
//Element at index 2 is 1
