import java.io.*;
abstract class Instruments
{
	abstract void play();
	
}
class Piano extends Instruments
{
	void play()
	{
		System.out.println("the Piano is playing tan tan tan");
	}
}
class Flute extends Instruments
{
	void play()
	{
		System.out.println("Flute is playing toot toot toot toot");
	}
	
}
class Guitar extends Instruments
{
	void play()
	{
		System.out.println("the Guitar is playing tin tin tin");
	}
	
}
public class ooc5 
{
	public ooc5() 
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Instruments[] arr=new Instruments[10];
		Instruments obj=new Piano();
		Instruments obj1=new Guitar();
		Instruments obj2=new Flute();
		arr[0]=obj1;
		arr[1]=obj2;
		arr[2]=obj2;
		arr[3]=obj;
		arr[4]=obj1;
		arr[5]=obj2;
		arr[6]=obj;
		arr[7]=obj1;
		arr[8]=obj2;
		arr[9]=obj1;
		for (int i = 0; i < 10; i++)
		{
			System.out.println(arr[i] instanceof Piano);
		}
		for (int i = 0; i < 10; i++)
		{
			System.out.println(arr[i] instanceof Guitar);
		}
		for (int i = 0; i < 10; i++)
		{
			System.out.println(arr[i] instanceof Flute);
		}		
	}
}
