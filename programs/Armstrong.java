import java.util.*;
public class Armstrong
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
     	int sum=0;
    	int number=num;
	    while(num>0)
	    {
	    sum=sum+(num%10)*(num%10)*(num%10);
	    num=num/10;
	    }
    	if(number==sum)  System.out.println("Armstrong");
    	else System.out.println("Not an Armstrong");
	}
}
