public class esc3 
{
 public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			int num1,num2,num3,num4,num5;
			double avg;
			num1=Integer.parseInt(args[0]);
			num2=Integer.parseInt(args[1]);
			num3=Integer.parseInt(args[2]);
			num4=Integer.parseInt(args[3]);
			num5=Integer.parseInt(args[4]);
			avg=(num1+num2+num3+num4+num5)/5.0;
			System.out.println("The avg of 5 numbers :"+avg);
		}
		catch (ArrayIndexOutOfBoundsException e1) 
		{
			System.out.println("please enetr only 5 numbers :"+e1);
		}
		catch (NumberFormatException e2)
		{
			System.out.println("please enetr only numbers :"+e2);
		}
		catch (Exception e3)
		{
			System.out.println("Some exception occured :"+e3);
		}

	}
}
