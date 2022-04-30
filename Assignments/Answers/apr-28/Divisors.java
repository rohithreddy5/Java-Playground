import java.util.*;
public class Divisors
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
    int num=sc.nextInt();
    for(int i=0;i<size;i++)
    {
      if(arr[i]%num==0) System.out.print(arr[i]+" ");
    }
  }
}
