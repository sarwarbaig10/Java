import java.io.*;
import java.util.*;
public class tcfgc2 extends Thread
{
	public void run()
	{
		System.out.println("The current time is : "+java.time.LocalTime.now()); 
	}

	public static void main(String[] args) throws InterruptedException,IllegalThreadStateException
	{
		// TODO Auto-generated method stub
		
		long i;
		long t= System.currentTimeMillis();
		long end = t+20000;
		for(i=t;i<end;i=i+2000)
		{
			tcfgc2 t1=new tcfgc2();
			t1.start();
			t1.sleep(2000);
		}
		System.out.println("The program ended successfully");
	}
}
