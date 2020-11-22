//Java program to Merge two LinkedList
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
    
    public static Node mergeList(Node p,Node q){
        Node sorting = null;
        Node new_head;
        
        if(p == null) return q;
        if(q == null) return p;
        
        if(p!=null && q!=null){
            if(p.data<=q.data){
                sorting = p;
                p = p.next;
            }else{
                sorting = q;
                q = q.next;
            }
        }
        new_head = sorting;
        
        while(p!=null && q!=null){
            if(p.data<=q.data){
                sorting.next = p;
                sorting = p;
                p = sorting.next;
            }else{
                sorting.next = q;
                sorting = q;
                q = sorting.next;
            }
        }
        
        if(p==null) sorting.next = q;
        if(q==null) sorting.next = p;
        
        return new_head;
    }

public void append(Node n){
   if(head == null){
       head = n;
   return;
   }
   Node temp = head;
   while(temp.next!=null){
       temp = temp.next;
   }
   temp.next = n;
}
    
    public void printList(Node new_head){
        Node n = new_head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println("");
    }
    
    public static void main(String args[]){
        Main llist1 = new Main();
        Main llist2 = new Main();
        
        llist1.append(new Node(20));
        llist1.append(new Node(40));
        llist1.append(new Node(60));
        
        llist2.append(new Node(10));
        llist2.append(new Node(50));
        llist2.append(new Node(55));
        
        llist1.printList(llist1.head);
        llist2.printList(llist2.head);
        
        Node new_head = mergeList(llist1.head,llist2.head);
        
        llist1.printList(new_head);
    }
}

//Output : 
//20 40 60 
//10 50 55 
//10 20 40 50 55 60 
