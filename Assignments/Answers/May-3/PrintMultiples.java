import java.util.*;
public class PrintMultiples
{
   public static void main(String[] args)
   {
   Scanner sc=new Scanner(System.in);
   int M=sc.nextInt();
   int N=sc.nextInt();
   int X=sc.nextInt();
   for(int i=N;i>M;i--)
     {
       if(i%X==0) System.out.print(i+" ");
     }
   }
}
