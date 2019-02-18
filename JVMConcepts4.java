import java.io.*;
public class JVMConcepts4
{
   public static void main(String []args)throws IOException 
     {
        int num=5;
        String mon;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        num=Integer.parseInt(br.readLine());
        switch (num)
        {
        case 1: mon="January";
                break;
         case 2: mon="February";
                break;
         case 3: mon="March";
                break;
         case 4: mon="April";
                break;
         case 5: mon="May";
                break;
         case 6: mon="June";
                break;
         case 7: mon="July";
                break;
         case 8: mon="August";
                break;
         case 9: mon="September";
                break;
         case 10: mon="October";
                break;
        case 11: mon="November";
                break;
         case 12: mon="December";
                break;
         default: mon="Inavlid";
                break;
        }
        System.out.println("The month is " + mon);
     }
}
