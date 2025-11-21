package assignment1;

public class Sixth {

	public static void main(String[] args) {
		try {
			throw new NetWorkTimeOutException("Network Error Detect....");
			
			
		} catch (NetWorkTimeOutException e) {
			System.out.println(e.getMessage());
			
		}
		
			catch (Exception e) {
				e.printStackTrace();
			}
		
		finally {
			System.out.println("Network Problem Solve");
		}

	}

}


@SuppressWarnings("serial")
class NetWorkTimeOutException extends Exception{

	public NetWorkTimeOutException(String str) {
		super(str);
	}
	
}
