import java.util.*; 

public class tcfgc4
{ 
    public static void main(String[] args) 
    { 
    	Scanner sc=new Scanner(System.in);
    	String str;
        HashMap<String, Integer> hash_map = new HashMap<String, Integer>(); 
  
        hash_map.put("Henriqyues", 45124787); 
        hash_map.put("Aaron", 8769874); 
        hash_map.put("Yusuf", 9874599); 
        hash_map.put("Jones", 8099304); 
        hash_map.put("Moses", 6587565); 
  
        
        System.out.println("Initial Mappings are: " + hash_map); 
        
        System.out.println("enter name whose number you need");
        str=sc.next();
        
        System.out.println("The Telephone number for the name " +str +"is : "+hash_map.get(str));       
    } 
} 
