package advanced;

@SuppressWarnings("serial")
public class invalidDayException extends Exception {

	public invalidDayException() {
		super("Wrong Day");
	}
	
	public invalidDayException(String str) {
		super(str);
	}
	
}
