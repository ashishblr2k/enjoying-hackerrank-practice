package main;

import java.util.Scanner;

public class Day19 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new CalculatorDay19(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
	
}

interface AdvancedArithmetic{
	   int divisorSum(int n);
	}

class CalculatorDay19 implements AdvancedArithmetic{

	@Override
	public int divisorSum(int n) {
		int divisorSum = 0;
		for(int i = 1; i <=n; i++){
			if(n % i == 0){
				divisorSum += i;
			}
		}
		return divisorSum;
	}
	
}