class MyAgeException extends Exception{
   int age1;
   MyAgeException(int age2) {
	age1=age2;
   }
   public String toString(){ 
	return ("Age is not within the limit") ;
   }
}

class esc1
{
   public static void main(String args[])
   { 
	   try 
	   {
		int age = Integer.parseInt(args[0]);
			try 
			{
				if (age < 18 || age > 59)
					throw new MyAgeException(age);
				else
					System.out.println("the age is :"+ age);
			 }
			catch (MyAgeException exp)
			{
				System.out.println("Catch Block");
				System.out.println(exp);
			}
	    } 
	   catch (NumberFormatException e) 
	   {
		// TODO: handle exception
		System.out.println("Please enter only numbers.");
	   }
   }
}
