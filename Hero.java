package Automobile.TwoWheeler;

public class Hero extends  Automobile.Vehicle 
{
	public String modelName()
	{
		return "Bs 4 Hero Bike";
	}
	public String registrationNumber()
	{
		return "CH 02 3267";
	}
	public String ownerName()
	{
		return "Mr. Ghjsdj dchjk";
	}
	public int speed()//Returns the current speed of the vehicle.
	{
		return 56;
	}
	public void radio()//provides facility to control the radio device
	{
		System.out.println("The radio is being controlled");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Hero obj=new Hero();
		String mn,rn,on;
		int sp;
		mn=obj.modelName();
		rn=obj.registrationNumber();
		on=obj.ownerName();
		sp=obj.speed();
		System.out.println("Model name is:" +mn);
		System.out.println("Regn Number is : "+ rn);
		System.out.println("Owner Name is : "+on);
		System.out.println("Speed of Vehicle :"+ sp);
		obj.radio();
		
	}
}
