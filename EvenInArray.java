import java.util.*;
public class EvenInArray
{
   public static void main(String[] args)
   {
      int arr[]=new int[10];
      for(int i=0;i<10;i++)
      {
        arr[i]=sc.nextInt();
      }
      for(int i=0;i<10;i++)
      {
        if(arr[i]%2==0)System.out.print(arr[i]+" ");
      }
   }
}
