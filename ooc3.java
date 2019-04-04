import java.io.*;
class  Book1
{
    String isbn,title;
    int price;   
}
class magazine extends Book1
{
    String type;
   
    magazine(String isbn,String title,int price,String type)
        {
            this.isbn = isbn; 
            this.title =title;
            this.price =price;
            this.type= type;
            System.out.println("the isbn code is:"+this.isbn+" "+"the title of book is:"+this.title+" "+"the price of book is:"+this.price+" "+"the type of book is:"+this.type+" ");
        }
}
class novel extends Book1
{
    String author;
    novel(String isbn,String title,int price,String author)
        {
            this.isbn = isbn; 
            this.title =title;
            this.price =price;
            this.author =author;
            System.out.println("the isbn code is:"+this.isbn+" "+"the title of book is:"+this.title+" "+"the price of book is:"+this.price+" "+"the author of book is:"+this.author+" ");
        }
}
public class ooc3
{
    public static void main(String []args)throws IOException 
     {
         System.out.println("For this Magazine");
        magazine obj=new magazine("4223424322","Dasewq",675,"Fiction");
        System.out.println("For this Novel");
        novel obj1=new novel("4223424322","Dasewq",675,"Sadenawq");
    }
}
