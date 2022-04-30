import java.util.*;
public class PowerX
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int power=sc.nextInt();
    int result=1;
    for(int i=1;i<=power;i++)
    {
      result=result*2;
    }
    System.out.println(result);
  }
}
