
import java.util.Scanner;
import java.util.Arrays;

class arrayserchinsertdelete
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the size of number : ");
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        
        System.out.println("Enter the element in the array ...");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(" original string " +Arrays.toString(arr));
        
        //search element into array 

        System.out.println(" Enter a element to find :- ");
        int tofind=sc.nextInt();
        boolean found=false;
        for(int c:arr)
        {
            if(tofind == c)
            {
                found=true;
                break;
            }
        }
        if(found)
        {
            System.out.println("Element is present in the array");
        }
        else
        {
            System.out.println("Element is not present in the array");
            
        }

        //insert the element into array
        System.out.println("Enter the element you have to insert in array :-");
        int ele=sc.nextInt();
        System.out.println("Enter the position of array : -");
        int pos=sc.nextInt();
        for(int i=n;i>pos;i--)
        {
                arr[i]=arr[i-1];

        }
        arr[pos]=ele;
        System.out.println("after operation array is : "+Arrays.toString(arr));
    }
}