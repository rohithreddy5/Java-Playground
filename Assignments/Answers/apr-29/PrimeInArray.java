import java.util.*;
public class PrimeInArray
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
		    if(arr[i]>1)
		    {
		        int flag=0;
		        for(int j=2;j<arr[i];j++)
		        {
		            if(arr[i]%j==0)
		            {
		              flag=1;
		              break;
		            }
		        }
		        if(flag==0)
		        {
		          System.out.print(arr[i]+" ");
		        }
		    }
		}




	}
}
