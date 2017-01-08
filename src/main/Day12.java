package main;

import java.util.Scanner;


public class Day12 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}

}

class Person {
	
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}

}

class Student extends Person{
	

	private int[] testScores;
	
	public Student(String firstName, String lastName, int identification, int[] scores) {
		super(firstName, lastName, identification);
		testScores = scores;
	}
	
	public String calculate(){
		float avg = getAvarage(testScores);
		if(avg >=90 && avg <= 100 ){
			return "O";
		}else if(avg >=80 && avg < 90 ){
			return "E";
		}else if(avg >=70 && avg < 80 ){
			return "A";
		}else if(avg >=55 && avg < 70 ){
			return "P";
		}else if(avg >=40 && avg < 55 ){
			return "D";
		}else{
			return "T";
		}
	}

	private float getAvarage(int[] testScores) {
		int sum = 0;
		float avg = 0;
		for (int index = 0; index < testScores.length; index++)
		{
			sum = sum+testScores[index];
			
		}		
		avg = sum/testScores.length;
		
		return avg;
	}
   
}
