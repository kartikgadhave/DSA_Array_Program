import java.util.Scanner;
import java.util.Arrays;
class arrrotate
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the array :- ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();  
        }
        System.out.println("Enter the index you to break array :- ");
        int d=sc.nextInt();
        int index=0;
        int []arr2=new int[size];
        for(int i=d;i<size;i++)
        {
            arr2[index]=arr[i];
            index++;
        }
        for(int i=0;i<d;i++)
        {
            arr2[index]=arr[i];
            index++;
        }
        for (int i = 0; i < size; i++)
        {
            arr[i] = arr2[i];
        }
        System.out.print(""+Arrays.toString(arr));
    }
}