package assignment1;

public class Fifteen {

	public static void main(String[] args) {

		try {
			boolean noWater = true;
			if (noWater) {
				throw new WaterNotAvailableException("Water not available");
			}
			System.out.println("Water is available");
		} catch (WaterNotAvailableException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

@SuppressWarnings("serial")
class WaterNotAvailableException extends Exception {
	
	
	public WaterNotAvailableException() {
		super("Hiiiii");
	}

	public WaterNotAvailableException(String message) {
		super(message);
	}
	
	
}
