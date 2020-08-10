// 2nd way- same execution time nearly as the first one 0.24 seconds
import java.util.Scanner;
import java.lang.*;
import java.io.*;
public class GFG2
{
public static void main (String[] args)
{
Scanner scan = new Scanner(System.in);
int t = scan.nextInt();
while(t--> 0){

String s = scan.next();
if(s.charAt(0) == s.charAt(1)){
System.out.println("DRAW");
}
else if(s.charAt(0) == 'R' && s.charAt(1) == 'S' || s.charAt(0) == 'S' && s.charAt(1) == 'P'||
s.charAt(0) == 'P' && s.charAt(1) == 'R'){
System.out.println("A");
}
else {
System.out.println("B");
}
}System.out.println();
}

}
