package assignment2;

public class Seventh {

    public static void main(String[] args) {
        try
        {
            throw new DataSyncFailureException();
        } 
        
        catch (DataSyncFailureException e) {
            System.out.println(e.getMessage());
        }
        
        catch (Exception e) 
        {
			System.out.println(e.getMessage());
		}
        finally 
        {
            System.out.println("Heellooooooooooooooo.....");
        }
    }
}

@SuppressWarnings("serial")
class DataSyncFailureException extends RuntimeException {

	
	public DataSyncFailureException(String str) {
		super(str);
	}

	public DataSyncFailureException() {
        super("Data synchronization failed! Please retry the operation.");
    }
	
	
	
}
