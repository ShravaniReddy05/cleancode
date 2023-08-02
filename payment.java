package casestudy;

public class payment {
	public void makePayment()
	{
		System.out.println("Make payment for order placed");
	}
	public static void main(String[] args)
	{
		payment paymentObject=new payment();
		paymentObject.makePayment();
	}

}
