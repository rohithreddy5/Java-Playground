import java.util.*;
public class UnitTenthDigitSum
{
   public static void main(String[] args)
   {
   Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    System.out.println((N%10)+(N/10)%10);
   }
}
