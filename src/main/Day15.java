package main;

import java.util.Scanner;

public class Day15 {
	
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
	
	 public static  Node insert(Node head,int data) {
	        //Complete this method
		    Node node = new Node(data);
		    //System.out.println("===="+data);
		   if(head != null){
			   
			   Node lastNode = nextIsNull(head);
			   lastNode.next = node;
			   
			   return head;
		   }
		   
		   
	       
	       return node;
		   
	    }
	 
	 private static Node nextIsNull(Node head){
		 
		 while(head.next != null){
			 return nextIsNull(head.next);
		 }
		 return head;
	 }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }

}

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}
