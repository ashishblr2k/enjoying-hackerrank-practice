package main;


import java.util.Scanner;

public class Day29 {

	
	/*public static void main(String args[])
	{
		System.out.println(Integer.toBinaryString(122));
		int i = Integer.parseInt(Integer.toBinaryString(122));
		System.out.println(Integer.toBinaryString(132));
		int j = Integer.parseInt(Integer.toBinaryString(132));


		String  ss = String.valueOf(i&j);
		System.out.println(ss);
		int foo = Integer.parseInt(ss, 2);
		System.out.println(foo);
	}*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();

		for (int i = 0; i < testCases; i++) {
			System.out.println(findMaxBitwiseAnd(sc.nextInt(), sc.nextInt()));
		}
	}

	private static int findMaxBitwiseAnd(int n, int k) {
		int max = 0;

		for (int a = 1; a < n; a++) {
			for (int b = a+1; b < n+1; b++) {
				int result = a & b;
				if (result > max && result < k)
					max = result;
			}
		}

		return max;
	}


}


