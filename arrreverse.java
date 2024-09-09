
import java.util.*;
class arrreverse
{
    public static void main(String[] args) 
    {
        int[] arr={5,4,3,2,1};
        int max;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                max=arr[i];
                arr[i]=arr[j];
                arr[j]=max;
            }
        }
        System.out.println(""+Arrays.toString(arr));
    }
}