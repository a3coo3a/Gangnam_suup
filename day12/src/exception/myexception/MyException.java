package exception.myexception;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;			// 없어도 실행시 문제가 되지 않음.
	
	// 사용자 예외 클래스는 기본 생성자, 메시지를 받는 생성자를 만듭니다.
	public MyException() {

	}
	public MyException(String message) {
		super(message);
	}
	@Override
	public String getMessage() {
		System.out.println(".......");
		
		return super.getMessage();
	}
	
	//............부가코드 작성가능

}
