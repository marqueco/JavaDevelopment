package birding;

import java.util.Scanner;

public class Utils {
	
	public static String ask(Scanner reader, String option) {
		
		System.out.println(option);
		
		option = reader.nextLine();
		
		return option;
		
	}

		public static void add(Scanner reader, BirdDB db) {
			
			String name = askForName(reader);
			String latinName = askForNameLatin(reader);
			
			Bird bird = new Bird(name, latinName, 0);
			
			if (isBirdInDB(name, db)) {
				db.addBird(bird);
				
			}
		}
		
		public void loop(Scanner reader) {
			
			MenuOptions options = new MenuOptions();
			
			while (true) {
				String command = utils.ask(this.reader, "Option?");

				if (command.equals("Afegeix")) {
					Utils.add(this.reader,db);
				} else if (command.equals("Observació")) {
					Utils.observation(this.reader, db);
				} else if (command.equals("Mostra")) {
					Utils.mostra(this.reader, db);
				} else if (command.equals("Estadística")) {
					Utils.stadistica(this.reader, db);
				}
			}
		}
}
