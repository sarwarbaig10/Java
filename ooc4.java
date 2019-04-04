import java.io.*;
class Document
{
	String text;
	public String toString()
	{
		return text;	
	}	
	
}
class Email extends Document
{
	String sender,recipient,title;
	/**
	 * @return the sender
	 */
	public String getText() 
	{
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text)
	{
		this.text = text;
	}
	public String getSender()
	{
		return sender;
	}

	public void setSender(String sender) 
	{
		this.sender = sender;
	}
	public String getRecipient()
	{
		return recipient;
	}
	public void setRecipient(String recipient) 
	{
		this.recipient = recipient;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String toString()
	{
		text=sender+"  "+recipient+" "+title+"  "+text;
		return text;
	}
}
public class ooc4 
{
	public static void main(String[] args) 
	{
		//Document obj=new Document();
		String msg;
		Email obj1=new Email();
		obj1.setText("I want to exchange");
		obj1.setRecipient("Flipkart.com");
		obj1.setSender("jamal@gmail.com");
		obj1.setTitle("Exchange of Products");	
		msg=obj1.toString();
		System.out.println("The message is :"+msg);
	}
}
