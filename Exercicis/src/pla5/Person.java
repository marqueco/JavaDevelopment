package pla5;
import java.util.Scanner;

public class Person {
	
	private String name;
	private int age;
	private int height;
	private int weight;
	private String occupation;
	private String education;
	private int contribution;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = 0;
		this.weight = 0;
		this.height = 0;
		this.occupation = "";
		this.education = ""; 
		this.contribution = 0;
		
		
	}
	
	public void printPerson() {
		System.out.println(this.name + " is " + this.age + " years old.");
	}
	
	public void becomeOlder() {
		this.age++;
	}
	
	public boolean isAdult() {
		if (this.age < 18) {
			return false;
		}
		return true;
	}
	
	public boolean isActive() {
		if (this.occupation == "") {
			return false;
		}
		return true;
	}
	
	public double bodyMassIndex() {
		double heightInMeters = this.height * 1.0;
		double weightInKg = this.weight * 1.0;
		
		return weightInKg / Math.pow(heightInMeters, 2);
	}

	public String toString() {
	
		return "Information under entry " + this.name + ": age(" + this.age + "); BMI(" + bodyMassIndex() + "). " + this.name + " is " + getEducation() + " and is " + isActive() + " currently working";
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getContribution() {
		return this.contribution;
	}
	
	public String getEducation(String name) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Do you hold a degree? What is it?");
		String education = reader.nextLine(); 
		return education;
	}
	public void setWeight() {
		Scanner reader = new Scanner(System.in);
		this.weight = Integer.parseInt(reader.nextLine());
	}
	
	public void setHeight() {
		this.height = height;
	}
	
	public static void main(String[] args) {
		Person lupe = new Person("Lupe", 67);
		
		getEducation(lupe);
		
		System.out.println( lupe );
		
		lupe.becomeOlder();
		
		System.out.println( lupe );
	}
}
