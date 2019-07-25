package pac5Exercicis;


public class Person {

	private String name;
	private int age;
	private int height;
	private int weight;
	private String occupation;
	private String education;
	private int children;
	private String housing;

	//////////////////////////////////////////////////// Constructors for class
	//////////////////////////////////////////////////// Person

	public Person(String name, int age) {
		this.name = name;
		this.age = 0;
	}

	public Person(String name, int age, String occupation, int children) {
		this.name = name;
		this.age = 0;
		this.occupation = occupation;
		this.children = 0;
	}

	public Person(String name, int age, int height, int weight) {

		this.name = name;
		this.age = age;
		this.weight = 0;
		this.height = 0;
		
	}

	///////////////////////////////////////////////////////////////////////// Methods
	///////////////////////////////////////////////////////////////////////// for
	///////////////////////////////////////////////////////////////////////// class
	///////////////////////////////////////////////////////////////////////// Person

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

	public double bodyMassIndex() {
		double heightInMeters = this.height * 1.0;
		double weightInKg = this.weight * 1.0;

		return weightInKg / Math.pow(heightInMeters, 2);
	}

	public String toString() {

		return "Information under entry " + this.name + ": age(" + this.age + "); BMI(" + bodyMassIndex() + "). "
				+ this.name + " is " + getEducation() + " and is " + isActive() + " currently working";
	}

	public boolean isActive() {
		if (this.occupation == "") {
			return false;
		}
		return true;
	}

	public boolean isParent() {
		if (this.children > 0) {
			return true;
		}
		return false;
	}
	
	public boolean isOwner() {
		if (housing == "owner") {
			return true;
		} else
			return false;
	}
	

	///////////////////////////////////////////////////////////////////// Getters
	///////////////////////////////////////////////////////////////////// and
	///////////////////////////////////////////////////////////////////// Setters
	///////////////////////////////////////////////////////////////////// for class
	///////////////////////////////////////////////////////////////////// Person

	public int getHeight() {
		return this.height;
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	public String getEducation() {
		return this.education;
	}
	
	public String getOccupation() {
		return this.occupation;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	//////////////////////////////////////////////////////////// Main for class
	//////////////////////////////////////////////////////////// Person

}