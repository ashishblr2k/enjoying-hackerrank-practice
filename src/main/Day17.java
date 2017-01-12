package main;

import java.util.Scanner;

public class Day17 {
	
	public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }

}

class Calculator{

	public int power(int n, int p) throws Exception {
		if(n < 0 || p < 0){
			throw new Exception("n and p should be non-negative");
		}
		if(p == 0){
			return 1;
		}else if(p == 1){
			return n;
		}else{
			int result = n;
			for(int i=0; i< p-1; i++ ){
				result = result * n;
			}
			return result;
		}		
	}
	
}
