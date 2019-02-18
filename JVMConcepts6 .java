public class JVMConcepts6 
{
  public static void main(String []args)
     {
        int i,max;
        int arr[]={45,1,33,11,1,334,1212,13,23,123};
        max=arr[0];
        for(i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("The highest number is :" +  max);  
     }
}
