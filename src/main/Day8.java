package main;

import java.util.*;

public class Day8 {
	
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Map<String, Integer> m = new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            m.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            Integer number = m.get(s);
            //String strnumber = number != null ? number+"" : "Not found.";
            if(number != null){
            	System.out.println(s+"="+number);
            }else{
            	System.out.println("Not found");
            }
        }
        in.close();
    }

}
