package main;

import java.util.*;


public class Day25 {

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
			int ele=sc.nextInt();
			isPrimeNumber(ele);
		}
		
	}

	private static void isPrimeNumber(int ele) {
		if(ele == 1){
			System.out.println("Not prime");
		}else{
		int temp;
		boolean isPrime=true;
		int num = ele;
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		//If isPrime is true then the number is prime else not
		if(isPrime)
		   System.out.println("Prime");
		else
		   System.out.println("Not prime");
	}
	}
	

}


