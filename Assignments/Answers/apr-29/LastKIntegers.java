import java.util.*;
public class LastKIntegers
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
    for(int i=size-k;i<size;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}
