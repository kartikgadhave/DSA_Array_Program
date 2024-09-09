import java.util.Arrays;
import java.util.Scanner;
class arrdeletenegative
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :- ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array :- ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int index=0;
        int[] arr2=new int[n];
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                arr2[index]=arr[i];
                index++;
            }
        }
        
        int[] arr3=new int[index];
        for(int i=0;i<index;i++)
        {
            arr3[i]=arr2[i];
        }
        System.out.println(""+Arrays.toString(arr3));
        int mid=arr3.length;
        mid=(mid-1)/2;
        System.out.println(""+arr3[mid]);
    }
}