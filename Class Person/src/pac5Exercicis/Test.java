package pac5Exercicis;

public class Test {
	public static void main(String[] args) {
		Person lupe = new Person("Lupe", 67);
		Person albert = new Person("Albert", 83, "doctor", 2);
		Person albertet = new Person("Albert", 32, 65, 175);

		System.out.println(lupe);
		System.out.println(albert);
		System.out.println(albertet);
		
		lupe.becomeOlder();
		
		
		System.out.println(lupe);

	}
}


//// He fet tres constructors diferents però no entenc perquè només en funciona un 
/// (el de String name, int age, int height, int weight és el que funciona).