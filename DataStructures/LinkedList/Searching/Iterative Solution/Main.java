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
    
public boolean search(Node head,int x){
    Node n = head;
    while(n!=null){
        if(n.data == x){
            return true;
        }
        n = n.next;
    }
    return false;
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
        int s = 9;
        System.out.println("Searching " +s+ " in list");
        if(llist.search(llist.head,s)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}


//Output :
// Linked List created                                                                                                                         
//5 9 1 4 3                                                                                                                                    
//Searching 9 in list                                                                                                                          
//Found    
