import java.util.*;
public class AtleastOneEven
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    if(num1%2==0||num2%2==0)
         System.out.println("Yes");
    else
        System.out.println("No");
  }
}
