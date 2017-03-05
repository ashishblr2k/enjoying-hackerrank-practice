package main;

import java.util.Scanner;

public class Day23 {
	
	static void levelOrder(Node2 root){
	      //Write your code here
		 int h = height(root);
	        int i;
	        for (i=1; i<=h; i++)
	            printGivenLevel(root, i);
	      
	    }
	
	static int height(Node2 root)
    {
        if (root == null)
           return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);
             
            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1); 
        }
    }
 
    /* Print nodes at the given level */
    static void printGivenLevel (Node2 root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }


	public static Node2 insert(Node2 root,int data){
	        if(root==null){
	            return new Node2(data);
	        }
	        else{
	            Node2 cur;
	            if(data<=root.data){
	                cur=insert(root.left,data);
	                root.left=cur;
	            }
	            else{
	                cur=insert(root.right,data);
	                root.right=cur;
	            }
	            return root;
	        }
	    }
		 public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
	        int T=sc.nextInt();
	        Node2 root=null;
	        while(T-->0){
	            int data=sc.nextInt();
	            root=insert(root,data);
	        }
	        levelOrder(root);
	    }

}

class Node2{
    Node2 left,right;
    int data;
    Node2(int data){
        this.data=data;
        left=right=null;
    }
}
