import java.util.*;
public class HarshadNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
    	int sum=0;
    	int number=num;
    	while(num>0)
	    {
	      sum=sum+(num%10);
	      num=num/10;
       	}
	   if(number%sum==0)  System.out.println("Harshad number");
       else System.out.println("Not an Harshad number");

	}
}
