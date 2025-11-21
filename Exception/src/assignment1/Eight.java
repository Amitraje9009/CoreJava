package assignment1;

public class Eight {

	public static void main(String[] args) {
		try {
			throw new EmailSendException("Unable To send message");
			
			
		}
		catch (EmailSendException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}


@SuppressWarnings("serial")
class EmailSendException extends Exception{
		public EmailSendException(String str) {
			super(str);
		}
}