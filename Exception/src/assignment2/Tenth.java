package assignment2;

public class Tenth {

	public static void main(String[] args) {

		try {
			String username = "_amit_raje_9171";
			int attempts = 6;
			int total_attemps = 5;
			if(attempts>total_attemps) {
			throw new UserAccountLockedException(
					"Account locked for user '" + username + "' after " + attempts + " failed attempts.");
		}
		}

		catch (UserAccountLockedException e) {
			System.out.println(e.getMessage());
		}

		finally {
			System.out.println("Delete your account and create new one");
		}
	}
}

@SuppressWarnings("serial")
class UserAccountLockedException extends RuntimeException {

	public UserAccountLockedException() {
		super();
	}

	UserAccountLockedException(String str) {
		super(str);
	}
}
