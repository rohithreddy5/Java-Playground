import java.util.*;
public class PrimeNumberAverage
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array.");
		int size=sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int sum=0;
		int count=0;

		for(int i=0;i<size;i++)
		{
		    int flag=0;
		    if(arr[i]>1)
		    {
		        for(int j=2;j<arr[i];j++)
		        {
		            if(arr[i]%j==0)
		            {
		                flag=1;
		                break;
		            }
		        }
		    }
		    if(flag==0&&arr[i]!=1)
		    {
		        sum=sum+arr[i];
		        count++;
		    }
		}
		float average=(float)sum/count;
		for(int i=0;i<size;i++)
		{
		    int flag=0;
		    if(arr[i]>1)
		    {
		        for(int j=2;j<arr[i];j++)
		        {
		            if(arr[i]%j==0)
		            {
		                flag=1;
		                break;
		            }
		        }
		    }
		    if(flag==0&&arr[i]>average)
		    {
		        System.out.print(arr[i]+" ");
		    }
		}
	}
}
