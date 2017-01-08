package main;

import java.util.Scanner;

public class Day7 {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        for(int i=0; i < n; i++){
	            arr[i] = in.nextInt();
	        }
	        String s = "";
	        for(int i=n-1; i < n; i--){
	            s = s+arr[i]+" ";
	            if(i==0)
	            	break;
	        }
	        System.out.println(s);
	        in.close();
	    }

}
