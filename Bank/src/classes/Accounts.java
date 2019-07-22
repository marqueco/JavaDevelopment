

package classes;

import java.util.Scanner;

public class Accounts {

	public static void main(String[] args) {
		
		Account account1 = new Account("Anna", 1000.0);
		Account account2 = new Account("Yordan", 2000.0);

	}
	
	public static void printMenu() {
		Scanner reader = new Scanner(System.in);
		String resposta = "";
		System.out.println("Bon dia");
		System.out.println("Quina operació voleu fer? (credit, transfer, retirada o diposit)");
		resposta += reader.nextLine();
	

	if (resposta.equals("diposit") {
		
	}
	public static void transfer(Account from, Account to, double amount) {
		System.out.println(from.getBalance());
		
	}

	public static boolean personalCredit() {
		if (getBalance() > 1000.0) {
			return true;
		}
		return false;
	}

	// afegeix un mètode nou
	public static void isSaver () {
      if 

		
	}

}
