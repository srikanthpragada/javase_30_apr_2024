package oop2;


enum PaymentMode  {
	CASH, UPI, CARD
}

public class EnumDemo {

	public static void main(String[] args) {
		 PaymentMode payMode;
		 
		 payMode = PaymentMode.CARD;
		 
		 if(payMode == PaymentMode.CASH)
			 ;

	}

}
