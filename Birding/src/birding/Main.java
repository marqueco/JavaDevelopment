package birding;

import java.util.Scanner;
import java.util.ArrayList;


public class Main {
	
	
	public static void main(String[] args) {
	
	BirdDB db = new BirdDB("birding");	
	
	Scanner reader = new Scanner(System.in);
	
	menu.loop(reader);
	
	}

}
