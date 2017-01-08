package main;

import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			String s = sc.next();
			char[] c = s.toCharArray();
			String es = "";
			String os ="";
			for(int j=0; j<s.length();j++){
				if(j%2==0){
					es = es+c[j];	
				}else{
					os = os+c[j];
				}
				
			}
			System.out.println(es +" "+os);
		}
		sc.close();

	}

}
