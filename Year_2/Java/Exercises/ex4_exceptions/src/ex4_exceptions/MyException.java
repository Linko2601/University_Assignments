package ex4_exceptions;

public class MyException extends Exception {

	public MyException() {
		super("������� �� ���� �� � ���������.");
	}

	public MyException(String s) {
		super(s);
	}
}