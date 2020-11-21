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
    
    public void push(int new_data){
        Node new_node = new Node(new_data);
        
        new_node.next = head;
        new_node.prev = null;
        
        if(head!=null){
            head.prev = new_node;
        }
        
        head = new_node;
    }
    
    public void printList(Node node){
        Node last = node;
        System.out.println("Traversal in forward Direction \n");
        while(node!=null){
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println("");
        System.out.println("\nTraversal in reverse direction\n");
        while(last!=null){
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }
    
    public static void main(String args[]){
        Main dll = new Main();
        dll.push(1);
        dll.push(2);
        dll.push(3);
        dll.push(4);
        dll.push(5);
        dll.printList(dll.head);
    }
}

//Output : 
//Traversal in forward Direction 

//5 4 3 2 1 

//Traversal in reverse direction

//1 2 3 4 5 
