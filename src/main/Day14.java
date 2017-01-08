package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day14 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

}

class Difference {
	private int[] elements;
  	public int maximumDifference;
  	
  	public Difference(int[] a) {
  		elements = a;
	}

	public void computeDifference() {
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < elements.length; i++) {
			l.add(elements[i]);
		}
		
		Collections.sort(l);
		
		maximumDifference = l.get(l.size() - 1) - l.get(0);
	}
	
  	
}

