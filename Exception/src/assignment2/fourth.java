package assignment2;

public class fourth {

	public static void main(String[] args) {
		try {
			throw new FileMissingException("Important file is missing!");
		}
		
		catch (FileMissingException e) {
			System.out.println(e.getMessage());
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}

@SuppressWarnings("serial")
class FileMissingException extends Exception {
	
	public FileMissingException() {
		super();
	}

	FileMissingException(String str) {
		super(str);
	}
}
