package laBanca;

public class Account {
	
	private String owner;
	private double balance;
	private double saldo;
	
	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdrawal(double amount) {
		this.balance -= amount;
	}
	
	public void transfer(Account from, Account to, double amount) {
		from.withdrawal(amount);
		to.deposit(amount);
		
	}
	
	////// mètodes afegits 
	
	public static boolean personalCredit() {
		if (this.balance > 1000.0) {
			return true;
		}
	      return false;
	}
	
	public static boolean vipClient() {
		double saldo = this.balance;
		if (saldo > 100000.0) {
			return true;
		}
	      return false;
	}

///// getters i setters
	
	public double getBalance() {
		return this.balance;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Owner: " + this.owner + " balance: " + this.balance;
	}
}





