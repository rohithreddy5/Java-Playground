import java.util.*;
public class MultiplyArray
{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     int size=sc.nextInt();
     int arr[]=new int[size];
     for(int i=0;i<size;i++)
     {
           arr[i]=sc.nextInt();
     }
     int k=sc.nextInt();
     for(int i=0;i<size;i++)
     {
          arr[i]=arr[i]*k;
     }
     for(int i=0;i<size;i++)
     {
       System.out.println(arr[i]+" ");
     }
  }
}
