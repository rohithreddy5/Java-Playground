import java.util.*;
public class StrongNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
        int original=num;
        int sum=0;
        while(num>0)
        {
            int d=num%10;
            int fact=1;
            while(d>0)
            {
                fact=fact*d;
                d--;
            }
            sum=sum+fact;
            num=num/10;
        }
        if(original==sum) System.out.println("Strong Number");
        else System.out.println("Not a Strong Number");

	}
}
