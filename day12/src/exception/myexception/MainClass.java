package exception.myexception;

public class MainClass {

	public static void main(String[] args) {

		Account lee = new Account(1000);
		lee.deposit(1000);
		lee.getBalnce();

		lee.withDraw(1000);
		lee.getBalnce();

		lee.withDraw(2000);
		lee.getBalnce();

	}

}
