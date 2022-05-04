import java.util.*;
public class OddEvenAverage
{
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<size;i++)
     {
       arr[i]=sc.nextInt();
     }
    float evenSum=0f;
    float oddSum=0f;
    int evenCount=0;
    int oddCount=0;
    for(int i=0;i<size;i++)
     {
	   if(arr[i]%2==0)
		  {
		    evenSum=evenSum+arr[i];
		    evenCount++;
		  }
	    if(arr[i]%2!=0)
	      {
	          oddSum=oddSum+arr[i];
	          oddCount++;
	      }
     }
     System.out.printf("The Even Average is:"+" "+"%.2f"+"\n",evenSum/evenCount);
     System.out.printf("The Odd Average is:"+" "+"%.2f",oddSum/oddCount);
   }
}
