import java.util.*;
public class NthTermOfFibonacci
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int first=0,second=1,third;
		System.out.print(first+" "+second+" ");
		int i=2;
		while(i<num)
		{
		    third=first+second;
		    first=second;
		    second=third;
		    i++;
		}
    System.out.println(third);
	}
}
