import java.util.*;
class arrsecondlargest 
{
    public static void main(String[] args) 
    {
        int []arr = {12, 35, 1, 10, 34, 1};
        int size = arr.length;
        int max;

        for(int i = 0; i < size; i++) 
        {
            for(int j = i + 1; j < size; j++) 
            {
                if(arr[i] > arr[j]) 
                {
                    max = arr[i];
                    arr[i] = arr[j];
                    arr[j] = max; 
                }
            }
        }
        System.out.println("Second largest element is : " + arr[size-2]);
        System.out.println(""+Arrays.toString(arr));
    }
}
