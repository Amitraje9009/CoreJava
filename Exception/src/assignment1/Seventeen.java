package assignment1;

public class Seventeen {

	public static void main(String[] args) {
		  try {
	            int battery = 5; 
	            if (battery < 10) {
	                throw new LowBatteryException("Battery too low.. Please charge.");
	            }
	            System.out.println("Battery Full..");
	        } 
	        catch (LowBatteryException e) {
	            System.out.println(e.getMessage());
	        } 
		  
		  catch (Exception e) {
			System.out.println(e.getMessage());
		}
	        finally {
	            System.out.println("Charger connected");
	        }

	}

}


@SuppressWarnings("serial")
class LowBatteryException extends RuntimeException {
	
    public LowBatteryException(String message) {
        super(message);
    }
}