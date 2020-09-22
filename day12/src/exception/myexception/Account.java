package exception.myexception;

public class Account {
	/*
	 * 1. 잔액(balance:long) 타입으로 멤버변수
	 * 2. deposit : 입금기능
	 * 3. withDraw : 출금기능
	 * 4. getBalnce() : 잔액확인 기능
	 *
	 * 단, widthDraw() 메서드에서 잔액이 출금보다 작다면 MyException을 발생시키는 코드 작성
	 */
	private long balance = 0;

	public Account() {
	}

	public Account(long balance) {
		this.balance = balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withDraw(int money) {
		try {
			if (balance < money) {
				throw new MyException("잔액이 " + money + "원보다 작습니다");	// 가까운 throws를 찾아 던져!
			}
			balance -= money;
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

	public void getBalnce() {
		System.out.println("현재 잔액은 " + balance + "원 입니다");
	}

}
