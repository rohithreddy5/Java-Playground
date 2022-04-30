import java.util.*;
public class CountOfPrimeInRange
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    int start=sc.nextInt();
    int end=sc.nextInt();
    int count=0;
    for(int i=start;i<=end;i++)
    {
  		    int num=i;
  		    int flag=0;
  		   for(int j=2;j<num;j++)
  		   {
  		      if(num%j==0)
  		      {
  		        flag=1;
  		        break;
  		      }
  		   }
  	     	if(flag==0) count++;
    }
    System.out.println(count);
	}
}
