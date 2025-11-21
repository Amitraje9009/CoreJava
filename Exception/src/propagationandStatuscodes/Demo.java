package propagationandStatuscodes;

public class Demo {

	public static void main(String[] args) {

		try {

			if (10 > 5) {
				throw new NotSundayException("No Off day", new Throwable("Today is Working day"), 300);
			}

		}

		catch (NotSundayException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getCode());
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

@SuppressWarnings("serial")
class NotSundayException extends Exception {

	int code;

	public NotSundayException(String abs, Throwable t, int code) {
		super(abs, t);
		this.code = code;
	}

	public int getCode() {
		return this.code;
	}

}
