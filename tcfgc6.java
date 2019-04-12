import java.io.*;
public class tcfgc6
{ 
    public static void main(String[] args) throws InterruptedException 
    { 
    	 // requesting JVM for running Garbage Collector 
    } 
      
     protected void finalize() throws Throwable 
    { 
    	System.out.println("Finalize Method called");
        System.out.println("Garbage collector called"); 
    } 
} 
class AnotherClass
{
	tcfgc6 a1,a2;
	{
	a1=new tcfgc6();
	a2=new tcfgc6();
	 a1 = null; // Nullifying the reference variable
	 Runtime.getRuntime().gc(); // requesting JVM for running Garbage Collector 
      
     a2 = null; // Nullifying the reference variable 
     Runtime.getRuntime().gc(); 
	}
}
