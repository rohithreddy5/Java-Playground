import java.util.*;
public class MinInArray
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int min=1000;
		for(int i=0;i<size;i++)
		{
		    if(arr[i]<min) min=arr[i];
		}
		System.out.println(min);



	}
}
