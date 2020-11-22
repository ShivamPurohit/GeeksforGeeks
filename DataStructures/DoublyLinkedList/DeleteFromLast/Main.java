public class Main{
    Node head;
    
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            data = d;
        }
    }
    
    public Node deleteFromLast(Node head){
        Node tail = head;
        while(tail.next!=null){
            tail= tail.next;
        }
        tail.prev.next = null;
        tail.prev = null;
        
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
    
    public void printList(Node node){
        Node last = head;
        System.out.println("Traversal in forward");
        while(node!=null){
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println("");
        System.out.println("\nTraversal in backward");
        while(last!=null){
            System.out.print(last.data + " ");
            last = last.prev;
        }
        System.out.println("\n");
    }
    

    public static void main(String args[]){
        Main main = new Main();
        main.push(2);
        main.push(4);
        main.push(5);
        main.push(6);
        main.push(9);
        
        main.printList(main.head);
        Node head = main.deleteFromLast(main.head);
        System.out.println("After deletion from Last\n");
        main.printList(head);
    }
}

// Traversal in forward                                                        
// 9 6 5 4 2                                                                   
                                                                            
// Traversal in backward                                                       
// 2 4 5 6 9                                                                   
                                                                            
// After deletion from Last                                                    
                                                                            
// Traversal in forward                                                        
// 9 6 5 4                                                                     
                                                                            
// Traversal in backward                                                       
// 4 5 6 9 
