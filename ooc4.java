import java.io.*;
class Payment
{
	Double amt;
	void PaymentDetails()
	{
		System.out.println("The amount of payment is");
	}	
}

class CashPayment extends Payment
{
	public CashPayment()
	{
		// TODO Auto-generated constructor stub
	}
	public Double getAmt()
	{
		return amt;
	}
	public void setAmt(Double amt) 
	{
		this.amt = amt;
	}
	void PaymentDetails()
	{
		System.out.println("The payment is in Cash and amount is"+amt);
	}
}

class CreditCardPayment extends Payment
{
	String name,expirydate;
	Long creditcardnumber;
	public Double getAmt()
	{
		return amt;
	}
	public void setAmt(Double amt) 
	{
		this.amt = amt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public Long getCreditcardnumber() {
		return creditcardnumber;
	}
	public void setCreditcardnumber(Long creditcardnumber) {
		this.creditcardnumber = creditcardnumber;
	}
	
	public CreditCardPayment() 
	{
		// TODO Auto-generated constructor stub
	}
	void PaymentDetails()
	{
		System.out.println("The amount of payment  using Credit Card is "+ amt);
		System.out.println("The name on Card is : " +name+"  The Expiry Date on Card is : "+expirydate+" The card number is :" +creditcardnumber);
		}
}
public class ooc4 
{
	public static void main(String[] args) 
	{
		System.out.println("this is for 1st cash payment");
		CashPayment obj1=new CashPayment();
		obj1.setAmt(653.00);
		obj1.PaymentDetails();
		System.out.println("this is for 2nd cash payment");
		CashPayment obj2=new CashPayment();
		obj2.setAmt(663.00);
		obj2.PaymentDetails();
		System.out.println("this is for 1st credit card payment");
		CreditCardPayment obj3=new CreditCardPayment();
		obj3.setAmt(4532.87);
		obj3.setName("Gabon Matthew");
		obj3.setCreditcardnumber(56743673467l);
		obj3.setExpirydate("23/09/2023");
		obj3.PaymentDetails();
		System.out.println("this is for 2nd Credit Card payment");
		CreditCardPayment obj4=new CreditCardPayment();
		obj4.setAmt(4567.87);
		obj4.setName("Gabon Larson");
		obj4.setCreditcardnumber(5675678673467l);
		obj4.setExpirydate("23/06/2023");
		obj4.PaymentDetails();
		
	}
}
