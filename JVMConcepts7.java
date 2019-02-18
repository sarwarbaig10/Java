import java.io.*;
public class JVMConcepts7
{
public static void main(String []args)throws IOException 
     {
        int num=5,f;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        num=Integer.parseInt(br.readLine());
        JVMConcepts7 obj =new JVMConcepts7();
        f=obj.fact(num);
        System.out.println("The factorial of number entered is " + f);
     }
     int fact(int n)
     {
         if (n != 0)
            return n * fact(n-1); 
        else
            return 1;
     }
}
