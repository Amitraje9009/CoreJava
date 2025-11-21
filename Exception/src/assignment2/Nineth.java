package assignment2;

public class Nineth {

	public static void main(String[] args) {
	
		        try {
		            
		            throw new InvalidConfigurationException("Invalid configuration for key....");
		        }
		        
		        catch (InvalidConfigurationException e) {
		            System.out.println(e.getMessage());
		        }
		        
		        catch (Exception e) {
					System.out.println(e.getMessage());
				}
		        
		    }
		} 

		@SuppressWarnings("serial")
		class InvalidConfigurationException extends RuntimeException {
			
			
		     public InvalidConfigurationException() {
				super();
			}

			 public InvalidConfigurationException(String str) {
		        super(str);
		    }
		}
