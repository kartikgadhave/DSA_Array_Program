import java.util.Scanner;
import java.util.Arrays;
class arrremoveduplicate
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size of array :");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter a Array : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int index=0;
        int[] arr2=new int[size];
        for(int i=0;i<size-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr2[index]=arr[i];
                index++;
            }
        }
        arr2[index]=arr[size-1];
        index++;
        int[] arr3=new int[index];
        for(int i=0;i<index;i++)
        {
            arr3[i]=arr2[i];
        }
        System.out.println(""+Arrays.toString(arr3));
    }
}