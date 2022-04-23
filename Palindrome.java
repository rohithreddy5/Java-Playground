import java.util.*;
public class Palindrome
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        int original=num;
        while(num>0)
        {
         int d=num%10;
         rev=rev*10+d;
         num=num/10;
        }
        if(original==rev)  System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
	}
}
