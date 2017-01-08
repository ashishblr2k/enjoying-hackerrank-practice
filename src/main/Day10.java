package main;

import java.util.Scanner;

public class Day10 {
	
	public static void main(String args[]){
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        
	        String s = Integer.toBinaryString(n);
	        
	        System.out.println(s);
	        
	        int[] num = new int[s.length()];

	        for (int i = 0; i < s.length(); i++){
	            num[i] = s.charAt(i) - '0';
	        }
	        
	        
	        int maxLength = 0;
	        int tempLength = 0;
	        
	        for (int i = 0; i < num.length; i++) {
	        	if (num[i] == 1) {
	                tempLength++;
	            } else {
	                tempLength = 0;
	            }

	            if (tempLength > maxLength) {
	                maxLength = tempLength;
	            }
				
			}
	        
	        System.out.println(maxLength);
	}

}
