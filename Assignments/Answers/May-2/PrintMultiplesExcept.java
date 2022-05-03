import java.util.*;
public class PrintMultiplesExcept
{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     int start=sc.nextInt();
     int end=sc.nextInt();
     int N=sc.nextInt();
     for(int i=start;i<=end;i++)
     {
          if(i%N!=0) System.out.print(i+" ");
     }
   }
}
