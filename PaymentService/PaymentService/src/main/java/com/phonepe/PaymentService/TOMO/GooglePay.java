

package com.phonepe.PaymentService.TOMO;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class GooglePay implements Payment_Interface {

	
	public void doPayment() {
	
		System.out.println("payment done using the Google Pay!");
	}

	public GooglePay()
	{
		System.out.println("Google Pay Object created!!!!");
	}
}
=======

package com.phonepe.PaymentService.TOMO;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class GooglePay implements Payment_Interface {

	
	public void doPayment() {
	
		System.out.println("payment done using the Google Pay!");
	}

	public GooglePay()
	{
		System.out.println("Google Pay Object created!!!!");
	}
}
>>>>>>> 63c9a72c4665ebb4fb2df84f518c73245e2af3d0
