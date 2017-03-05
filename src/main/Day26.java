package main;

import java.util.*;


public class Day26 {

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		List<Integer> lst = new ArrayList<Integer>();
		for(int i=0;i<6;i++){
			lst.add(sc.nextInt());
		}
		Date returnDate = new Date(lst.get(0), lst.get(1), lst.get(2));
		Date expReturnDate = new Date(lst.get(3), lst.get(4), lst.get(5));

		int fine = calfine(returnDate, expReturnDate);
		System.out.print(fine);
	}

	private static int calfine(Date returnDate, Date expReturnDate) {
		int daydiff = returnDate.day-expReturnDate.day;
		int monthdiff = returnDate.month-expReturnDate.month;
		int yeardiff = returnDate.year-expReturnDate.year;
		if(yeardiff > 0){
			return 10000;
		}
		else if(yeardiff < 0){
			return 0;
		}
		else if (monthdiff > 0){
			return monthdiff * 500;
		}
		else if(monthdiff < 0){
			return 0;
		}
		else if (daydiff > 0){
			return daydiff * 15;
		}
		return 0;
	}
	


}


class Date{
	int day;
	int month;
	int year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
}


