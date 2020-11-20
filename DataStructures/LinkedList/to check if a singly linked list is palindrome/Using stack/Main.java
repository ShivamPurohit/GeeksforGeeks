import java.util.*;
public class Main{
    public static void main(String argsp[]){
       Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        
        boolean condition = isPalindrome(one);
        System.out.println("is Palindrome " + condition);
        
    }
    
   static boolean isPalindrome(Node head){
        Node temp = head;
        boolean isPalin = true;
        Stack<Integer> stk = new Stack<Integer>();
        while(temp!=null){
            stk.push(temp.data);
            temp = temp.next;
        }
        while(head!=null){
            int i = stk.pop();
            if(head.data == i){
                isPalin = true;
            }
            else{
                isPalin = false;
                break;
            }
            head = head.next;
        }
        return isPalin;
            
    }
    
    
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
}

//Output :
//is Palindrome true
