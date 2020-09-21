package quiz02;

public class Account {
	String name;
	String password;
	int balance;
	
	Account(){}
	Account(String aName, String aPassword, int aBalance){
		name = aName;
		password = aPassword;
		balance = aBalance;
	}
	void deposit(int money) {
		balance += money;
	}
	void withDraw(int money) {
		balance -= money;
	}
	int getBalance() {
		return balance;
	}
	
}
