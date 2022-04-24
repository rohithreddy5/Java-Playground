import java.util.*;
public class PrimeNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int flag=0;
		for(int i=2;i<num;i++)
		{
		   if(num%i==0)
		   {
		     flag=1;
         break;
		   }
		}
	  if(flag==1) System.out.print("Not a Prime Number");
    else System.out.println("Prime Number");

		}

}
