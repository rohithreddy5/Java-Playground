import java.util.*;
public class ArrayCreation
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
        System.out.print(arr[i]+" ");
      }
   }
}
