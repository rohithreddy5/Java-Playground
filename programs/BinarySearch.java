import java.util.*;
public class BinarySearch
{
     public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int size=sc.nextInt();
         int arr[]=new int[size];
         for(int i=0;i<size;i++)
         {
             arr[i]=sc.nextInt();
         }
         int key =sc.nextInt();
         int first=0;
         int last=size-1;
         int mid = (first + last)/2;
         while(first <= last) 
         {

            if ( arr[mid] < key )
            {
                 first = mid + 1;
            }
            else if ( arr[mid] == key )
            {
                 System.out.println("Element is found at index: " + mid);
                 break;
            }
            else
            {
                last = mid - 1;
            }
            mid = (first + last)/2;
         }
         if ( first > last )
         {

          System.out.println("Element is not found!");

         }
     }
     //11
     //1 2 3 4 5 6 7 8 9 10 11   //values
     //0 1 2 3 4 5 6 7 8 9  10   //index
     //first=0        last=10
     //first=mid+1    last=10
     //first=0        last=mid-1
     //15

     //mid=0+10/2=5;
     //arr[mid]=6;
     //6<15   first=mid+1=6    last=10
     //mid=9   arr[9]=10
     //10<15  first=mid+1=10   last=10
     //mid=10+10/2=10   arr[10]=11
     //11<15 first=mid+1=10+1=11  last=10
     //mid=10
}
