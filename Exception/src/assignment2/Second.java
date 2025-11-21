package assignment2;
class Second{
    public static void main(String[] args) {
        try {
            withdraw(3000, 2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void withdraw(int amount, int balance) throws LowBalanceException {
        if (amount > balance)
            throw new LowBalanceException("Insufficient balance! Balance: " + balance);
        else
            System.out.println("Withdrawal successful! Remaining: " + (balance - amount));
    }
}

@SuppressWarnings("serial")
class LowBalanceException extends Exception {
	public LowBalanceException(String str) {
		super(str);
	}

	
}