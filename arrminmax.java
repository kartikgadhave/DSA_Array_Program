import java.util.Arrays;

class arrminmax 
{
    public static void main(String args[]) 
    {
        
        int[] arr = {1, 2, 3, 4, 5};
        int n=arr.length;
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        
        
    }
}
