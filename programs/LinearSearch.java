import java.util.*;
public class LinearSearch
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int position=0;
		int flag=0;
		for(int i=0;i<size;i++)
		{
		   if(x==arr[i])
		   {
		       flag=1;
		       position=i+1;
		   }

		}
		if(flag==1) System.out.println("Element Found at position "+position);
		else System.out.println("Element Not Found");

	}
}
