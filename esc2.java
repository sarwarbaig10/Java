public class esc2
{
	public esc2() 
	{
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			String name1=args[0];
			int m11=Integer.parseInt(args[1]);
			int m12=Integer.parseInt(args[2]);
			int m13=Integer.parseInt(args[3]);
			String name2=args[4];
			int m21=Integer.parseInt(args[5]);
			int m22=Integer.parseInt(args[6]);
			int m23=Integer.parseInt(args[7]);
			
			double avg1,avg2;
			avg1=(m11+m12+m13)/3.0;
			avg2=(m21+m22+m23)/3.0;
			System.out.println("the average marks of "+name1+ "  is : "+ avg1);
			System.out.println("the average marks of "+name2+ "  is : "+ avg2);
		}
		catch (NumberFormatException e)
		{
			System.out.println("please enter numbers "+ e);
		}
	}
}
