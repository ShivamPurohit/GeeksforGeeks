//Method 1 - Using two looops   ->x
//Method 2 - Using Sorting
//    1) merge sort(as it is most efficient) TC= O(nlogn)
//    2)RemoveDuplicates on sorted linked list TC=O(n)
//    Total Time Complexity is aprox O(nlogn)

//(Best)Method 3 - Use Hashing TC = O(n) 

import java.util.*;
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
       HashSet<Integer> h = new HashSet<Integer>();
       Node current = head, prev = null;
       while(current != null){
           if(h.contains(current.data)){
               prev.next = current.next;
               
           }
           else{
               h.add(current.data);
               prev = current;
           }
           current = current.next;
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
       
        llist.push(2);
        llist.push(3);
        llist.push(3);
        llist.push(8);
        llist.push(4);
        llist.push(9);
        llist.push(2);
        llist.push(1);
        
        llist.printList();
        llist.removeDuplicate();
        llist.printList();
    }
}

//Output :
//1 2 9 4 8 3 3 2 
//1 2 9 4 8 3
