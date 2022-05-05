import java.util.*;
public class PrimeInRange
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		for(int k=2;k<=number;k++)
		{
		    int num=k;
		    int flag=0;
		   for(int i=2;i<num;i++)
		   {
		      if(num%i==0)
		      {
		        flag=1;
		        break;
		      }
		   }
	     	if(flag==0) System.out.print(k+" ");

		}

	}
}
