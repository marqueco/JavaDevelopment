package PAC3;

import java.util.Scanner;

public class Start {

	Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("***********");
		System.out.println("* PERíMETRES  *");
		System.out.println("***********");
		System.out.println("");
		printMenu();
		System.out.println("");

		while (true) {
			System.out.println("Quin perímetre vols calcular?");
			String command = reader.nextLine();
			if (command.equals("quit")) {
				break;
			}
			if (command.equals("triangle")) {
				System.out.println("Introdueix el costat 1: ");
				int number1 = Integer.parseInt(reader.nextLine());
				System.out.println("Introdueix el costat 2: ");
				int number2 = Integer.parseInt(reader.nextLine());
				System.out.println("Introdueix el costat 3: ");
				int number3 = Integer.parseInt(reader.nextLine());
				System.out.println("El perímetre és de " + perimetreTriangle(number1,number2,number3) + "\n");
				printMenu();
				
			} else if (command.equals("rectangle")) {
				System.out.println("Introdueix el costat 1: ");
				int number1 = Integer.parseInt(reader.nextLine());
				System.out.println("Introdueix el costat 2: ");
				int number2 = Integer.parseInt(reader.nextLine());
				System.out.println("El perímetre és de " + perimetreRectangle(number1,number2) + "\n");
				printMenu();
				
				perimetreRectangle(number1,number2);
				
			} else if (command.equals("quadrat")) {
				System.out.println("Introdueix el costat: ");
				int number1 = Integer.parseInt(reader.nextLine());
				System.out.println("El perímetre és de " + perimetreQuadrat(number1) + "\n");
				printMenu();
				
				perimetreQuadrat(number1);

				
		
			}
			}
	}
	
	public static void printMenu() {
		System.out.println(" * menu *");
		System.out.println("surt - tanca el programa");
		System.out.println("Introdueix el perímetre a calcular (triangle, rectangle o quadrat).");

	}
	
	public static int perimetreTriangle (int number1, int number2, int number3) {
		return number1 + number2 + number3;
	}
	
	public static int perimetreQuadrat (int number1) {
		return number1 * 4;
	}
	
	public static int perimetreRectangle (int number1, int number2) {
		return (number1*2) + (number2*2);
	}
}

