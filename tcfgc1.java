import java.lang.*;
import java.util.*;
import java.security.SecureRandom.*;
import java.io.*;
 class thread1 extends Thread
{
	 static int ran;
	
	 public void run()
	 {
		 ran=(int)(10*Math.random());
		 
		 System.out.println("the number randomly generated is :"+ ran);
	}
	
}
class thread2 extends thread1 implements Runnable
{
	int i,fact=1;
	//int	rand=ran;
	
	public void run()
	{
		System.out.println("the random number in thread 2 is :"+ ran);
		for ( i = 1; i <= ran; i++) 
		{
			fact=fact*i;
		}
		System.out.println("the Factorial is :"+ fact);
	}
}
public class tcfgc1
{
	
	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		
		thread1 t1=new thread1();
//		
		t1.start();
		Thread t2 = new Thread(new thread2());
		t2.start();
	}
}
