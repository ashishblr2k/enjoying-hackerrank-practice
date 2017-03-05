package main;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Day24 {

	public static  Node3 insert(Node3 head,int data)
	{
		Node3 p=new Node3(data);			
		if(head==null)
			head=p;
		else if(head.next==null)
			head.next=p;
		else
		{
			Node3 start=head;
			while(start.next!=null)
				start=start.next;
			start.next=p;

		}	
		return head;
	}
	public static void display(Node3 head)
	{
		Node3 start=head;
		while(start!=null)
		{
			System.out.print(start.data+" ");
			start=start.next;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Node3 head=null;
		int T=sc.nextInt();
		while(T-->0){
			int ele=sc.nextInt();
			head=insert(head,ele);
		}
		head=removeDuplicates(head);
		display(head);

	}

	public static Node3 removeDuplicates(Node3 head) {
		//Write your code here
		Set<Integer> s = new TreeSet<Integer>();
		Node3 start = head;
		while(start!=null){
			s.add(start.data);
			start = start.next;
		}
		Node3 headnew = null;
		
		for(int i=0; i < s.size(); i++){
			headnew = insert(headnew, (Integer)s.toArray()[i]);
		}
		
		return headnew;
	}

}

class Node3{
	int data;
	Node3 next;
	Node3(int d){
		data=d;
		next=null;
	}

}
