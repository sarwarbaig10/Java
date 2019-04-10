package Automobile.TwoWheeler;

public class Honda extends  Automobile.Vehicle 
{
	public String modelName()
	{
		return "Bs 4 Honda Bike";
	}
	public String registrationNumber()
	{
		return "CH 08 3267";
	}
	public String ownerName()
	{
		return "Mr. Ghjsdj dchjk";
	}
	public int speed()//Returns the current speed of the vehicle.
	{
		return 56;
	}
	public int cdplayer() //provides facility to control the radio device
	{
		return 1;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Honda obj=new Honda();
		String mn,rn,on;
		int sp,cp;
		mn=obj.modelName();
		rn=obj.registrationNumber();
		on=obj.ownerName();
		sp=obj.speed();
		cp=obj.cdplayer();
		System.out.println("Model name is:" +mn);
		System.out.println("Regn Number is : "+ rn);
		System.out.println("Owner Name is : "+on);
		System.out.println("Speed of Vehicle :"+ sp);
		if(cp==1)
		System.out.println("The radio is being controlled");
		else
			System.out.println("The radio is not being controlled");		
	}
}
