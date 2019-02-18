import java.io.*;
public class  Book
{
    static int price,disc=10;
    static double finalprice;
    String isbn, title, author;
    Book( String isbn1, String title1,String author1, int price1)
            {
             isbn=isbn1;
             title=title1;
             author=author1;
             price=price1;
            }
     void displaydetails()
     {
         System.out.println("The details of the Book are ");
          System.out.println("Name of Book is "+ title);
          System.out.println("Author of Book is "+ author);
          System.out.println("ISBN of Book is "+ isbn);
          System.out.println("Price of the Book is "+ price);
     }
     static double  discountedprice(int disc)
     {
         return (0.90*price);
     }
     public static void main(String []args)throws IOException 
     {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        Book obj=new Book("978-3-16-148410-0"," Mr. J. G. Reeder Returns"," Hodder", 576);
        obj.displaydetails();
        finalprice=discountedprice(disc);
        System.out.println("The final price of the Book is "+finalprice);
     }
}
